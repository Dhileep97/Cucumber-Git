package org.hooks;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//for background
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/hooks",
glue = "org.hooks",
monochrome = true,
dryRun = false,strict = true)
public class TestRunnerClass {

}