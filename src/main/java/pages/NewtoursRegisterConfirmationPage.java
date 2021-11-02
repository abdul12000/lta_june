package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewtoursRegisterConfirmationPage extends BasePage{
    public NewtoursRegisterConfirmationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//p[1]/font/b")
    private WebElement dearElement;
    @FindBy(xpath = "//p[3]/a/font/b")
    private WebElement noteElement;

public String getNoteText(){
    return noteElement.getText();
}


}
