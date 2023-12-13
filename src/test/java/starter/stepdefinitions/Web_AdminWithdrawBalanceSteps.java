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

    // [Positive] GET - Get All Data
    @Given("I set the authentication endpoint for Withdraw Balance Disbursement operations")
    public void iSetTheAuthenticationEndpointForWithdrawBalanceDisbursementOperations() {
        withdrawBalance.iSetTheAuthenticationEndpointForWithdrawBalanceDisbursementOperations();
    }

    @When("I send an HTTP GET request to fetch all data from Balance Disbursement")
    public void SendAnHTTPGETRequestToFetchAllDataFromBalanceDisbursement() {
        withdrawBalance.SendAnHTTPGETRequestToFetchAllDataFromBalanceDisbursement();
    }

    @Then("I should receive a valid HTTP response with status code 200 for all data from Balance Disbursement")
    public void ResponseWithStatusCode200ForAllDataFromBalanceDisbursement() {
        withdrawBalance.ResponseWithStatusCode200ForAllDataFromBalanceDisbursement();
    }

    // [Positive] PUT - Update Status Done
    @Given("I sets a valid PUT endpoint Update status done all data from balance disbursement")
    public void ValidPUTEndpointUpdateStatusDoneAllDataFromBalanceDisbursement() {
        withdrawBalance.ValidPUTEndpointUpdateStatusDoneAllDataFromBalanceDisbursement();
    }

    @When("I send a PUT HTTP request to Update status to Done")
    public void iSendAPUTHTTPRequestToUpdateStatusToDone() {
        withdrawBalance.iSendAPUTHTTPRequestToUpdateStatusToDone();
    }

    @Then("I receive an HTTP response code 200 with a valid endpoint for updating status to Done")
    public void ResponseCode200WithAValidEndpointForUpdatingStatusToDone() {
        withdrawBalance.ResponseCode200WithAValidEndpointForUpdatingStatusToDone();
    }

    // [Negative] PUT - Update Status Pending
    @Given("I sets a valid PUT endpoint Update status pending all data from balance disbursement")
    public void ValidPUTEndpointUpdateStatusPendingAllDataFromBalanceDisbursement() {
        withdrawBalance.ValidPUTEndpointUpdateStatusPendingAllDataFromBalanceDisbursement();
    }
    @When("I send a PUT HTTP request to Update status to Pending")
    public void iSendAPUTHTTPRequestToUpdateStatusToPending() {
        withdrawBalance.iSendAPUTHTTPRequestToUpdateStatusToPending();
    }

    @Then("I receive an HTTP response code 200 with a valid endpoint for updating status to Pending")
    public void ResponseCode200WithAValidEndpointForUpdatingStatusToPending() {
        withdrawBalance.ResponseCode200WithAValidEndpointForUpdatingStatusToPending();
    }

    // [Negative] PUT - Update Failed Validation

    @Given("I sets a valid PUT endpoint Update status failed validation all data from balance disbursement")
    public void ValidPUTEndpointUpdateStatusFailedValidationAllDataFromBalanceDisbursement() {
        withdrawBalance.ValidPUTEndpointUpdateStatusFailedValidationAllDataFromBalanceDisbursement();
    }

    @When("I send a PUT HTTP request with invalid data validation to Update status of Balance Disbursement")
    public void RequestWithInvalidDataValidationToUpdateStatusOfBalanceDisbursement() {
        withdrawBalance.RequestWithInvalidDataValidationToUpdateStatusOfBalanceDisbursement();
    }

    @Then("I receive an HTTP response code 400 due to invalid request format")
    public void ResponseCode400DueToInvalidRequestFormat() {
        withdrawBalance.ResponseCode400DueToInvalidRequestFormat();
    }

    // [Positive] GET - Get By ID Success
    @Given("I sets a valid GET endpoint for retrieving All Balance Withdraw data by ID")
    public void ValidGETEndpointForRetrievingAllBalanceWithdrawDataByID() {
        withdrawBalance.ValidGETEndpointForRetrievingAllBalanceWithdrawDataByID();
    }

    @When("I send a GET HTTP request with a valid ID for All Balance Withdraw")
    public void iSendAGETHTTPRequestWithAValidIDForAllBalanceWithdraw() {
        withdrawBalance.iSendAGETHTTPRequestWithAValidIDForAllBalanceWithdraw();
    }

    @Then("I receive a valid GET HTTP response with a status code of 200 for the All Balance Withdraw data by ID")
    public void ResponseWithAStatusCodeOf200ForTheAllBalanceWithdrawDataByID() {
        withdrawBalance.ResponseWithAStatusCodeOf200ForTheAllBalanceWithdrawDataByID();
    }

    // [Negative] GET - Get By ID Not Found
    @Given("I sets a valid GET endpoint for retrieving All Balance Withdraw data by ID Not found")
    public void ValidGETEndpointForRetrievingAllBalanceWithdrawDataByIDNotFound() {
        withdrawBalance.ValidGETEndpointForRetrievingAllBalanceWithdrawDataByIDNotFound();
    }
    @When("I send a GET HTTP request with an invalid ID for All Balance Withdraw")
    public void iSendAGETHTTPRequestWithAnInvalidIDForAllBalanceWithdraw() {
        withdrawBalance.iSendAGETHTTPRequestWithAnInvalidIDForAllBalanceWithdraw();
    }

    @Then("I receive a GET HTTP response with a status code of 400 for the All Balance Withdraw data by ID")
    public void ResponseWithAStatusCodeOf400ForTheAllBalanceWithdrawDataByID() {
        withdrawBalance.ResponseWithAStatusCodeOf400ForTheAllBalanceWithdrawDataByID();
    }

}

