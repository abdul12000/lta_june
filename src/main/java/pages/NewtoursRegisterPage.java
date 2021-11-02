package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewtoursRegisterPage extends BasePage {
    public NewtoursRegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email")
    private WebElement usernameInputElement;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordInputElement;
    @FindBy(xpath = "//input[@name='confirmPassword']")
    private WebElement confirmPasswordInputElement;
    @FindBy(xpath = "//input[@name='submit']")
    private WebElement submitButtonElement;
    @FindBy(xpath = "//input[@name='confirmPassword']/following-sibling::span")
    private WebElement passwordErrorMsgElement;
    @FindBy(id = "userName")
    private WebElement emailElement;

@FindBy(css = "input[name='lastName']" )
private WebElement lastNameElement;

@FindBy (css = "select[name='country']")
private WebElement countryNameElement;


    public void enterUsername(String text) {
//        usernameInputElement.sendKeys(text);
        sendKeys(usernameInputElement, text);
    }

    public void enterPassword(String text) {
        passwordInputElement.sendKeys(text);
    }

    public void enterConfirmPassword(String text) {
        confirmPasswordInputElement.sendKeys(text);
    }

    public void clickOnSubmitButton() {
        submitButtonElement.click();
    }
    public boolean isRegistrationPageDisplayed(){
//        boolean flag = false;
//        if (submitButtonElement.isDisplayed()){
//            flag = true;
//        }
        return submitButtonElement.isDisplayed();
    }

    public String getPasswordDontMatchText(){
        return passwordErrorMsgElement.getText();
    }

    public void enterLastName(String lastName){
        sendKeys(lastNameElement, lastName);
    }
    public void selectCountryName(String countryName){
        selectFromDropDownUsingVisibleText(countryNameElement, countryName);
    }
    public void selectCountryName(int index){
        selectFromDropDownUsingIndex(countryNameElement, index);
    }
    public void enterEmailAddress(String email){
        sendKeys(emailElement, email);
    }
}
