package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.restapi.Web_AdminWithdrawBalance;

public class Web_AdminWithdrawBalanceSteps {

    @Steps
    Web_AdminWithdrawBalance withdrawBalance;


    // Background
    @Given("I set a valid endpoint for Withdraw Balance Disbursement operations")
    public void ValidEndpointForWithdrawBalanceDisbursementOperations() {
        withdrawBalance.ValidEndpointForWithdrawBalanceDisbursementOperations();
    }

    // # [Positive] GET - Get All Data
    @When("I set the authentication endpoint to retrieve all data from Balance Disbursement")
    public void AuthenticationEndpointToRetrieveAllDataFromBalanceDisbursement() {

    }

    @And("I send an HTTP GET request to fetch all data from Balance Disbursement")
    public void SendAnHTTPGETRequestToFetchAllDataFromBalanceDisbursement() {

    }

    @Then("I should receive a valid HTTP response with status code 200 for all data from Balance Disbursement")
    public void ReceiveAValidHTTPResponseWithStatusCode200ForAllDataFromBalanceDisbursement() {
    }
}
