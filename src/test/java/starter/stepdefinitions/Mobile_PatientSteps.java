package starter.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Mobile_PatientSteps {
    @Steps
    Mobile_PatientSteps mobilePatientSteps;

    // [Positive] GET All Patient
    @Given("I set the GET endpoint for Get all patient")
    public static void setGetAllPatientEndpoint() {Mobile_PatientSteps.setGetAllPatientEndpoint();}
    @When("I send an HTTP GET request with a valid baseURL for get all patient")
    public static void setGetvalURL() {Mobile_PatientSteps.setGetvalURL();}
    @Then("I receive a response status 200 OK get all patient")
    public static void response200() {Mobile_PatientSteps.response200();}

    //[Positive] GET All Patient Empty Data
    @Given("I set the GET endpoint for Get all patient Empty Data")
    public static void setGetAllEmp1() {Mobile_PatientSteps.setGetAllEmp1();}
    @When("I send an HTTP GET request with a valid baseURL for get all patient empty data")
    public static void setGetvalURL1() {Mobile_PatientSteps.setGetvalURL1();}
    @Then("I receive a response status 200 OK empty data patient")
    public static void response2001() {Mobile_PatientSteps.response2001();}

    // [Positive] GET Patient By ID
    @Given("I set the GET endpoint for Patient By ID")
    public static void getPatientbyId() {Mobile_PatientSteps.getPatientbyId();}
    @When("I send an HTTP GET request with a valid baseURL for get patient by ID")
    public static void  getValURLID() {Mobile_PatientSteps.getValURLID();}
    @Then("I receive a response status 200 OK get patient by ID")
    public static void res200ID() {Mobile_PatientSteps.res200ID();}


}
