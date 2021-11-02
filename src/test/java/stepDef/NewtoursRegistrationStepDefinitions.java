package stepDef;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.NewtoursHomePage;
import pages.NewtoursRegisterConfirmationPage;
import pages.NewtoursRegisterPage;
import utilities.ConfigReader;
import utilities.Encapsulation;
import utilities.Utility;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class NewtoursRegistrationStepDefinitions extends BaseUtil {
    private BaseUtil base;
    String emailAddress;
    Encapsulation encapsulation = new Encapsulation();

    public NewtoursRegistrationStepDefinitions(BaseUtil base) {
        this.base = base;
    }

    @Given("I am on the Newtours website {string}")
    public void i_am_on_the_newtours_website(String url) {
        base.driver.manage().window().maximize();
        base.driver.get(url);
    }

    @Given("I am on the Newtours website")
    public void iAmOnTheNewtoursWebsite() throws Exception {
        base.driver.manage().window().maximize();
        ConfigReader configReader = new ConfigReader();

        base.driver.get(configReader.getNewtoursUrl());
    }

    @When("I click on the Register link")
    public void i_click_on_the_register_link() {
        NewtoursHomePage newtoursHomePage = new NewtoursHomePage(base.driver);
        newtoursHomePage.clickOnRegisterLink();

    }

    @When("I enter {string}, password and confirm as {string}")
    public void i_enter_password_and_confirm_as(String username, String password) {
        NewtoursRegisterPage newtoursRegisterPage = new NewtoursRegisterPage(base.driver);
        newtoursRegisterPage.enterUsername(username);
        newtoursRegisterPage.enterPassword(password);
        newtoursRegisterPage.enterConfirmPassword(password);

    }

    @When("I click submit button")
    public void i_click_submit_button() {
        NewtoursRegisterPage newtoursRegisterPage = new NewtoursRegisterPage(base.driver);
        newtoursRegisterPage.clickOnSubmitButton();

    }

    @And("I enter {string}, and {string} with incorrect password for confirm password")
    public void iEnterAndWithIncorrectPasswordForConfirmPassword(String username, String password) {
        NewtoursRegisterPage newtoursRegisterPage = new NewtoursRegisterPage(base.driver);
        newtoursRegisterPage.enterUsername(username);
        newtoursRegisterPage.enterPassword(password);
        newtoursRegisterPage.enterConfirmPassword("incorrect");
    }

    @Then("confirmation page should not be displayed")
    public void confirmationPageShouldNotBeDisplayed() {
        NewtoursRegisterPage newtoursRegisterPage = new NewtoursRegisterPage(base.driver);
        Assert.assertTrue(newtoursRegisterPage.isRegistrationPageDisplayed());
    }

    @And("error message is displayed as {string}")
    public void errorMessageIsDisplayedAs(String msg) {
        NewtoursRegisterPage newtoursRegisterPage = new NewtoursRegisterPage(base.driver);
        Assert.assertEquals(msg, newtoursRegisterPage.getPasswordDontMatchText());
        Assert.assertEquals(msg.toLowerCase(), newtoursRegisterPage.getPasswordDontMatchText().toLowerCase());
        Assert.assertEquals(msg.toUpperCase(), newtoursRegisterPage.getPasswordDontMatchText().toUpperCase());
        System.out.println(newtoursRegisterPage.getPasswordDontMatchText());
    }

    @And("I enter {string} and select {string}")
    public void iEnterAndSelect(String lName, String cName) throws InterruptedException {
        NewtoursRegisterPage newtoursRegisterPage = new NewtoursRegisterPage(base.driver);
        newtoursRegisterPage.enterLastName(lName);
//newtoursRegisterPage.selectCountryName(cName);
        newtoursRegisterPage.selectCountryName(5);
        Thread.sleep(3000);
    }


    @And("I enter {string} and select {string} and enter unique email address")
    public void iEnterAndSelectAndEnterUniqueEmailAddress(String lName, String cName) {
        NewtoursRegisterPage newtoursRegisterPage = new NewtoursRegisterPage(base.driver);
        emailAddress = Utility.generateRandomNum() +"lateef@gmail.com";

        encapsulation.setEmail(emailAddress);
//        System.out.println(emailAddress);
//        newtoursRegisterPage.enterEmailAddress(emailAddress);
        newtoursRegisterPage.enterEmailAddress(encapsulation.getEmail());
        newtoursRegisterPage.enterLastName(lName);
        newtoursRegisterPage.selectCountryName(cName);
    }

    @Then("confirmation page is displayed with my {string}")
    public void confirmation_page_is_displayed_with_my(String username) {
        NewtoursRegisterConfirmationPage newtoursRegisterConfirmationPage = new NewtoursRegisterConfirmationPage(base.driver);
        assertThat(newtoursRegisterConfirmationPage.getNoteText().contains(username), equalTo(true));


        System.out.println(encapsulation.getEmail());

    }
}
