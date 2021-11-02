package pages;

public interface IMortageCalcPage {

    void enterHomeValueAmount(String hValue);

    void enterDownPaymeneAmount(String dpaymentValue);

    void enterInterestRate(String iRate);

    void enterLoanterm(String lTerm);

    void selectStartMonth(String sMonth);

    void enterStartyear(String sYear);

    void clickOnCalculateButton();

    String getTotalMonthlyPayment();

    String getDownPayment();

    String getDownPaymentPercentage();

    String getLoanPayoffdate();

    String getTotalInterestPaid();

    String getMonthlyTaxPaid();

//    String Paint();
}
