package org.tagBasicMyntra;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Myntratag",monochrome = true,
glue = "org.tagBasicMyntra",dryRun = false,
snippets = SnippetType.CAMELCASE,strict = true,
tags = {"@Regression,@Sanity"})
public class TestRunnerMyntra {

}
