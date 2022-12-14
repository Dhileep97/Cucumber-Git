package org.stepFlipkart;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Flipkart",glue = "org.stepFlipkart",monochrome = true)
public class Runner {

}
