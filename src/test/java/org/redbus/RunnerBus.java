package org.redbus;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Redbus",glue = "org.redbus",
monochrome = true,
dryRun = false,strict = true,
snippets = SnippetType.CAMELCASE,tags = {"@tag1,@tag2"},
plugin = {"html:Report","junit:Report\\junitsreport.xml","json:Report\\jsonsreport.json"})
public class RunnerBus {

}
