package starter;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features/Web_Doctor.feature"},
        glue = {"stepdefinitions"},
        tags = "@Web_Doctor")
public class TestRunner {
}
