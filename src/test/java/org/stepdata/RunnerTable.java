package org.stepdata;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/FbDataTable",
monochrome = true,
dryRun = false,
glue = "org.stepdata")
public class RunnerTable {
	

}
