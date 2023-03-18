package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HybridPage {

    @FindBy(xpath = "/html/body/a")
    private WebElement hybridReturnButton;
    @FindBy(xpath = "/html/body/h1")
    private WebElement hybridHeader;

    public void clickOnHybridReturnButton() {
        this.hybridReturnButton.click();
    }
    public String returnHybriHeaderText () {return hybridHeader.getText();}

    public HybridPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}

