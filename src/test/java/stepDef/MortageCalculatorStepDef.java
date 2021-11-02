package stepDef;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MortgageCalcPage;
import utilities.ConfigReader;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.List;

public class MortageCalculatorStepDef  extends BaseUtil {
    private BaseUtil base;

    public MortageCalculatorStepDef(BaseUtil base) {
        this.base = base;
    }

    @Given("I am on the Mortgage Calculator website")
    public void i_am_on_the_mortgage_calculator_website() throws Exception {
        ConfigReader configReader = new ConfigReader();
        base.driver.get(configReader.getMortgageCalcUrl());
    }
    @When("I enter the following")
    public void i_enter_the_following(List<List<String>> data) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        MortgageCalcPage mortgageCalcPage = new MortgageCalcPage(base.driver);
        mortgageCalcPage.enterHomeValueAmount(data.get(1).get(1));
        mortgageCalcPage.enterDownPaymeneAmount(data.get(2).get(1));
        mortgageCalcPage.enterInterestRate(data.get(3).get(1));
        mortgageCalcPage.enterLoanterm(data.get(4).get(1));
        mortgageCalcPage.selectStartMonth(data.get(5).get(1));
        mortgageCalcPage.enterStartyear(data.get(6).get(1));

    }
    @When("accept default value for all the remaining values")
    public void accept_default_value_for_all_the_remaining_values() {
        // Write code here that turns the phrase above into concrete actions
  MortgageCalcPage mortgageCalcPage = new MortgageCalcPage(base.driver);
  mortgageCalcPage.clickOnCalculateButton();
    }
    @Then("I should get mortage offer with {string}, {string}, {string}, {string}, {string} and {string}")
    public void i_should_get_mortage_offer_with_and(String tMonthlyPayment, String dPayment, String dpaymentPercentage, String lPayoffdate, String intRate, String mTaxPaid) {
        MortgageCalcPage mortgageCalcPage = new MortgageCalcPage(base.driver);
       assertThat(mortgageCalcPage.getTotalMonthlyPayment(), is(equalTo(tMonthlyPayment)));
        assertThat(mortgageCalcPage.getDownPayment(), is(equalTo(dPayment)));
        assertThat(mortgageCalcPage.getDownPaymentPercentage(), is(equalTo(dpaymentPercentage)));
        assertThat(mortgageCalcPage.getLoanPayoffdate(), is(equalTo(lPayoffdate)));
        assertThat(mortgageCalcPage.getTotalInterestPaid(), is(equalTo(intRate)));
//        assertThat(mortgageCalcPage.getMonthlyTaxPaid(), is(equalTo(mTaxPaid)));
    List<String> arrayListOfTax = Arrays.asList("$198.00", "$190.00", "$201.00", mTaxPaid , "$202.00");
    assertThat(arrayListOfTax, hasItem(mortgageCalcPage.getMonthlyTaxPaid()));

    mortgageCalcPage.testingOverideMethod();

    }
}
