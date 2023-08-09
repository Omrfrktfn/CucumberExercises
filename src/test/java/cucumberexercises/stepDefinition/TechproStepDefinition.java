package cucumberexercises.stepDefinition;

import cucumberexercises.pages.TechproPages;
import cucumberexercises.utilities.ConfigReader;
import cucumberexercises.utilities.Driver;
import cucumberexercises.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class TechproStepDefinition {

    TechproPages techpro = new TechproPages();

    @Given("kullanici techpro sayfasina gider.")
    public void kullaniciTechproSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("techproUrl"));
        ReusableMethods.wait(1);
    }

    @Then("arama kutusunda qa aratir")
    public void aramaKutusundaQaAratir() {
        techpro.searchBox.sendKeys("qa", Keys.ENTER);
        ReusableMethods.wait(1);
    }

    @And("sayfa basliginin qa icerdigni test eder")
    public void sayfaBasligininQaIcerdigniTestEder() {
        Assert.assertFalse(Driver.getDriver().getTitle().contains("qa"));
    }


    @Then("arama kutusuna java aratir")
    public void aramaKutusunaJavaAratir() {
        techpro.searchBox.sendKeys("java", Keys.ENTER);
        ReusableMethods.wait(1);
    }

    @And("sayfa basliginin java icerdigni test eder")
    public void sayfaBasligininJavaIcerdigniTestEder() {
        Assert.assertFalse(Driver.getDriver().getTitle().contains("qa"));
    }

    @Then("arama kutusunda mobil aratir")
    public void aramaKutusundaMobilAratir() {
        techpro.searchBox.sendKeys("mobile");
        ReusableMethods.wait(1);
    }

    @When("cikan dropdownda mobil developer tiklar")
    public void cikanDropdowndaMobilDeveloperTiklar() {
        techpro.mobilDeveloper.click();
        ReusableMethods.wait(2);
    }

    @And("sayfa basliginin Mobile icerdigni test eder")
    public void sayfaBasligininMobileIcerdigniTestEder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Mobile"));
    }
}
