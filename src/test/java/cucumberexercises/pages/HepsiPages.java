package cucumberexercises.pages;

import cucumberexercises.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HepsiPages {
    public HepsiPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='searchBoxOld-M1esqHPyWSuRUjMCALPK']")
    public WebElement searchBoxHepsi;

    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    public WebElement cerez;

    @FindBy(xpath = "//div[@class='searchBoxOld-yDJzsIfi_S5gVgoapx6f']")
    public WebElement buton;


}
