package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VirtualPage {
    @FindBy(xpath = "/html/body/a")
    private WebElement virtualReturnButton;
    @FindBy(xpath = "/html/body/h1")
    private WebElement virtualHeader;
    public void clickOnVirtualReturnButton() {
        this.virtualReturnButton.click();
    }
    public String returnVirtualHeaderText () {return virtualHeader.getText();}


    public VirtualPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


}
