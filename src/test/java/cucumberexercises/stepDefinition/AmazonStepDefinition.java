package cucumberexercises.stepDefinition;

import cucumberexercises.utilities.ConfigReader;
import cucumberexercises.utilities.Driver;
import cucumberexercises.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class AmazonStepDefinition {


    @Given("kullanici amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        ReusableMethods.wait(1);
    }

    @Then("kullanici aramaKutusunda iphone aratir")
    public void kullaniciAramaKutusundaIphoneAratir() {
        Driver.getDriver().findElement(By.id("twotabsearchtextbox"))
                .sendKeys("iphone", Keys.ENTER);
        ReusableMethods.wait(1);
    }

    @And("sayfayi kapatir.")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }


    @And("sayfayi yeniler")
    public void sayfayiYeniler() {
        ReusableMethods.wait(2);
        Driver.getDriver().navigate().refresh();
    }

    @And("basligin iphone icerdigini test eder")
    public void basliginIphoneIcerdiginiTestEder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("iphone"));
    }

    @And("kullanici aramaKutusunda samsung aratir")
    public void kullaniciAramaKutusundaSamsungAratir() {
        Driver.getDriver().findElement(By.id("twotabsearchtextbox"))
                .sendKeys("samsung", Keys.ENTER);
        ReusableMethods.wait(1);
    }

    @And("basligin samsung icerdigini test eder")
    public void basliginSamsungIcerdiginiTestEder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("samsung"));
    }
}
