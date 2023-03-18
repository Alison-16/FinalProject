package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnrollmentContactInformation {
    public EnrollmentContactInformation(WebDriver driver){ PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement contactEmailField;
    private WebElement getContactEmailField(){return contactEmailField; }
    public void writeContactEmailToContactEmailField (String contactEmail) {this.contactEmailField.sendKeys(contactEmail);}

    @FindBy(xpath = "//*[@id=\"phone\"]")
    private WebElement contactPhoneField;
    private WebElement getContactPhoneField(){return contactPhoneField; }
    public void writeContactPhoneToContactPhoneField (String contactPhone) {this.contactPhoneField.sendKeys(contactPhone);}

    @FindBy(xpath = "//*[@id=\"country\"]")
    private WebElement contactCountryField;
    private WebElement getContactCountryField(){return contactCountryField; }
    public void writeContactCountryToContactCountryField (String contactCountry) {this.contactCountryField.sendKeys(contactCountry);}

    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement contactCityField;
    private WebElement getContactCityField(){return contactCityField; }
    public void writeContactCityToContactCityField (String contactCity) {this.contactCityField.sendKeys(contactCity);}

    @FindBy(xpath = "//*[@id=\"postCode\"]")
    private WebElement contactPostCodeField;
    public WebElement getContactPostCodeField(){return contactPostCodeField; }
    public void writeContactPostCodeField (String contactPostCode) {this.contactPostCodeField.sendKeys(contactPostCode);}

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
    private WebElement contactNextButton;
    private WebElement getContactNextButton(){return contactNextButton; }
    public void clickOnContactNextButton() {this.contactNextButton.click();}
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/h3")
    private WebElement contactInformationHeader;
    public String returnContactInformationHeaderText() {return contactInformationHeader.getText();}


}
