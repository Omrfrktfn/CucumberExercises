package cucumberexercises.pages;

import cucumberexercises.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TechproPages {

    public TechproPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='searchHeaderInput']")
    public WebElement searchBox;

    @FindBy(xpath = "(//*[text()='Mobile Developer'])[3]")
    public WebElement mobilDeveloper;
}
