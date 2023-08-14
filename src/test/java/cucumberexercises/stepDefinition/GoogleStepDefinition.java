package cucumberexercises.stepDefinition;

import cucumberexercises.pages.GooglePages;
import cucumberexercises.utilities.ConfigReader;
import cucumberexercises.utilities.Driver;
import cucumberexercises.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDefinition {
    GooglePages google = new GooglePages();

    @Given("kullanici {string} sayfasina properties ile gider.")
    public void kullaniciSayfasinaPropertiesIleGider(String url) {

        Driver.getDriver().get(ConfigReader.getProperty(url));
        ReusableMethods.wait(1);
    }

    @When("kullanici google arama kutusudna {string} aratir")
    public void kullaniciGoogleAramaKutusudnaAratir(String arac) {
        google.cerez.click();
        ReusableMethods.wait(1);
        google.searchBox.sendKeys(arac, Keys.ENTER);
        ReusableMethods.wait(1);

    }


    @When("google sayfasinda basligin {string} icerdigini test eder")
    public void googleSayfasindaBasliginIcerdiginiTestEder(String baslik) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(baslik));
    }

}
