package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.restapi.Web_DoctorArticles;

public class Web_DoctorArticlesSteps {

    @Steps
    Web_DoctorArticles web_doctorArticles;

    //  [Positive] POST - Success Create Article Doctor
    @Given("I set a POST request to a valid endpoint for creating a new articles doctor")
    public void iSetAPOSTRequestToAValidEndpointForCreatingANewArticlesDoctor() {
        web_doctorArticles.iSetAPOSTRequestToAValidEndpointForCreatingANewArticlesDoctor();
    }

    @When("I send the POST request to create a new articles doctor")
    public void iSendThePOSTRequestToCreateANewArticlesDoctor() {
        String categoryId = "2";
        String title = "Kecemasan diri";
        String content = "Mencegah kecemasan diri";
        String thumbnail = "C:/Users/laras/OneDrive/Pictures/Icon/1.png";
        //String thumbnail = "/Users/Anastasya/OneDrive/thumbnail.jpg";

        web_doctorArticles.iSendThePOSTRequestToCreateANewArticlesDoctor(categoryId,title,content,thumbnail);
    }

    @Then("I receive an HTTP response with code 201 for creating a new articles doctor")
    public void ResponseWithCode201ForCreatingANewArticlesDoctor() {
        web_doctorArticles.ResponseWithCode201ForCreatingANewArticlesDoctor();
    }

    // [Negative] POST - Error Invalid User Input Thumbnail
    @Given("I set a POST request with invalid input for creating a new articles doctor")
    public void iSetAPOSTRequestWithInvalidInputForCreatingANewArticlesDoctor() {
        web_doctorArticles.iSetAPOSTRequestWithInvalidInputForCreatingANewArticlesDoctor();
    }

    @When("I send the POST request with invalid input thumbnail for creating a new articles doctor")
    public void iSendThePOSTRequestWithInvalidInputThumbnailForCreatingANewArticlesDoctor() {
        String categoryId = "2";
        String title = "Kecemasan diri";
        String content = "Mencegah kecemasan diri";
      //  String thumbnail = "/Users/Anastasya/OneDrive/Quality Engineer-empathiCare.docx";

        web_doctorArticles.iSendThePOSTRequestWithInvalidInputThumbnailForCreatingANewArticlesDoctor(categoryId,title,content);
    }

    @Then("I receive an HTTP response with code 400 for creating a invalid input thumbnail")
    public void ResponseWithCode400ForCreatingAInvalidInputThumbnail() {
        web_doctorArticles.ResponseWithCode400ForCreatingAInvalidInputThumbnail();
    }


    // [Negative] POST - Invalid User Input
    @Given("I set a POST request with invalid user input for creating a new articles doctor")
    public void iSetAPOSTRequestWithInvalidUserInputForCreatingANewArticlesDoctor() {
        web_doctorArticles.iSetAPOSTRequestWithInvalidUserInputForCreatingANewArticlesDoctor();
    }

    @When("I send the POST request with invalid user input for creating a new articles doctor")
    public void iSendThePOSTRequestWithInvalidUserInputForCreatingANewArticlesDoctor() {
        String categoryId = "asd";
        String title = "123";
        String content = "Mencegah kecemasan diri";
        String thumbnail = "Users/laras/OneDrive/Pictures/Icon/1.png";
        //String thumbnail = "/Users/Anastasya/OneDrive/thumbnail.jpg";

        web_doctorArticles.iSendThePOSTRequestWithInvalidUserInputForCreatingANewArticlesDoctor(categoryId,title,content,thumbnail);
    }

    @Then("I receive an HTTP response with code 400 for creating a invalid user input")
    public void ResponseWithCode400ForCreatingAInvalidUserInput() {
        web_doctorArticles.ResponseWithCode400ForCreatingAInvalidUserInput();
    }

    // [Positive] PUT - Success Update Article Doctor
    @Given("I set a valid PUT endpoint Update articles doctor")
    public void iSetAValidPUTEndpointUpdateArticlesDoctor() {
        web_doctorArticles.iSetAValidPUTEndpointUpdateArticlesDoctor();
    }

    @When("I sends a PUT HTTP request Update articles doctor")
    public void RequestUpdateArticlesDoctor() {
        String title = "Menghadapi Insecure";
        String content = "Insecure banyak dialami oleh remaja jaman sekarang";
        String thumbnail = "C:/Users/laras/OneDrive/Pictures/Icon/1.png";

        //  String thumbnail = "/Users/Anastasya/OneDrive/thumbnail.jpg";

        web_doctorArticles.RequestUpdateArticlesDoctor(title,content,thumbnail);
    }

    @Then("I receives an HTTP response code 200 with valid endpoint for update articles doctor")
    public void ResponseCode200WithValidEndpointForUpdateArticlesDoctor() {
        web_doctorArticles.ResponseCode200WithValidEndpointForUpdateArticlesDoctor();
    }

    // [Negative] PUT - Invalid Param ID
    @Given("I set an valid PUT endpoint Update articles doctor with an invalid param ID")
    public void iSetAnValidPUTEndpointUpdateArticlesDoctorWithAnInvalidParamID() {
        web_doctorArticles.iSetAnValidPUTEndpointUpdateArticlesDoctorWithAnInvalidParamID();
    }

    @When("I sends a PUT HTTP request Update articles doctor with an invalid param ID")
    public void iSendsAPUTHTTPRequestUpdateArticlesDoctorWithAnInvalidParamID() {

        web_doctorArticles.iSendsAPUTHTTPRequestUpdateArticlesDoctorWithAnInvalidParamID();
    }

    @Then("I receives an HTTP response code 400 with invalid param ID for articles doctor")
    public void ResponseCode400WithInvalidParamIDForArticlesDoctor() {
        web_doctorArticles.ResponseCode400WithInvalidParamIDForArticlesDoctor();
    }

    // [Negative] PUT - Invalid User Input Thumbnail
    @Given("I set an valid PUT endpoint Update articles doctor with an invalid user input thumbnail")
    public void iSetAnValidPUTEndpointUpdateArticlesDoctorWithAnInvalidUserInputThumbnail() {
        web_doctorArticles.iSetAnValidPUTEndpointUpdateArticlesDoctorWithAnInvalidUserInputThumbnail();
    }

    @When("I sends a PUT HTTP request Update Articles Category with an invalid user input thumbnail")
    public void iSendsAPUTHTTPRequestUpdateArticlesCategoryWithAnInvalidUserInputThumbnail() {
        String title = "Menghadapi Insecure";
        String content = "Insecure banyak dialami oleh remaja jaman sekarang";

        web_doctorArticles.iSendsAPUTHTTPRequestUpdateArticlesCategoryWithAnInvalidUserInputThumbnail(title,content);
    }

    @Then("I receives an HTTP response code 400 with invalid user input thumbnail")
    public void ResponseCode400WithInvalidUserInputThumbnail() {
        web_doctorArticles.ResponseCode400WithInvalidUserInputThumbnail();
    }

    // [Positive] GET - Get Data Articles By Doctor
    @Given("I set authentication endpoint to retrieve articles doctor")
    public void iSetAuthenticationEndpointToRetrieveArticlesDoctor() {
        web_doctorArticles.iSetAuthenticationEndpointToRetrieveArticlesDoctor();
    }

    @When("I send an HTTP GET request to fetch articles doctor using a valid endpoint")
    public void iSendAnHTTPGETRequestToFetchArticlesDoctorUsingAValidEndpoint() {
        web_doctorArticles.iSendAnHTTPGETRequestToFetchArticlesDoctorUsingAValidEndpoint();
    }

    @Then("I should receive a valid HTTP response with status code 200 for articles doctor")
    public void ResponseWithStatusCode200ForArticlesDoctor() {
        web_doctorArticles.ResponseWithStatusCode200ForArticlesDoctor();
    }
}


