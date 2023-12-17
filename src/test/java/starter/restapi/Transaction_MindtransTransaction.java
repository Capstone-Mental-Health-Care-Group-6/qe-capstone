package starter.restapi;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
public class Transaction_MindtransTransaction {

    protected static String url = "https://kmb5alta.online/";

    // POST - Make Transaction BCA
    @Step("I set the POST endpoint for making a BCA transaction")
    public String setPostMakeBCATransactionEndpoint() {
        return url + "transaksi";
    }

    @Step("I send an HTTP POST request with valid parameters and baseURL for making a BCA transaction")
    public void sendPostMakeBCATransactionRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("topic_id", 1);
        requestBody.put("patient_id", 35);
        requestBody.put("doctor_id", 13);
        requestBody.put("method_id", 1);
        requestBody.put("duration_id", 1);
        requestBody.put("counseling_id", 1);
        requestBody.put("counseling_session", 1);
        requestBody.put("counseling_type", "A");
        requestBody.put("price_method", 180000);
        requestBody.put("price_counseling", 500000);
        requestBody.put("price_duration", 40000);
        requestBody.put("payment_type", "bca");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + LoginPatient.token)
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .post(setPostMakeBCATransactionEndpoint());
    }

    @Step("I receive a valid data response for BCA transaction with HTTP status code 201 Created")
    public void validatePostMakeBCATransactionResponse() {
        restAssuredThat(response -> response.statusCode(201));
    }

    // POST - Make Transaction BNI
    @Step("I set the POST endpoint for making a BNI transaction")
    public String setPostMakeBNITransactionEndpoint() {
        return url + "transaksi";
    }

    @Step("I send an HTTP POST request with valid parameters and baseURL for making a BNI transaction")
    public void sendPostMakeBNITransactionRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("topic_id", 1);
        requestBody.put("patient_id", 35);
        requestBody.put("doctor_id", 13);
        requestBody.put("method_id", 1);
        requestBody.put("duration_id", 1);
        requestBody.put("counseling_id", 1);
        requestBody.put("counseling_session", 1);
        requestBody.put("counseling_type", "A");
        requestBody.put("price_method", 180000);
        requestBody.put("price_counseling", 500000);
        requestBody.put("price_duration", 40000);
        requestBody.put("payment_type", "bni");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + LoginPatient.token)
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .post(setPostMakeBNITransactionEndpoint());
    }

    @Step("I receive a valid data response for BNI transaction with HTTP status code 201 Created")
    public void validatePostMakeBNITransactionResponse() {
        restAssuredThat(response -> response.statusCode(201));
    }


    // POST - Make Transaction BRI
    @Step("I set the POST endpoint for making a BRI transaction")
    public String setPostMakeBRITransactionEndpoint() {
        return url + "transaksi";
    }

    @Step("I send an HTTP POST request with valid parameters and baseURL for making a BRI transaction")
    public void sendPostMakeBRITransactionRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("topic_id", 1);
        requestBody.put("patient_id", 35);
        requestBody.put("doctor_id", 13);
        requestBody.put("method_id", 1);
        requestBody.put("duration_id", 1);
        requestBody.put("counseling_id", 1);
        requestBody.put("counseling_session", 1);
        requestBody.put("counseling_type", "A");
        requestBody.put("price_method", 180000);
        requestBody.put("price_counseling", 500000);
        requestBody.put("price_duration", 40000);
        requestBody.put("payment_type", "bri");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + LoginPatient.token)
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .post(setPostMakeBRITransactionEndpoint());
    }

    @Step("I receive a valid data response for BRI transaction with HTTP status code 201 Created")
    public void validatePostMakeBRITransactionResponse() {
        restAssuredThat(response -> response.statusCode(201));
    }

    // POST - Make Transaction Gopay
    @Step("I set the POST endpoint for making a Gopay transaction")
    public String setPostMakeGopayTransactionEndpoint() {
        return url + "transaksi";
    }

    @Step("I send an HTTP POST request with valid parameters and baseURL for making a Gopay transaction")
    public void sendPostMakeGopayTransactionRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("topic_id", 1);
        requestBody.put("patient_id", 35);
        requestBody.put("doctor_id", 13);
        requestBody.put("method_id", 1);
        requestBody.put("duration_id", 1);
        requestBody.put("counseling_id", 1);
        requestBody.put("counseling_session", 1);
        requestBody.put("counseling_type", "A");
        requestBody.put("price_method", 180000);
        requestBody.put("price_counseling", 500000);
        requestBody.put("price_duration", 40000);
        requestBody.put("payment_type", "gopay");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + LoginPatient.token)
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .post(setPostMakeGopayTransactionEndpoint());
    }

    @Step("I receive a valid data response for Gopay transaction with HTTP status code 201 Created")
    public void validatePostMakeGopayTransactionResponse() {
        restAssuredThat(response -> response.statusCode(201));
    }

    // POST - Make Transaction Qris
    @Step("I set the POST endpoint for making a Qris transaction")
    public String setPostMakeQrisTransactionEndpoint() {
        return url + "transaksi";
    }

    @Step("I send an HTTP POST request with valid parameters and baseURL for making a Qris transaction")
    public void sendPostMakeQrisTransactionRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("topic_id", 1);
        requestBody.put("patient_id", 35);
        requestBody.put("doctor_id", 13);
        requestBody.put("method_id", 1);
        requestBody.put("duration_id", 1);
        requestBody.put("counseling_id", 1);
        requestBody.put("counseling_session", 1);
        requestBody.put("counseling_type", "A");
        requestBody.put("price_method", 180000);
        requestBody.put("price_counseling", 500000);
        requestBody.put("price_duration", 40000);
        requestBody.put("payment_type", "qris");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + LoginPatient.token)
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .post(setPostMakeQrisTransactionEndpoint());
    }

    @Step("I receive a valid data response for Qris transaction with HTTP status code 201 Created")
    public void validatePostMakeQrisTransactionResponse() {
        restAssuredThat(response -> response.statusCode(201));
    }

    // GET - Get All Transactions from User ID
    @Step("I set the GET endpoint for retrieving all transactions for a specific user ID")
    public String setGetAllTransactionsForUserIdEndpoint(){
        return url + "transaksi/22";

    }
    @Step("I send an HTTP GET request with valid parameters and baseURL for retrieving all transactions for a specific user ID")
    public void sendGetAllTransactionsForUserIdRequest(){
        SerenityRest.given()
                .when()
                .header("Authorization", "Bearer " + LoginPatient.token)
                .get(setGetAllTransactionsForUserIdEndpoint());

    }
    @Step("I receive a valid data response for retrieving all transactions mindtrans with HTTP status code 200 OK")
    public void validateGetAllTransactionsForUserIdResponse(){
        restAssuredThat(response ->response.statusCode(200));
    }

    // GET - Get Filtered By Payment Type Transactions from User ID
    @Step("I set the GET endpoint for retrieving transactions filtered by payment type for a specific user ID")
    public String setGetFilteredByPaymentTypeTransactionsEndpoint() {
        return url + "transaksi/patient/22";
    }

    @Step("I send an HTTP GET request with valid parameters and baseURL for retrieving transactions filtered by payment type for a specific user ID")
    public void sendGetFilteredByPaymentTypeTransactionsRequest() {
        SerenityRest.given()
                .when()
                .header("Authorization", "Bearer " + LoginPatient.token)
                .get(setGetFilteredByPaymentTypeTransactionsEndpoint());
    }

    @Step("I receive a valid data response for retrieving transactions filtered by payment type with HTTP status code 200 OK")
    public void validateGetFilteredByPaymentTypeTransactionsResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // GET - Get All Transactions
    @Step("I set the GET endpoint for retrieving all transactions mindtrans")
    public String setGetAllTransactionsEndpoint() {
        return url + "transaksi";
    }

    @Step("I send an HTTP GET request with valid parameters and baseURL for retrieving all transactions")
    public void sendGetAllTransactionsRequest() {
        SerenityRest.given()
                .when()
                .header("Authorization", "Bearer " + LoginPatient.token)
                .get(setGetAllTransactionsEndpoint());
    }

    @Step("I receive a valid data response for retrieving all mindtrans transactions with HTTP status code 200 OK")
    public void validateGetAllTransactionsResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // GET - Get Sorted By Payment Type All Transactions
    @Step("I set the GET endpoint for retrieving transactions sorted by payment type")
    public String setGetSortedByPaymentTypeAllTransactionsEndpoint() {
        return url + "transaksi";
    }

    @Step("I send an HTTP GET request with valid parameters and baseURL for retrieving transactions sorted by payment type")
    public void sendGetSortedByPaymentTypeAllTransactionsRequest() {
        SerenityRest.given()
                .when()
                .header("Authorization", "Bearer " + LoginPatient.token)
                .param("payment_type", "manual")
                .get(setGetSortedByPaymentTypeAllTransactionsEndpoint());
    }

    @Step("I receive a valid data response for retrieving transactions sorted by payment type with HTTP status code 200 OK")
    public void validateGetSortedByPaymentTypeAllTransactionsResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // GET - Get Show Transaction Status By Midtrans ID
    @Step("I set the GET endpoint for retrieving transaction status by Midtrans ID transaction")
    public String setGetShowTransactionStatusByMidtransIDEndpoint() {
        return url + "transaksi/check/B-1702403584";
    }

    @Step("I send an HTTP GET request with valid parameters and baseURL for retrieving transaction status by Midtrans ID")
    public void sendGetShowTransactionStatusByMidtransIDRequest() {
        SerenityRest.given()
                .when()
                .header("Authorization", "Bearer " + LoginPatient.token)
                .get(setGetShowTransactionStatusByMidtransIDEndpoint());
    }

    @Step("I receive a valid data response midtrans for retrieving transaction status by Midtrans ID with HTTP status code 200 OK")
    public void validateGetShowTransactionStatusByMidtransIDResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // GET - Get invalid Endpoint
    @Step("I set the GET endpoint for an invalid request midtrans transaction")
    public String setGetInvalidEndpoint() {
        return url + "transaks";
    }

    @Step("I send an HTTP GET request with an invalid baseURL for an invalid request midtrans")
    public void sendGetInvalidEndpointRequest() {
        SerenityRest.given()
                .when()
                .header("Authorization", "Bearer " + LoginPatient.token)
                .get(setGetInvalidEndpoint());
    }

    @Step("I receive an error response with HTTP status code 404 Not Found for an invalid request midtrans")
    public void validateGetInvalidEndpointResponse() {
        restAssuredThat(response -> response.statusCode(404));
    }

}
