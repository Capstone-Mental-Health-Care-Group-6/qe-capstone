package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.restapi.TransactionManual;

public class TransactionManualSteps {

    @Steps
    TransactionManual TransactionManual;

    // [Positive] POST - Make Manual Transaction
    @Given("I set the POST endpoint for making a manual transaction")
    public void setPostMakeManualTransactionEndpoint() {
        TransactionManual.setPostMakeManualTransactionEndpoint();
    }

    @When("I send an HTTP POST request with valid parameters and baseURL for making a manual transaction")
    public void sendHttpPostRequestForMakeManualTransaction() {
        String priceMethod = "180000";
        String priceCounseling = "50000";
        String priceDuration = "45000";
        String paymentProofPath = "/Users/laras/OneDrive/Pictures/Icon/1.png";
        String paymentType = "manual";
        String doctorId = "6";

        TransactionManual.sendHttpPostRequestForMakeManualTransaction(priceMethod, priceCounseling, priceDuration, paymentProofPath, paymentType, doctorId);
    }

    @Then("I receive a valid data response for making a manual transaction with HTTP status code 201 Created")
    public void validateMakeManualTransactionResponse() {
        TransactionManual.validateMakeManualTransactionResponse();
    }

    // [Negative] POST - Make Manual Transaction Doctor ID Not Found
     @Given("I set the POST endpoint for making a manual transaction with invalid doctor ID")
     public void setPostMakeManualTransactionInvalidDoctorIdEndpoint() {
         TransactionManual.setPostMakeManualTransactionInvalidDoctorIdEndpoint();
     }

     @When("I send an HTTP POST request with invalid doctor ID and valid parameters")
     public void sendHttpPostRequestForMakeManualTransactionInvalidDoctorId() {
         String priceMethod = "180000";
         String priceCounseling = "50000";
         String priceDuration = "45000";
         String paymentProofPath = "/Users/laras/OneDrive/Pictures/Icon/1.png";
         String paymentType = "manual";
//         String doctorId = "6";

         TransactionManual.sendHttpPostRequestForMakeManualTransactionInvalidDoctorId(priceMethod, priceCounseling, priceDuration, paymentProofPath, paymentType);
     }

     @Then("I receive a valid data response for making a manual transaction with invalid doctor ID with HTTP status code 500 Internal Server Error")
     public void validateMakeManualTransactionInvalidDoctorIdResponse() {
         TransactionManual.validateMakeManualTransactionInvalidDoctorIdResponse();
     }
    // [Positive] PUT - Update Transaction
    @Given("I set the PUT endpoint for updating a transaction")
    public void setPutUpdateTransactionEndpoint() {
        TransactionManual.setPutUpdateTransactionEndpoint();
    }

    @When("I send an HTTP PUT request with valid parameters and baseURL for updating a transaction")
    public void sendHttpPutRequestForUpdateTransaction() {
        TransactionManual.sendHttpPutRequestForUpdateTransaction();
    }

    @Then("I receive a valid data response for updating a transaction with HTTP status code 200 OK")
    public void validateUpdateTransactionResponse() {
        TransactionManual.validateUpdateTransactionResponse();
    }

    //[Positive] PUT - Update Transaction By ID
    @Given("I set the PUT endpoint for updating a transaction by ID")
    public void setPutUpdateTransactionByIdEndpoint() {
        TransactionManual.setPutUpdateTransactionByIdEndpoint();
    }

    @When("I send an HTTP PUT request with valid parameters and baseURL for updating a transaction by ID")
    public void sendHttpPutRequestForUpdateTransactionById() {
        TransactionManual.sendHttpPutRequestForUpdateTransactionById();
    }

    @Then("I receive a valid data response for updating a transaction by ID with HTTP status code 200 OK")
    public void validateUpdateTransactionByIdResponse() {
        TransactionManual.validateUpdateTransactionByIdResponse();
    }

    // [Positive] PUT - Update Transaction Deny Transaction By Admin (On Confirmation)
    @Given("I set the PUT endpoint for updating a transaction to deny status by Admin")
    public void setPutDenyTransactionByAdminEndpoint() {
        TransactionManual.setPutDenyTransactionByAdminEndpoint();
    }

    @When("I send an HTTP PUT request with valid parameters and baseURL for updating a transaction to deny status by Admin")
    public void sendHttpPutRequestForDenyTransactionByAdmin() {
        TransactionManual.sendHttpPutRequestForDenyTransactionByAdmin();
    }

    @Then("I receive a valid data response for updating a transaction to deny status by Admin with HTTP status code 200 OK")
    public void validateDenyTransactionByAdminResponse() {
        TransactionManual.validateDenyTransactionByAdminResponse();
    }

    // [Positive] PUT - Update Transaction Accept Transaction By Admin (On Confirmation)
    @Given("I set the PUT endpoint for updating a transaction to accept status by Admin")
    public void setPutAcceptTransactionByAdminEndpoint() {
        TransactionManual.setPutAcceptTransactionByAdminEndpoint();
    }

    @When("I send an HTTP PUT request with valid parameters and baseURL for updating a transaction to accept status by Admin")
    public void sendHttpPutRequestForAcceptTransactionByAdmin() {
        TransactionManual.sendHttpPutRequestForAcceptTransactionByAdmin();
    }

    @Then("I receive a valid data response for updating a transaction to accept status by Admin with HTTP status code 200 OK")
    public void validateAcceptTransactionByAdminResponse() {
        TransactionManual.validateAcceptTransactionByAdminResponse();
    }

    // [Negative] PUT - Update Transaction Status is Accepted or Failure
    @Given("I set the PUT endpoint for updating a transaction with invalid status")
    public void setPutUpdateTransactionWithInvalidStatusEndpoint() {
        TransactionManual.setPutUpdateTransactionWithInvalidStatusEndpoint();
    }

    @When("I send an HTTP PUT request for updating a transaction with invalid status")
    public void sendHttpPutRequestForUpdateTransactionWithInvalidStatus() {
        TransactionManual.sendHttpPutRequestForUpdateTransactionWithInvalidStatus();
    }

    @Then("I receive a valid data response for updating a transaction with invalid status with HTTP status code 500 Internal Server Error")
    public void validateUpdateTransactionWithInvalidStatusResponse() {
        TransactionManual.validateUpdateTransactionWithInvalidStatusResponse();
    }

    // [Positive] GET - Get Transactions from User ID
    @Given("I set the GET endpoint for retrieving transactions by User ID")
    public void setGetUserTransactionsEndpoint() {
        TransactionManual.setGetUserTransactionsEndpoint();
    }

    @When("I send an HTTP GET request with valid User ID and baseURL for retrieving transactions by User ID")
    public void sendHttpGetRequestForUserTransactions() {
        TransactionManual.sendHttpGetRequestForUserTransactions();
    }

    @Then("I receive a valid data response for retrieving transactions by User ID with HTTP status code 200 OK")
    public void validateUserTransactionsResponse() {
        TransactionManual.validateUserTransactionsResponse();
    }

    // [Positive] GET - Get Transactions from User ID Get Filtered By Payment Type Transactions from User ID
    @Given("I set the GET endpoint for retrieving transactions by User ID and filtered by Payment Type")
    public void setGetUserTransactionsFilteredByPaymentTypeEndpoint() {
        TransactionManual.setGetUserTransactionsFilteredByPaymentTypeEndpoint();
    }

    @When("I send an HTTP GET request for retrieving transactions by User ID and filtered by Payment Type")
    public void sendHttpGetRequestForUserTransactionsFilteredByPaymentType() {
        TransactionManual.sendHttpGetRequestForUserTransactionsFilteredByPaymentType();
    }

    @Then("I receive a valid data response for retrieving transactions by User ID and filtered by Payment Type with HTTP status code 200 OK")
    public void validateUserTransactionsFilteredByPaymentTypeResponse() {
        TransactionManual.validateUserTransactionsFilteredByPaymentTypeResponse();
    }

    // [Positive] GET - Get All Transactions
    @Given("I set the GET endpoint for retrieving all transactions")
    public void setGetAllTransactionsEndpoint() {
        TransactionManual.setGetAllTransactionsEndpoint();
    }

    @When("I send an HTTP GET request with valid baseURL for retrieving all transactions")
    public void sendHttpGetRequestForAllTransactions() {
        TransactionManual.sendHttpGetRequestForAllTransactions();
    }

    @Then("I receive a valid data response for retrieving all transactions with HTTP status code 200 OK")
    public void validateAllTransactionsResponse() {
        TransactionManual.validateAllTransactionsResponse();
    }

    // [Positive] GET - Get All Transactions Get Sorted By Payment Type All Transactions
    @Given("I set the GET endpoint for retrieving all transactions and sorted by Payment Type")
    public void setGetAllTransactionsSortedByPaymentTypeEndpoint() {
        TransactionManual.setGetAllTransactionsSortedByPaymentTypeEndpoint();
    }

    @When("I send an HTTP GET request with valid Payment Type and baseURL for retrieving all transactions and sorted by Payment Type")
    public void sendHttpGetRequestForAllTransactionsSortedByPaymentType() {
        TransactionManual.sendHttpGetRequestForAllTransactionsSortedByPaymentType();
    }

    @Then("I receive a valid data response for retrieving all transactions and sorted by Payment Type with HTTP status code 200 OK")
    public void validateAllTransactionsSortedByPaymentTypeResponse() {
        TransactionManual.validateAllTransactionsSortedByPaymentTypeResponse();
    }

    // [Positive] GET - Show Transaction Status By Midtrans ID
    @Given("I set the GET endpoint for retrieving transaction status by Midtrans ID")
    public void setGetTransactionStatusByMidtransIdEndpoint() {
        TransactionManual.setGetTransactionStatusByMidtransIdEndpoint();
    }

    @When("I send an HTTP GET request with valid Midtrans ID and baseURL for retrieving transaction status by Midtrans ID")
    public void sendHttpGetRequestForTransactionStatusByMidtransId() {
        TransactionManual.sendHttpGetRequestForTransactionStatusByMidtransId();
    }

    @Then("I receive a valid data response for retrieving transaction status by Midtrans ID with HTTP status code 200 OK")
    public void validateTransactionStatusByMidtransIdResponse() {
        TransactionManual.validateTransactionStatusByMidtransIdResponse();
    }
}
