package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement emailField;

    public WebElement getEmailField() {
        return emailField;
    }

    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement submitButton;
    @FindBy(xpath = "/html/body/nav/div/a")
    private WebElement mainPageHeader;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private WebElement virtualReadMoreButton;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/a")
    private  WebElement hybridReadMoreButton;
    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[1]/a")
    private WebElement whatYoullLearnButton;
    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/h2")
    private WebElement learnTheFundamentalsHeader;

    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/a")
    private WebElement learnTheFundamentalsReadMoreButton;
    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement startTheEnrollmentButton;
    @FindBy(xpath = "/html/body/footer/div/p")
    private WebElement mainPageBottomHeader;
    @FindBy(xpath = "/html/body/footer/div/a/i")
    private WebElement returnToTopButton;




    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickOnSubmitButton() {
        this.submitButton.click();
    }
    public String returnMainPageHeaderText() {return mainPageHeader.getText(); }

    public void writeEmailToEmailField(String email){
        this.emailField.sendKeys(email);}

    public void clickOnVirtualReadMoreButton() {
        this.virtualReadMoreButton.click();
    }
    public void clickOnHybridReadMoreButton() {this.hybridReadMoreButton.click();}
    public void clickOnWhatYoullLearnButton() { this.whatYoullLearnButton.click();}

    public String getLearnText(){
        return learnTheFundamentalsHeader.getText();
    }
    public void clickOnLearnTheFundamentalsReadMoreButton() {this.learnTheFundamentalsReadMoreButton.click();}
    public void clickStartTheEnrollmentButton() {this.startTheEnrollmentButton.click();}
    public String getMainPageBottomHeaderText() {this.mainPageBottomHeader.getText(); }
    public void clickOnReturnToTopButton(){this.returnToTopButton.click();}


}