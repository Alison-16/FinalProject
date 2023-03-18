package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LearnTheFundamentalsPage {
    @FindBy(xpath = "/html/body/a")
    private WebElement fundamentalsReturnButton;
    @FindBy(xpath = "/html/body/h1")
    private WebElement fundamentalsHeader;
    public void clickOnFundamentalsReturnButton(){this.fundamentalsReturnButton.click();}
    public String returnFundamentalsHeaderText(){return fundamentalsHeader.getText();}
    public LearnTheFundamentalsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
