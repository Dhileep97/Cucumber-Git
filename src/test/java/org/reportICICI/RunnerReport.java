package org.reportICICI;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/ICICIReport",
glue = "org.reportICICI",
dryRun = false,monochrome = true,
snippets = SnippetType.CAMELCASE,
plugin = {"html:Report","junit:Report\\junitsreport.xml","json:Report\\jsonsreport.json"})
public class RunnerReport {

}
