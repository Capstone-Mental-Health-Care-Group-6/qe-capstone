package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.restapi.Transaction_MindtransTransaction;

public class Transaction_MindtransTransactionSteps {
    @Steps
    Transaction_MindtransTransaction mindtransTransaction;

    // POST - Make Transaction BCA
    @Given("I set the POST endpoint for making a BCA transaction")
    public void setPostMakeBCATransactionEndpoint() {
        mindtransTransaction.setPostMakeBCATransactionEndpoint();
    }

    @When("I send an HTTP POST request with valid parameters and baseURL for making a BCA transaction")
    public void sendPostMakeBCATransactionRequest() {
        mindtransTransaction.sendPostMakeBCATransactionRequest();
    }

    @Then("I receive a valid data response for BCA transaction with HTTP status code 201 Created")
    public void validatePostMakeBCATransactionResponse() {
        mindtransTransaction.validatePostMakeBCATransactionResponse();
    }

    // POST - Make Transaction BNI
    @Given("I set the POST endpoint for making a BNI transaction")
    public void setPostMakeBNITransactionEndpoint() {
        mindtransTransaction.setPostMakeBNITransactionEndpoint();
    }

    @When("I send an HTTP POST request with valid parameters and baseURL for making a BNI transaction")
    public void sendPostMakeBNITransactionRequest() {
        mindtransTransaction.sendPostMakeBNITransactionRequest();
    }

    @Then("I receive a valid data response for BNI transaction with HTTP status code 201 Created")
    public void validatePostMakeBNITransactionResponse() {
        mindtransTransaction.validatePostMakeBNITransactionResponse();
    }

    // POST - Make Transaction BRI
    @Given("I set the POST endpoint for making a BRI transaction")
    public void setPostMakeBRITransactionEndpoint() {
        mindtransTransaction.setPostMakeBRITransactionEndpoint();
    }

    @When("I send an HTTP POST request with valid parameters and baseURL for making a BRI transaction")
    public void sendPostMakeBRITransactionRequest() {
        mindtransTransaction.sendPostMakeBRITransactionRequest();
    }

    @Then("I receive a valid data response for BRI transaction with HTTP status code 201 Created")
    public void validatePostMakeBRITransactionResponse() {
        mindtransTransaction.validatePostMakeBRITransactionResponse();
    }

    // POST - Make Transaction Gopay
    @Given("I set the POST endpoint for making a Gopay transaction")
    public void setPostMakeGopayTransactionEndpoint() {
        mindtransTransaction.setPostMakeGopayTransactionEndpoint();
    }

    @When("I send an HTTP POST request with valid parameters and baseURL for making a Gopay transaction")
    public void sendPostMakeGopayTransactionRequest() {
        mindtransTransaction.sendPostMakeGopayTransactionRequest();
    }

    @Then("I receive a valid data response for Gopay transaction with HTTP status code 201 Created")
    public void validatePostMakeGopayTransactionResponse() {
        mindtransTransaction.validatePostMakeGopayTransactionResponse();
    }

    // POST - Make Transaction Qris
    @Given("I set the POST endpoint for making a Qris transaction")
    public void setPostMakeQrisTransactionEndpoint() {
        mindtransTransaction.setPostMakeQrisTransactionEndpoint();
    }

    @When("I send an HTTP POST request with valid parameters and baseURL for making a Qris transaction")
    public void sendPostMakeQrisTransactionRequest() {
        mindtransTransaction.sendPostMakeQrisTransactionRequest();
    }

    @Then("I receive a valid data response for Qris transaction with HTTP status code 201 Created")
    public void validatePostMakeQrisTransactionResponse() {
        mindtransTransaction.validatePostMakeQrisTransactionResponse();
    }

    // GET - Get All Transactions from User ID
    @Given("I set the GET endpoint for retrieving all transactions for a specific user ID")
    public void setGetAllTransactionsForUserIdEndpoint() {
        mindtransTransaction.setGetAllTransactionsForUserIdEndpoint();
    }

    @When("I send an HTTP GET request with valid parameters and baseURL for retrieving all transactions for a specific user ID")
    public void sendGetAllTransactionsForUserIdRequest() {
        mindtransTransaction.sendGetAllTransactionsForUserIdRequest();
    }

    @Then("I receive a valid data response for retrieving all transactions mindtrans with HTTP status code 200 OK")
    public void validateGetAllTransactionsForUserIdResponse() {
        mindtransTransaction.validateGetAllTransactionsForUserIdResponse();
    }

    // GET - Get Filtered By Payment Type Transactions from User ID
    @Given("I set the GET endpoint for retrieving transactions filtered by payment type for a specific user ID")
    public void setGetFilteredByPaymentTypeTransactionsEndpoint() {
        mindtransTransaction.setGetFilteredByPaymentTypeTransactionsEndpoint();
    }

    @When("I send an HTTP GET request with valid parameters and baseURL for retrieving transactions filtered by payment type for a specific user ID")
    public void sendGetFilteredByPaymentTypeTransactionsRequest() {
        mindtransTransaction.sendGetFilteredByPaymentTypeTransactionsRequest();
    }

    @Then("I receive a valid data response for retrieving transactions filtered by payment type with HTTP status code 200 OK")
    public void validateGetFilteredByPaymentTypeTransactionsResponse() {
        mindtransTransaction.validateGetFilteredByPaymentTypeTransactionsResponse();
    }

    // GET - Get All Transactions
    @Given("I set the GET endpoint for retrieving all transactions mindtrans")
    public void setGetAllTransactionsEndpoint() {
        mindtransTransaction.setGetAllTransactionsEndpoint();
    }

    @When("I send an HTTP GET request with valid parameters and baseURL for retrieving all transactions")
    public void sendGetAllTransactionsRequest() {
        mindtransTransaction.sendGetAllTransactionsRequest();
    }

    @Then("I receive a valid data response for retrieving all mindtrans transactions with HTTP status code 200 OK")
    public void validateGetAllTransactionsResponse() {
        mindtransTransaction.validateGetAllTransactionsResponse();
    }

    // GET - Get Sorted By Payment Type All Transactions
    @Given("I set the GET endpoint for retrieving transactions sorted by payment type")
    public void setGetSortedByPaymentTypeAllTransactionsEndpoint() {
        mindtransTransaction.setGetSortedByPaymentTypeAllTransactionsEndpoint();
    }

    @When("I send an HTTP GET request with valid parameters and baseURL for retrieving transactions sorted by payment type")
    public void sendGetSortedByPaymentTypeAllTransactionsRequest() {
        mindtransTransaction.sendGetSortedByPaymentTypeAllTransactionsRequest();
    }

    @Then("I receive a valid data response for retrieving transactions sorted by payment type with HTTP status code 200 OK")
    public void validateGetSortedByPaymentTypeAllTransactionsResponse() {
        mindtransTransaction.validateGetSortedByPaymentTypeAllTransactionsResponse();
    }

    // GET - Get Show Transaction Status By Midtrans ID
    @Given("I set the GET endpoint for retrieving transaction status by Midtrans ID transaction")
    public void setGetShowTransactionStatusByMidtransIDEndpoint() {
        mindtransTransaction.setGetShowTransactionStatusByMidtransIDEndpoint();
    }

    @When("I send an HTTP GET request with valid parameters and baseURL for retrieving transaction status by Midtrans ID")
    public void sendGetShowTransactionStatusByMidtransIDRequest() {
        mindtransTransaction.sendGetShowTransactionStatusByMidtransIDRequest();
    }

    @Then("I receive a valid data response midtrans for retrieving transaction status by Midtrans ID with HTTP status code 200 OK")
    public void validateGetShowTransactionStatusByMidtransIDResponse() {
        mindtransTransaction.validateGetShowTransactionStatusByMidtransIDResponse();
    }

    // GET - Get invalid Endpoint
    @Given("I set the GET endpoint for an invalid request midtrans transaction")
    public void setGetInvalidEndpoint() {
        mindtransTransaction.setGetInvalidEndpoint();
    }

    @When("I send an HTTP GET request with an invalid baseURL for an invalid request midtrans")
    public void sendGetInvalidEndpointRequest() {
        mindtransTransaction.sendGetInvalidEndpointRequest();
    }

    @Then("I receive an error response with HTTP status code 404 Not Found for an invalid request midtrans")
    public void validateGetInvalidEndpointResponse() {
        mindtransTransaction.validateGetInvalidEndpointResponse();
    }
}
