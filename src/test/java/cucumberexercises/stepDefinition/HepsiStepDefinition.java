package cucumberexercises.stepDefinition;

import cucumberexercises.pages.HepsiPages;
import cucumberexercises.utilities.ConfigReader;
import cucumberexercises.utilities.Driver;
import cucumberexercises.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class HepsiStepDefinition {

    HepsiPages hepsi = new HepsiPages();

    @Given("kullanici HepsiBurada sayfasina gider")
    public void kullaniciHepsiBuradaSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("hepsiBurada"));
        ReusableMethods.wait(2);
        hepsi.cerez.click();
        ReusableMethods.wait(2);
        hepsi.searchBoxHepsi.click();
        //  JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getDriver();
        // jsExecutor.executeScript("arguments[0].click();", hepsi.searchBox);
    }
    @Then("kullanici aramaKutusunda apple aratir")
    public void kullaniciAramaKutusundaAppleAratir() {
        //hepsi.searchBoxHepsi.sendKeys("apple", Keys.ENTER);
        //ReusableMethods.wait(2);
        ReusableMethods.sendKeysJS(hepsi.searchBoxHepsi, "apple");
        ReusableMethods.wait(2);
        hepsi.buton.click();
    }


}
