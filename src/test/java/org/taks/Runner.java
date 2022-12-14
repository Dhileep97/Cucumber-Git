package org.taks;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Myntra",glue = "org.taks",
monochrome = true,
dryRun = false,
snippets = SnippetType.CAMELCASE,
plugin = {"html:repo","junit:repo\\junitsreport.xml","json:repo\\jsonsreport.json"})
public class Runner {

}
