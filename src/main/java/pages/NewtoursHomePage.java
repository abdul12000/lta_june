package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewtoursHomePage extends BasePage{
    public NewtoursHomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(linkText = "SIGN-ON") private WebElement signOnLinkElement;
    @FindBy(linkText = "REGISTER") private WebElement registerLinkElement;
    @FindBy(linkText = "SUPPORT") private WebElement supportLinkElement;
    @FindBy(linkText = "CONTACT") private WebElement contactLinkElement;
    @FindBy(css = "input[name='userName']")
    private WebElement usernameInputElement;
    @FindBy(css = "input[name='password']")
    private WebElement passwordInputElement;
    @FindBy(css = "input[name='submit']")
    private WebElement submitButtonElement;

    public void clickOnSignOnLink(){
//        signOnLinkElement.click();
        click(signOnLinkElement);
    }
    public void clickOnRegisterLink(){
        registerLinkElement.click();
    }

    public void clickOnSupportLink(){
        click(supportLinkElement);
    }

    public void clickOnContactLink(){
        click(contactLinkElement);
    }

    public void enterUsername(String text){
//        usernameInputElement.sendKeys(text);
        sendKeys(usernameInputElement,text);
    }

    public void enterPassword(String text){
        passwordInputElement.sendKeys(text);
    }

    public void clickOnSubmitButton(){
        click(supportLinkElement);
    }
}
