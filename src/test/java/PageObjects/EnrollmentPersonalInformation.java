package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnrollmentPersonalInformation {
    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement firstNameField;
    private WebElement getFirstNameField(){ return firstNameField; }
    public void writeFirstNametoFirstNameField(String firstName){this.firstNameField.sendKeys(firstName);}
    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement lastNameField;
    private WebElement getLastNameField() { return lastNameField; }
    public void writeLastNameToLastNameFIeld(String lastName){this.lastNameField.sendKeys(lastName);}
    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement usernameField;
    private WebElement getUsernameField(){ return usernameField; }
    public void writeUsernameToUsernameField(String username){this.usernameField.sendKeys(username);}
    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement passwordField;
    private WebElement getPasswordField(){return passwordField; }
    public void writePasswordToPasswordField(String password){this.passwordField.sendKeys(password);}
    @FindBy(xpath = "//*[@id=\"cpassword\"]")
    private WebElement confirmPasswordField;
    public WebElement getConfirmPasswordField(){return confirmPasswordField; }
    public void writeConfirmPasswordToConfirmPasswordField(String confirmPassword){this.confirmPasswordField.sendKeys(confirmPassword);}
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement nextPersonalInformationButton;
    private WebElement getNextPersonalInformationButton(){return nextPersonalInformationButton; }
    public void clickOnNextPersonalInformationButton() {this.nextPersonalInformationButton.click();}

    public EnrollmentPersonalInformation(WebDriver driver) {PageFactory.initElements(driver, this);}



}


