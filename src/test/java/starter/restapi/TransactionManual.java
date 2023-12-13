package starter.restapi;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import java.io.File;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class TransactionManual {

    protected static String url = "https://kmb5alta.online/";

    // [Positive] POST - Make Manual Transaction
    @Step("I set the POST endpoint for making a manual transaction")
    public String setPostMakeManualTransactionEndpoint() {
        return url + "transaksi?payment_type=manual";
    }

    @Step("I send an HTTP POST request with valid parameters and baseURL for making a manual transaction")
    public void sendHttpPostRequestForMakeManualTransaction(String priceMethod, String priceCounseling,
                                                            String priceDuration, String paymentProofPath, String paymentType, String doctorId) {

        File paymentProofFile = new File(paymentProofPath);

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + LoginPatient.token)
                .multiPart("price_method", priceMethod)
                .multiPart("price_counseling", priceCounseling)
                .multiPart("price_duration", priceDuration)
                .multiPart("payment_proof", paymentProofFile)
                .multiPart("payment_type", paymentType)
                .multiPart("doctor_id", doctorId)
                .post(setPostMakeManualTransactionEndpoint());
    }

    @Step("I receive a valid data response for making a manual transaction with HTTP status code 201 Created")
    public void validateMakeManualTransactionResponse() {
        restAssuredThat(response -> response.statusCode(201));
    }

    // [Positive] POST - Make Manual Transaction Doctor ID Not Found
    @Step("I set the POST endpoint for making a manual transaction with invalid doctor ID")
    public String setPostMakeManualTransactionInvalidDoctorIdEndpoint() {
        return url + "transaksi?payment_type=manual";
    }

    @Step("I send an HTTP POST request with invalid doctor ID and valid parameters")
    public void sendHttpPostRequestForMakeManualTransactionInvalidDoctorId(String priceMethod, String priceCounseling,
                                                            String priceDuration, String paymentProofPath, String paymentType) {

        File paymentProofFile = new File(paymentProofPath);

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + LoginPatient.token)
                .multiPart("price_method", priceMethod)
                .multiPart("price_counseling", priceCounseling)
                .multiPart("price_duration", priceDuration)
                .multiPart("payment_proof", paymentProofFile)
                .multiPart("payment_type", paymentType)
//                .multiPart("doctor_id", doctorId)
                .post(setPostMakeManualTransactionInvalidDoctorIdEndpoint());
    }

    @Step("I receive a valid data response for making a manual transaction with invalid doctor ID with HTTP status code 500 Internal Server Error")
    public void validateMakeManualTransactionInvalidDoctorIdResponse() {
        restAssuredThat(response -> response.statusCode(500));
    }

    // [Positive] PUT - Update Transaction / Update Transaction By Transaction ID
    @Step("I set the PUT endpoint for updating a transaction")
    public String setPutUpdateTransactionEndpoint() {
            return url + "transaksi/M-1702409276";
    }

    @Step("I send an HTTP PUT request with valid parameters and baseURL for updating a transaction")
    public void sendHttpPutRequestForUpdateTransaction() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("payment_status", 4);

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + LoginPatient.token)
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .put(setPutUpdateTransactionEndpoint());
    }

    @Step("I receive a valid data response for updating a transaction with HTTP status code 200 OK")
    public void validateUpdateTransactionResponse() {
        restAssuredThat(response -> response.statusCode(500));
    }

    //[Positive] PUT - Update Transaction By ID
    @Step("I set the PUT endpoint for updating a transaction by ID")
    public String setPutUpdateTransactionByIdEndpoint() {
        return url + "transaksi/1";
    }

    @Step("I send an HTTP PUT request with valid parameters and baseURL for updating a transaction by ID")
    public void sendHttpPutRequestForUpdateTransactionById() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("payment_status", 1);

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + LoginPatient.token)
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .put(setPutUpdateTransactionByIdEndpoint());
    }

    @Step("I receive a valid data response for updating a transaction by ID with HTTP status code 200 OK")
    public void validateUpdateTransactionByIdResponse() {
        restAssuredThat(response -> response.statusCode(500));
    }

    // [Positive] PUT - Update Transaction Deny Transaction By Admin (On Confirmation)
    @Step("I set the PUT endpoint for updating a transaction to deny status by Admin")
    public String setPutDenyTransactionByAdminEndpoint() {
        return url + "transaksi/M-1702409301";
    }

    @Step("I send an HTTP PUT request with valid parameters and baseURL for updating a transaction to deny status by Admin")
    public void sendHttpPutRequestForDenyTransactionByAdmin() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("payment_status", 4);

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + LoginPatient.token)
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .put(setPutDenyTransactionByAdminEndpoint());
    }

    @Step("I receive a valid data response for updating a transaction to deny status by Admin with HTTP status code 200 OK")
    public void validateDenyTransactionByAdminResponse() {
        restAssuredThat(response -> response.statusCode(500));
    }

    // [Positive] PUT - Update Transaction Accept Transaction By Admin (On Confirmation)
    @Step("I set the PUT endpoint for updating a transaction to accept status by Admin")
    public String setPutAcceptTransactionByAdminEndpoint() {
        return url + "transaksi/M-1702409320";
    }

    @Step("I send an HTTP PUT request with valid parameters and baseURL for updating a transaction to accept status by Admin")
    public void sendHttpPutRequestForAcceptTransactionByAdmin() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("payment_status", 2);

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + LoginPatient.token)
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .put(setPutAcceptTransactionByAdminEndpoint());
    }

    @Step("I receive a valid data response for updating a transaction to accept status by Admin with HTTP status code 200 OK")
    public void validateAcceptTransactionByAdminResponse() {
        restAssuredThat(response -> response.statusCode(500));
    }

    // [Negative] PUT - Update Transaction Status is Accepted or Failure
    @Step("I set the PUT endpoint for updating a transaction with invalid status")
    public String setPutUpdateTransactionWithInvalidStatusEndpoint() {
        return url + "transaksi/M-1702409419";
    }

    @Step("I send an HTTP PUT request for updating a transaction with invalid status")
    public void sendHttpPutRequestForUpdateTransactionWithInvalidStatus() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("payment_status", 2);

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + LoginPatient.token)
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .put(setPutUpdateTransactionWithInvalidStatusEndpoint());
    }

    @Step("I receive a valid data response for updating a transaction with invalid status with HTTP status code 500 Internal Server Error")
    public void validateUpdateTransactionWithInvalidStatusResponse() {
        restAssuredThat(response -> response.statusCode(500));
    }

    // [Positive] GET - Get Transactions from User ID
    @Step("I set the GET endpoint for retrieving user information")
    public String setGetUserTransactionsEndpoint(){
        return url + "transaksi/2";

    }
    @Step("I send an HTTP GET request with a valid token")
    public void sendHttpGetRequestForUserTransactions(){
        SerenityRest.given()
                .when()
                .header("Authorization", "Bearer " + LoginPatient.token)
                .get(setGetUserTransactionsEndpoint());

    }
    @Step("I receive a valid user information HTTP response code 200 OK")
    public void validateUserTransactionsResponse(){
        restAssuredThat(response ->response.statusCode(200));
    }

    // [Positive] GET - Get Transactions from User ID Get Filtered By Payment Type Transactions from User ID
    @Step("I set the GET endpoint for retrieving transactions by User ID and filtered by Payment Type")
    public String setGetUserTransactionsFilteredByPaymentTypeEndpoint(){
        return url + "transaksi/2?payment_type=bca";

    }
    @Step("I send an HTTP GET request for retrieving transactions by User ID and filtered by Payment Type")
    public void sendHttpGetRequestForUserTransactionsFilteredByPaymentType(){
        SerenityRest.given()
                .when()
                .header("Authorization", "Bearer " + LoginPatient.token)
                .get(setGetUserTransactionsFilteredByPaymentTypeEndpoint());

    }
    @Step("I receive a valid data response for retrieving transactions by User ID and filtered by Payment Type with HTTP status code 200 OK")
    public void validateUserTransactionsFilteredByPaymentTypeResponse(){
        restAssuredThat(response ->response.statusCode(200));
    }

    // [Positive] GET - Get All Transactions
    @Step("I set the GET endpoint for retrieving all transactions")
    public String setGetAllTransactionsEndpoint(){
        return url + "transaksi";

    }
    @Step("I send an HTTP GET request with valid baseURL for retrieving all transactions")
    public void sendHttpGetRequestForAllTransactions(){
        SerenityRest.given()
                .when()
                .header("Authorization", "Bearer " + LoginPatient.token)
                .get(setGetAllTransactionsEndpoint());

    }
    @Step("I receive a valid data response for retrieving all transactions with HTTP status code 200 OK")
    public void validateAllTransactionsResponse(){
        restAssuredThat(response ->response.statusCode(200));
    }

    // [Positive] GET - Get All Transactions Get Sorted By Payment Type All Transactions
    @Step("I set the GET endpoint for retrieving all transactions and sorted by Payment Type")
    public String setGetAllTransactionsSortedByPaymentTypeEndpoint(){
        return url + "transaksi?payment_type=";

    }
    @Step("I send an HTTP GET request with valid Payment Type and baseURL for retrieving all transactions and sorted by Payment Type")
    public void sendHttpGetRequestForAllTransactionsSortedByPaymentType(){
        SerenityRest.given()
                .when()
                .header("Authorization", "Bearer " + LoginPatient.token)
                .param("payment_type", "manual") // Adjust the parameter as needed
                .get(setGetAllTransactionsSortedByPaymentTypeEndpoint());

    }
    @Step("I receive a valid data response for retrieving all transactions and sorted by Payment Type with HTTP status code 200 OK")
    public void validateAllTransactionsSortedByPaymentTypeResponse(){
        restAssuredThat(response ->response.statusCode(200));
    }

    // [Positive] GET - Show Transaction Status By Midtrans ID
    @Step("II set the GET endpoint for retrieving transaction status by Midtrans ID")
    public String setGetTransactionStatusByMidtransIdEndpoint(){
        return url + "transaksi/check/M-1701979290";

    }
    @Step("I send an HTTP GET request with valid Midtrans ID and baseURL for retrieving transaction status by Midtrans ID")
    public void sendHttpGetRequestForTransactionStatusByMidtransId(){
        SerenityRest.given()
                .when()
                .header("Authorization", "Bearer " + LoginPatient.token)
                .get(setGetTransactionStatusByMidtransIdEndpoint());

    }
    @Step("I receive a valid data response for retrieving transaction status by Midtrans ID with HTTP status code 200 OK")
    public void validateTransactionStatusByMidtransIdResponse(){
        restAssuredThat(response ->response.statusCode(200));
    }
}
