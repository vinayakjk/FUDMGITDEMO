package testrunners;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;;

@RunWith(Cucumber.class)
@CucumberOptions(
		
			features = {"src/test/java/AppFeatures"},
			glue = {"stepdefinations"}		
		)


public class AmazonTest {

	
}
