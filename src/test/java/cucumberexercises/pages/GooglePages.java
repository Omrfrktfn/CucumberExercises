package cucumberexercises.pages;

import cucumberexercises.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePages {

    public GooglePages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//textarea[@id='APjFqb']")
    public WebElement searchBox;


    @FindBy(xpath = "//*[text()='Tümünü kabul et']")
    public WebElement cerez;



}
