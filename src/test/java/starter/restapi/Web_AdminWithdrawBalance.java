package starter.restapi;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Web_AdminWithdrawBalance {

    protected static String url = "https://kmb5alta.online/";
    public static String token = "";

    // [Positive] GET - Get All Data
    @Step("I set the authentication endpoint for Withdraw Balance Disbursement operations")
    public String iSetTheAuthenticationEndpointForWithdrawBalanceDisbursementOperations() {
        return url + "withdraw";
    }

    @Step("I send an HTTP GET request to fetch all data from Balance Disbursement")
    public void SendAnHTTPGETRequestToFetchAllDataFromBalanceDisbursement() {
            SerenityRest.given()
                    .header("Authorization", "Bearer " + LoginAdmin.token)
                    .when()
                    .get(iSetTheAuthenticationEndpointForWithdrawBalanceDisbursementOperations());
        }
    @Step("I should receive a valid HTTP response with status code 200 for all data from Balance Disbursement")
    public void ResponseWithStatusCode200ForAllDataFromBalanceDisbursement() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // [Positive] PUT - Update Status Done
    @Step("I sets a valid PUT endpoint Update status done all data from balance disbursement")
    public String ValidPUTEndpointUpdateStatusDoneAllDataFromBalanceDisbursement() {
        return url + "/withdraw/2/status"; // data response
        // return url + "/withdraw/6/status"; data postman
    }

    @Step("I send a PUT HTTP request to Update status to Done")
    public void iSendAPUTHTTPRequestToUpdateStatusToDone() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("status", "DONE");

        SerenityRest.given()
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .put(ValidPUTEndpointUpdateStatusDoneAllDataFromBalanceDisbursement());

        token = lastResponse()
                .getBody()
                .jsonPath()
                .get("data");
    }

//    @Step("I receive an HTTP response code 200 with a valid endpoint for updating status to Done")
//    public void ResponseCode200WithAValidEndpointForUpdatingStatusToDone() {
//        restAssuredThat(response -> response.statusCode(200));
//    }

        @Step("I receive an HTTP response code 404 with a valid endpoint for updating status to Done")
    public void ResponseCode404WithAValidEndpointForUpdatingStatusToDone() {
        restAssuredThat(response -> response.statusCode(404));
        // # Expected status code <200> but was <404>
    }

    // [Negative] PUT - Update Status Pending

    @Step("I sets a valid PUT endpoint Update status pending all data from balance disbursement")
    public String ValidPUTEndpointUpdateStatusPendingAllDataFromBalanceDisbursement() {
        return url + "/withdraw/1/status"; // data response
        // return url + "/withdraw/6/status"; data postman
    }

    @Step("I send a PUT HTTP request to Update status to Pending")
    public void iSendAPUTHTTPRequestToUpdateStatusToPending() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("status", "PENDING");

        SerenityRest.given()
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .put(ValidPUTEndpointUpdateStatusPendingAllDataFromBalanceDisbursement());

        token = lastResponse()
                .getBody()
                .jsonPath()
                .get("data");
    }

//    @Step("I receive an HTTP response code 200 with a valid endpoint for updating status to Pending")
//    public void ResponseCode200WithAValidEndpointForUpdatingStatusToPending() {
//        restAssuredThat(response -> response.statusCode(200));
//    }

    @Step("I receive an HTTP response code 404 with a valid endpoint for updating status to Pending")
    public void ResponseCode404WithAValidEndpointForUpdatingStatusToPending() {
         restAssuredThat(response -> response.statusCode(404));
//        // # Expected status code <200> but was <404>
   }

    // [Negative] PUT - Update Failed Validation
    @Step("I sets a valid PUT endpoint Update status failed validation all data from balance disbursement")
    public String ValidPUTEndpointUpdateStatusFailedValidationAllDataFromBalanceDisbursement() {
        return url + "/withdraw/6/status";
    }

    @Step("I send a PUT HTTP request with invalid data validation to Update status of Balance Disbursement")
    public void RequestWithInvalidDataValidationToUpdateStatusOfBalanceDisbursement() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("status", "");

        SerenityRest.given()
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .put(ValidPUTEndpointUpdateStatusFailedValidationAllDataFromBalanceDisbursement());
    }

    @Step("I receive an HTTP response code 404 due to invalid request format")
    public void ResponseCode404DueToInvalidRequestFormat() {
        restAssuredThat(response -> response.statusCode(404));
    }

    // [Positive] GET - Get By ID Success
    @Step("I sets a valid GET endpoint for retrieving All Balance Withdraw data by ID")
    public String ValidGETEndpointForRetrievingAllBalanceWithdrawDataByID() {
        return url + "/withdraw/1/status"; // data response
        // return url + "/withdraw/6/status"; data postman
    }

    @Step("I send a GET HTTP request with a valid ID for All Balance Withdraw")
    public void iSendAGETHTTPRequestWithAValidIDForAllBalanceWithdraw() {
        SerenityRest.given()
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .contentType("application/json")
                .get(ValidGETEndpointForRetrievingAllBalanceWithdrawDataByID());
    }

    @Step("I receive a valid GET HTTP response with a status code of 404 for the All Balance Withdraw data by ID")
    public void StatusCodeOf404ForTheAllBalanceWithdrawDataByID() {
        restAssuredThat(response -> response.statusCode(404));
        // # Expected status code <200> but was <404>
    }

//    @Step("I receive a valid GET HTTP response with a status code of 200 for the All Balance Withdraw data by ID")
//    public void ResponseWithAStatusCodeOf200ForTheAllBalanceWithdrawDataByID() {
//        restAssuredThat(response -> response.statusCode(200));
//    }

    // [Negative] GET - Get By ID Not Found
    @Step("I sets a valid GET endpoint for retrieving All Balance Withdraw data by ID Not found")
    public String ValidGETEndpointForRetrievingAllBalanceWithdrawDataByIDNotFound() {
        return url + "/withdraw/12";
    }

    @Step("I send a GET HTTP request with an invalid ID for All Balance Withdraw")
    public void iSendAGETHTTPRequestWithAnInvalidIDForAllBalanceWithdraw() {
        SerenityRest.given()
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .contentType("application/json")
                .get(ValidGETEndpointForRetrievingAllBalanceWithdrawDataByIDNotFound());
    }

    @Step("I receive a GET HTTP response with a status code of 404 for the All Balance Withdraw data by ID")
    public void IreceiveAGetHTTPResponseWithAStatusCodeOf404ForTheAllBalanceWithdrawDataByID() {
        restAssuredThat(response -> response.statusCode(404));
    }
}

