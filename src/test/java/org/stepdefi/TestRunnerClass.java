package org.stepdefi;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//for dry test
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Fb", glue = "org.stepdefinition", monochrome = true, dryRun = false)
public class TestRunnerClass {

}
//for background
/*@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/fbbackground", glue = "org.stepdefinition", monochrome = true, dryRun = false)
public class TestRunnerClass {

}*/