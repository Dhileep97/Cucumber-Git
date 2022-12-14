package org.stepmail;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/gmail",
glue = "org.stepmail",
dryRun = false,
monochrome = true)
public class Runnerclass {

}
