package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.restapi.Web_DoctorWithdrawBalance;

public class Web_DoctorWithdrawBalanceSteps {
    @Steps
    Web_DoctorWithdrawBalance withdrawal;

    // [Positive] POST - Add Withdraw
    @Given("I POST endpoint is set for adding a withdrawal for withdrawal successfully")
    public void setAddWithdrawalEndpoint() {
        withdrawal.setAddWithdrawalEndpoint();
    }

    @When("I HTTP POST request with valid parameters and baseURL is sent for adding a withdrawal for withdrawal successfully")
    public void sendAddWithdrawalRequest() {
        withdrawal.sendAddWithdrawalRequest();
    }

    @Then("I valid data response for the withdrawal addition is received with HTTP status code 201 Created")
    public void validateAddWithdrawalResponse() {
        withdrawal.validateAddWithdrawalResponse();
    }

    // [Negative] POST - Failed Validate
    @Given("I POST endpoint is set for adding a withdrawal for failed validation")
    public void setAddWithdrawalEndpointFailedValidation() {
        withdrawal.setAddWithdrawalEndpointFailedValidation();
    }

    @When("I HTTP POST request with valid parameters and baseURL is sent for adding a withdrawal for failed validation")
    public void sendAddWithdrawalRequestFailedValidation() {
        withdrawal.sendAddWithdrawalRequestFailedValidation();
    }

    @Then("I error response for failed validation is received with HTTP status code 400 Bad Request  for failed validation")
    public void validateAddWithdrawalResponseFailedValidation() {
        withdrawal.validateAddWithdrawalResponseFailedValidation();
    }

    // [Positive] POST - Balance Not Enough
    @Given("I POST endpoint is set for adding a withdrawal with insufficient balance")
    public void setAddWithdrawalEndpointBalanceNotEnough() {
        withdrawal.setAddWithdrawalEndpointBalanceNotEnough();
    }

    @When("I HTTP POST request with valid parameters and baseURL is sent for adding a withdrawal with insufficient balance")
    public void sendAddWithdrawalRequestBalanceNotEnough() {
        withdrawal.sendAddWithdrawalRequestBalanceNotEnough();
    }

    @Then("I valid data response indicating insufficient balance is received with HTTP status code 500 Internal Server Error")
    public void validateAddWithdrawalResponseBalanceNotEnough() {
        withdrawal.validateAddWithdrawalResponseBalanceNotEnough();
    }

    // [Negative] POST - Invalid endpoint
    @Given("I POST endpoint is set to an invalid endpoint")
    public void setAddWithdrawalEndpointInvalid() {
        withdrawal.setAddWithdrawalEndpointInvalid();
    }

    @When("I HTTP POST request with valid parameters and baseURL is sent for adding a withdrawal")
    public void sendAddWithdrawalRequestInvalid() {
        withdrawal.sendAddWithdrawalRequestInvalid();
    }

    @Then("I error response for an invalid endpoint is received with HTTP status code 404 Not Found")
    public void validateAddWithdrawalResponseInvalid() {
        withdrawal.validateAddWithdrawalResponseInvalid();
    }

    // [Positive] GET - Get All Withdraw
    @Given("I GET endpoint is set for retrieving all withdrawals")
    public void setGetAllWithdrawEndpoint() {
        withdrawal.setGetAllWithdrawEndpoint();
    }

    @When("I HTTP GET request with valid parameters and baseURL is sent for retrieving all withdrawals")
    public void sendGetAllWithdrawRequest() {
        withdrawal.sendGetAllWithdrawRequest();
    }

    @Then("I valid data response for retrieving all withdrawals is received with HTTP status code 200 OK")
    public void validateGetAllWithdrawResponse() {
        withdrawal.validateGetAllWithdrawResponse();
    }
}
