package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartTheEnrollmentPage {
    @FindBy(xpath = "/html/body/div/div/h2")
    private WebElement signUpForSoftwareTestingCourseHeader;

    public String returnSignUpForSoftwareTestingCourseHeaderText(){return signUpForSoftwareTestingCourseHeader.getText();}
    public StartTheEnrollmentPage(WebDriver driver) {PageFactory.initElements(driver, this);}




}
