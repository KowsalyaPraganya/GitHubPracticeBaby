package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:/features",glue = "StepDef",
                 plugin = {"rerun:target/report.txt"})
                 
public class Runner {

}
//"src/test/resources/features/Login.feature"