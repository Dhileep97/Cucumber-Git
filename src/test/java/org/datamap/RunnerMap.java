package org.datamap;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/FbDataMap",
glue = "org.datamap",
monochrome = true,
dryRun = false)
public class RunnerMap {

}
