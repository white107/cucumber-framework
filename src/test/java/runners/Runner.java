package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@smoke and @regression",
        dryRun = false
)
public class Runner {
}
/*
 * -Runner is used to run feature files
 * -@RunWith is used to run the class. Without this, Runner class will not be runnable
 * -@CucumberOptions is used to add feature path, step definition path,tags, dryRun, report plug ins
 * -features   :  path of the features folder. this can point path of specific feature file
 * -glue       :  path of step definitions folder. this can pint path of specific step definition class
 * -tags       :  this marks which feature file to run. we add this tag in the feature files
 * -dryRun     : -dryRun is used to check if there is any MISSING JAVA CODE(STEP DEFINITIONS)
 *               -dryRun takes 2 values, true or false
 *               -dryRun = false :Runs tests on the browser while checking if there is any JAVA code missing
 *               -dryRun = true  :Runs tests without browser while checking if there is any JAVA code missing
 * */