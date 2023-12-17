package starter.restapi;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Web_DoctorWithdrawBalance {

    protected static String url = "https://kmb5alta.online/";

    // [Positive] POST - Add Withdraw
    @Step("I POST endpoint is set for adding a withdrawal for withdrawal successfully")
    public String setAddWithdrawalEndpoint() {
        return url + "withdraw";
    }

    @Step("I HTTP POST request with valid parameters and baseURL is sent for adding a withdrawal for withdrawal successfully")
    public void sendAddWithdrawalRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("balance_req", 50000);
        requestBody.put("payment_method", "BCA");
        requestBody.put("payment_number", "1223232");
        requestBody.put("payment_name", "Ilham Budiawan");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + LoginDoctor.token)
                .body(requestBody.toJSONString())
                .when()
                .post(setAddWithdrawalEndpoint());
    }

    @Step("I valid data response for the withdrawal addition is received with HTTP status code 201 Created")
    public void validateAddWithdrawalResponse() {
        restAssuredThat(response -> response.statusCode(400));
    }

    // [Negative] POST - Failed Validate
    @Step("I POST endpoint is set for adding a withdrawal for failed validation")
    public String setAddWithdrawalEndpointFailedValidation() {
        return url + "withdraw";
    }

    @Step("I HTTP POST request with valid parameters and baseURL is sent for adding a withdrawal for failed validation")
    public void sendAddWithdrawalRequestFailedValidation() {
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + LoginDoctor.token)
                .when()
                .post(setAddWithdrawalEndpointFailedValidation());
    }

    @Step("I error response for failed validation is received with HTTP status code 400 Bad Request  for failed validation")
    public void validateAddWithdrawalResponseFailedValidation() {
        restAssuredThat(response -> response.statusCode(400));
    }

    // [Positive] POST - Balance Not Enough
    @Step("I POST endpoint is set for adding a withdrawal with insufficient balance")
    public String setAddWithdrawalEndpointBalanceNotEnough() {
        return url + "withdraw";
    }

    @Step("I HTTP POST request with valid parameters and baseURL is sent for adding a withdrawal with insufficient balance")
    public void sendAddWithdrawalRequestBalanceNotEnough() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("balance_req", 500000000);
        requestBody.put("payment_method", "BCA");
        requestBody.put("payment_number", "1223232");
        requestBody.put("payment_name", "Ilham Budiawan");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + LoginDoctor.token)
                .body(requestBody.toJSONString())
                .when()
                .post(setAddWithdrawalEndpointBalanceNotEnough());
    }

    @Step("I valid data response indicating insufficient balance is received with HTTP status code 500 Internal Server Error")
    public void validateAddWithdrawalResponseBalanceNotEnough() {
        restAssuredThat(response -> response.statusCode(400));
    }

    // [Negative] POST - Invalid endpoint
    @Step("I POST endpoint is set to an invalid endpoint")
    public String setAddWithdrawalEndpointInvalid() {
        return url + "withdra";
    }

    @Step("I HTTP POST request with valid parameters and baseURL is sent for adding a withdrawal")
    public void sendAddWithdrawalRequestInvalid() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("balance_req", 500000000);
        requestBody.put("payment_method", "BCA");
        requestBody.put("payment_number", "1223232");
        requestBody.put("payment_name", "Ilham Budiawan");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + LoginDoctor.token)
                .body(requestBody.toJSONString())
                .when()
                .post(setAddWithdrawalEndpointInvalid());
    }

    @Step("I error response for an invalid endpoint is received with HTTP status code 404 Not Found")
    public void validateAddWithdrawalResponseInvalid() {
        restAssuredThat(response -> response.statusCode(404));
    }

    // [Positive] GET - Get All Withdraw
    @Step("I GET endpoint is set for retrieving all withdrawals")
    public String setGetAllWithdrawEndpoint() {
        return url + "doctor/withdraw";
    }

    @Step("I HTTP GET request with valid parameters and baseURL is sent for retrieving all withdrawals")
    public void sendGetAllWithdrawRequest() {
        SerenityRest.given()
                .when()
                .header("Authorization", "Bearer " + LoginDoctor.token)
                .get(setGetAllWithdrawEndpoint());
    }

    @Step("I valid data response for retrieving all withdrawals is received with HTTP status code 200 OK")
    public void validateGetAllWithdrawResponse() {
        restAssuredThat(response -> response.statusCode(500));
    }
}
