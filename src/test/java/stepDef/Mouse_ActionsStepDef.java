package stepDef;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConfigReader;


import java.time.Duration;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Mouse_ActionsStepDef extends BaseUtil {
    private  BaseUtil base;

    public Mouse_ActionsStepDef(BaseUtil base) {
        this.base = base;
    }
    @Given("I am on the Next website")
    public void i_am_on_the_next_website() throws Exception {
ConfigReader configReader = new ConfigReader();
base.driver.get(configReader.getNextUrl());
    }
    @When("I Click on All bedding link")
    public void i_click_on_all_bedding_link() {
        WebElement homeLink = base.driver.findElement(By.xpath("//a[@id='NI3'][@title='HOME']"));
        Actions actionProvider = new Actions(base.driver);
        // Performs mouse move action onto the element
        actionProvider.moveToElement(homeLink).build().perform();

        WebDriverWait wait = new WebDriverWait(base.driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='NI42'][@title='All Home Furnishings']")));

        WebElement AllBeddingLink = base.driver.findElement(By.xpath("//a[@id='NI42'][@title='All Home Furnishings']"));
        actionProvider.moveToElement(AllBeddingLink);
        actionProvider.click().build().perform();

    }
    @Then("All bedding page is displayed")
    public void all_bedding_page_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
   assertThat(base.driver.findElement(By.xpath("//h1[contains(text(),'Home Furnishings')]")).isDisplayed(), is(equalTo(true)));
    }
}
