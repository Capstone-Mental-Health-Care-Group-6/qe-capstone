package starter.restapi.MobileAuthentication;

import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.io.File;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class POST_RegisterMobile {

    public String endpoint_register_mobile = "104.198.45.50:80/patient/register ";

    // [Positive] POST - Register Success
    @Step("I have a valid registration mobile endpoint")
    public String ValidRegistrationMobileEndpoint() {
        return endpoint_register_mobile;
    }

    @Step("I provide valid user information for registration")
    public void ProvideValidUserInformationForRegistration() {
        String filePath = "src/test/resources/avatar/avatar1.jpeg"; // Sesuaikan dengan lokasi sebenarnya
        File file = new File(filePath);

        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("name", "fauzi")
                .multiPart("email", "fauzihidayat@gmail.com")
                .multiPart("password", "fauzi1234")
                .multiPart("date_of_birth", "2000-10-20")
                .multiPart("gender", "laki-laki")
                .multiPart("phone_number", "0812345678")
                .multiPart("avatar", file)
                .post(ValidRegistrationMobileEndpoint());
        // Jika Anda menggunakan form data yang melibatkan file (seperti avatar), metode yang benar adalah multiPart karena ini memungkinkan pengiriman data multipart/form-data
        // yang mencakup file. Jadi, dalam kasus ini, penggunaan multiPart akan lebih tepat daripada formParam.
    }

    @Step("I should receive a response with HTTP status code 200 OK and successfully registered")
    public void ResponseWithHTTPStatusCode200OKAndSuccessfullyRegistered() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // [Negative] POST - Register Error Upload Avatar
    @Step("I provide valid user information with an invalid avatar for registration")
    public void ProvideValidUserInformationWithAnInvalidAvatarForRegistration() {
        String filePath = "src/test/resources/nama_folder/nama_file.png"; //
        File file = new File(filePath);

        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("name", "fauzi")
                .multiPart("email", "fauzihidayat@gmail.com")
                .multiPart("password", "fauzi1234")
                .multiPart("date_of_birth", "2000-10-20")
                .multiPart("gender", "laki-laki")
                .multiPart("phone_number", "0812345678")
                .multiPart("avatar", file)
                .post(ValidRegistrationMobileEndpoint());
    }

    @Step("I should receive a response with HTTP status code 400 Bad Request due to invalid avatar")
    public void ResponseWithHTTPStatusCode400BadRequestDueToInvalidAvatar() {
        restAssuredThat(response -> response.statusCode(400));
    }

    // [Negative] POST - Register Duplicate Email
    @Step("I provide valid user information for a user account with a duplicate email")
    public void ProvideValidUserInformationForAUserAccountWithADuplicateEmail() {
        String filePath = "src/test/resources/avatar/avatar1.jpeg"; // Sesuaikan dengan lokasi sebenarnya
        File file = new File(filePath);

        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("name", "fauzi")
                .multiPart("email", "fauzihidayat@gmail.com") // duplicate email
                .multiPart("password", "fauzi1234")
                .multiPart("date_of_birth", "2000-10-20")
                .multiPart("gender", "laki-laki")
                .multiPart("phone_number", "0812345678")
                .multiPart("avatar", file)
                .post(ValidRegistrationMobileEndpoint());
        // Jika Anda menggunakan form data yang melibatkan file (seperti avatar), metode yang benar adalah multiPart karena ini memungkinkan pengiriman data multipart/form-data
        // yang mencakup file. Jadi, dalam kasus ini, penggunaan multiPart akan lebih tepat daripada formParam.
    }

    @Step("I should receive a response with HTTP status code 400 Bad Request due to duplicate email")
    public void ResponseWithHTTPStatusCode400BadRequestDueToDuplicateEmail() {
        restAssuredThat(response -> response.statusCode(400));
    }
}
