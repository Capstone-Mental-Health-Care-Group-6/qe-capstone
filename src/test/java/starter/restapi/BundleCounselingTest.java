package starter.restapi;

import io.restassured.response.Response;
import org.junit.Test;

public class BundleCounselingTest {

    @Test
    public void testCreateBundle() {
        // Set up test data
        String name = "Test";
        int sessions = 1;
        String type = "PREMIUM";
        int price = 300000;
        String description = "Test";
        int activePeriod = 1;
        String avatarPath = "/Users/laras/OneDrive/Pictures/Icon/1.png";

        // Send the create bundle request
        Response createBundleResponse = BundleCounseling.sendCreateBundleRequest(name, sessions, type, price, description, activePeriod, avatarPath);

        // Validate the response
        BundleCounseling.validateCreateBundle201(createBundleResponse);
    }
}
