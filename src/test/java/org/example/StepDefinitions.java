package org.example;

import PageObjects.*;
import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class StepDefinitions {

    private final WebDriver driver = new ChromeDriver();
    private MainPage mainPage;
    private VirtualPage virtualPage;
    private HybridPage hybridPage;
    private LearnTheFundamentalsPage learnTheFundamentalsPage;
    private StartTheEnrollmentPage startTheEnrollmentPage;
    private EnrollmentPersonalInformation enrollmentPersonalInformation;
    private EnrollmentContactInformation enrollmentContactInformation;
    private CourseOptions courseOptions;


    public StepDefinitions() {
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        virtualPage = new VirtualPage(driver);
        hybridPage = new HybridPage(driver);
        learnTheFundamentalsPage = new LearnTheFundamentalsPage(driver);
        startTheEnrollmentPage = new StartTheEnrollmentPage(driver);
        enrollmentPersonalInformation = new EnrollmentPersonalInformation(driver);
        enrollmentContactInformation = new EnrollmentContactInformation(driver);
        courseOptions = new CourseOptions(driver);
    }

    @Given("I am on the main page")
    public void i_am_on_the_main_page() {
        driver.get("file:///C:/Users/Alina/Desktop/testARE/Automated%20testing%20webpage/Testing-Env/index.html");
    }

    @When("I write the email address of {string}")
    public void i_write_the_email_address_of(String string) {
        mainPage.writeEmailToEmailField(string);
    }
    @When("I click the submit button")
    public void i_click_the_submit_button() {
        mainPage.clickOnSubmitButton();
    }
    @Then("The confirmation pop-up appears")
    public void the_confirmation_pop_up_appears() {
        driver.switchTo().alert().accept();
    }
    @Then("A red border lines the email field")
    public void a_red_border_lines_the_email_field() {
        driver.findElement(By.xpath("/html/body/section[2]/div/div/div/button")).click();
        Assert.assertTrue(mainPage.getEmailField().getAttribute("class").contains("error"));
    }


    @When("I click the virtual read more button")
    public void i_click_virtual_read_more_button() {
        Utils.scrollToElement(driver, mainPage.getEmailField());
        mainPage.clickOnVirtualReadMoreButton();
    }
    @Then("A new page opens")
    public void a_new_page_appears() {
        Assert.assertEquals(virtualPage.returnVirtualHeaderText(), "Virtual");
    }
    @Given("I am on the virtual page")
    public void i_am_on_the_virtual_page() {
        driver.get("file:///C:/Users/Alina/Desktop/testARE/Automated%20testing%20webpage/Testing-Env/routes/virtual.html");
    }
    @And("I click on the virtual return button")
    public void i_click_on_virtual_return_button() {
        virtualPage.clickOnVirtualReturnButton();
    }
    @Then("I return tot the main page")
    public void i_return_to_the_main_page() {
       Assert.assertEquals(mainPage.returnMainPageHeaderText(), "Software testing course");
    }

    @When("I click the hybrid read more button")
    public void i_click_on_hybrid_read_more_button() {
        Utils.scrollToElement(driver, mainPage.getEmailField());
        mainPage.clickOnHybridReadMoreButton();
    }
    @Then("Hybrid page opens")
    public void hybrid_page_opens() {
        Assert.assertEquals(hybridPage.returnHybriHeaderText(), "Hybrid");

    }

    @Given("I am on the hybrid page")
    public void i_am_on_hybrid_page() {
        driver.get("file:///C:/Users/Alina/Desktop/testARE/Automated%20testing%20webpage/Testing-Env/routes/hybrid.html");
    }
    @And("I click on the hybrid return button")
    public void i_click_on_hybrid_return_button() {
        hybridPage.clickOnHybridReturnButton();
    }
    @When("I click on what you'll learn button")
    public void i_click_what_youll_learn_button() {
        mainPage.clickOnWhatYoullLearnButton();
    }
    @Then("I am taken to the learn the fundamentals section")
    public void fundamentals_section_verified() {
        Assert.assertEquals(mainPage.getLearnText(), "Learn The Fundamentals");
    }
    @And("I click on the fundamentals read more button")
    public void i_click_fundamentals_read_more_button() {
        mainPage.clickOnLearnTheFundamentalsReadMoreButton();
    }
    @Then("Fundamentals page opens")
    public void fundamentals_page_opens() {
        Assert.assertEquals(learnTheFundamentalsPage.returnFundamentalsHeaderText(), "Fundamentals page");
    }
    @And("I click the fundamentals return button")
    public void i_click_the_fundamentals_return_button() {
        learnTheFundamentalsPage.clickOnFundamentalsReturnButton();
    }
    @When("I click start the enrollment button")
    public void i_click_start_the_enrollment_button() {mainPage.clickStartTheEnrollmentButton();}
    @Then("Sign up for the software testing course page opens")
    public void sign_up_for_the_software_testing_course_page_opens() {
        Assert.assertEquals(startTheEnrollmentPage.returnSignUpForSoftwareTestingCourseHeaderText(),"Sign up for the Software Testing course");
    }
    @Given("I am on the personal information of the enrollment page")
    public void i_am_on_the_personal_information_of_the_enrollment_page() {
        driver.get("file:///C:/Users/Alina/Desktop/testARE/Automated%20testing%20webpage/Testing-Env/routes/enrollment.html");
    }
    @When("I write the first name of {string}")
    public void i_write_the_first_name_of(String string) {enrollmentPersonalInformation.writeFirstNametoFirstNameField(string);}
    @And("I write the last name of {string}")
    public void i_write_the_last_name_of(String string) {enrollmentPersonalInformation.writeLastNameToLastNameFIeld(string);}
    @And("I write the username of {string}")
    public void i_write_the_username_of(String string) {enrollmentPersonalInformation.writeUsernameToUsernameField(string);}
    @And("I write the password of {string}")
    public void i_write_the_password_of(String string) {enrollmentPersonalInformation.writePasswordToPasswordField(string);}
    @And("I write the confirm password of {string}")
    public void i_write_the_confirm_password_of(String string)
    {enrollmentPersonalInformation.writeConfirmPasswordToConfirmPasswordField(string);}
    @And("I click the next button from personal information")
    public void i_click_the_next_button_from_personal_information(){
        Utils.scrollToElement(driver, enrollmentPersonalInformation.getConfirmPasswordField());
        enrollmentPersonalInformation.clickOnNextPersonalInformationButton();
    }
    @Then("I am taken to the contact information of the enrollment page")
    public void i_am_taken_to_the_contact_information_of_the_enrollment_page()
    {Assert.assertEquals(enrollmentContactInformation.returnContactInformationHeaderText(), "Contact information");}

   @Given("I am on the contact information of the enrollment page")
   public void i_am_on_the_contact_information_of_the_enrollment_page(){
        driver.get("file:///C:/Users/Alina/Desktop/testARE/Automated%20testing%20webpage/Testing-Env/routes/enrollment.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        enrollmentPersonalInformation.writeFirstNametoFirstNameField("Alina");
        enrollmentPersonalInformation.writeLastNameToLastNameFIeld("Alison");
        enrollmentPersonalInformation.writeUsernameToUsernameField("aliali");
        enrollmentPersonalInformation.writePasswordToPasswordField("hope191");
        enrollmentPersonalInformation.writeConfirmPasswordToConfirmPasswordField("hope191");
        Utils.scrollToElement(driver, enrollmentPersonalInformation.getConfirmPasswordField());
       enrollmentPersonalInformation.clickOnNextPersonalInformationButton();

        Assert.assertEquals(enrollmentContactInformation.returnContactInformationHeaderText(), "Contact information");
   }

    @When("I write the contact email of {string}")
    public void i_write_the_contact_email_of(String string){
        enrollmentContactInformation.writeContactEmailToContactEmailField(string);
    }
    @And("I write the contact phone of {string}")
    public void i_write_the_contact_phone_of(String string) {
        enrollmentContactInformation.writeContactPhoneToContactPhoneField(string);
    }
    @And("I write the contact country of {string}")
    public void i_write_the_contact_country_of(String string) {
        enrollmentContactInformation.writeContactCountryToContactCountryField(string);
    }
    @And("I write the contact city of {string}")
    public void i_write_the_contact_city_of(String string) {
        enrollmentContactInformation.writeContactCityToContactCityField(string);
    }
    @And("I write the contact post code of {string}")
    public void i_write_the_contact_post_code_of(String string) {
        enrollmentContactInformation.writeContactPostCodeField(string);
    }
    @And("I click the next button from contact information")
     public void i_click_the_next_button_from_contact_information(){
        Utils.scrollToElement(driver, enrollmentContactInformation.getContactPostCodeField());
        enrollmentContactInformation.clickOnContactNextButton();
    }
    @Then("I am taken to the course options of the enrollment page")
    public void i_am_taken_to_the_course_options_of_the_enrollment_page(){
        Assert.assertEquals(courseOptions.returnCourseOptionsHeaderText(), "Course options");
    }
    @When("I scroll tot the bottom of the main page")
    public void iScrollToTheBottomOfTheMainPage() {
        Assert.assertEquals(mainPage.getMainPageBottomHeaderText(), "Copyright © 2022 Software Course");
    }
    @And("I click the return to the top button")
    public void iClickTheReturnToTheTopButton() {
    }










    @After
    public void cleanUp() {
        driver.quit();
    }



}