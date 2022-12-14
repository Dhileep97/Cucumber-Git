package org.TagBasicFbLogin;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Fbtag",monochrome = true,
dryRun = false ,glue = "org.TagBasicFbLogin",tags = {"@Feature1,@Feature2"})
public class TestRunner {

}
