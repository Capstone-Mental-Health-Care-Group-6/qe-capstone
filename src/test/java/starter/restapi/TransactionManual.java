package starter.restapi;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class TransactionManual {

    protected static String url = "https://kmb5alta.online/";

    // [Positive] PUT - Update Transaction
    @Step("I set the PUT endpoint for updating a transaction")
    public String setPutUpdateTransactionEndpoint() {
        return url + "transaksi/M-1701979290";
    }

    @Step("I send an HTTP PUT request with valid parameters and baseURL for updating a transaction")
    public void sendHttpPutRequestForUpdateTransaction() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("payment_status", 4);

        SerenityRest
                .given()
                .header("Authorization", "xxxx")
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .put(setPutUpdateTransactionEndpoint());
    }

    @Step("I receive a valid data response for updating a transaction with HTTP status code 200 OK")
    public void validateUpdateTransactionResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }

}
