package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MortgageCalcPage extends BasePage implements IMortageCalcPage{
    public MortgageCalcPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "homeval")
    private WebElement homeValueElement;
    @FindBy(id = "downpayment")
    private WebElement downPaymentElement;
    @FindBy(id = "intrstsrate")
    private WebElement interestRateElement;
    @FindBy(id = "loanterm")
    private WebElement loanTermElement;
    @FindBy(css = "select[name='param[start_month]']")
    private WebElement startMonthElement;
    @FindBy(id = "start_year")
    private WebElement startYearElement;
    @FindBy(xpath = "//div[@class='repayment-block']/div[1]/div[1]/h3")
    private WebElement totalMonthlyPaymentElement;
    @FindBy(xpath = "//div[@class='repayment-block']/div[2]/div[1]/h3")
    private WebElement downPaymentAmountElement;
    @FindBy(xpath = "//div[@class='repayment-block']/div[2]/div[2]/h3")
    private WebElement downPaymentPercentageElement;
    @FindBy(xpath = "//div[@class='repayment-block']/div[4]/div[1]/h3")
    private WebElement loanPayoffdateElement;
    @FindBy(xpath = "//div[@class='repayment-block']/div[4]/div[2]/h3")
    private WebElement totalInterestPaidElement;
    @FindBy(xpath = "//div[@class='repayment-block']/div[5]/div[1]/h3")
    private WebElement monthlytaxPaidElement;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement CalculateButtonElement;

    public void enterHomeValueAmount(String hValue) {
        sendKeys(homeValueElement, hValue);
    }

    public void enterDownPaymeneAmount(String dpaymentValue) {
        sendKeys(downPaymentElement, dpaymentValue);
    }

    public void enterInterestRate(String iRate) {
        sendKeys(interestRateElement, iRate);
    }

    public void enterLoanterm(String lTerm) {
        sendKeys(loanTermElement, lTerm);
    }

    public void selectStartMonth(String sMonth) {
        selectFromDropDownUsingVisibleText(startMonthElement, sMonth);
    }

    public void enterStartyear(String sYear) {
        sendKeys(startYearElement, sYear);
    }

    public void clickOnCalculateButton() {
        CalculateButtonElement.click();
    }

    //getting texts
    public String getTotalMonthlyPayment() {
        return totalMonthlyPaymentElement.getText();
    }

    public String getDownPayment() {
        return downPaymentAmountElement.getText();
    }

    public String getDownPaymentPercentage() {
        return downPaymentPercentageElement.getText();
    }

    public String getLoanPayoffdate() {
        return loanPayoffdateElement.getText();
    }

    public String getTotalInterestPaid() {
        return totalInterestPaidElement.getText();
    }

    public String getMonthlyTaxPaid() {
        return monthlytaxPaidElement.getText();
    }
@Override
    public void testingOverideMethod(){
        System.out.println("I am in MortgageCalc");
    }
}
