$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Redbus/redbuslogin.feature");
formatter.feature({
  "name": "Validate Redbus login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "validate login with valid mobile number",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "Launch browser and maximize window",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.launchBrowserAndMaximizeWindow()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "launch url",
  "keyword": "When "
});
formatter.match({
  "location": "Login.launchUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click profile icon",
  "keyword": "And "
});
formatter.match({
  "location": "Login.clickProfileIcon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click signup button",
  "keyword": "And "
});
formatter.match({
  "location": "Login.clickSignupButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter mobile number",
  "keyword": "And "
});
formatter.match({
  "location": "Login.enterMobileNumber()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "quit browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.quitBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To validate the positive and negative combination of login functionality of the RedBus app",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "launch browser and window maximize",
  "keyword": "Given "
});
formatter.step({
  "name": "Launch redbus url",
  "keyword": "When "
});
formatter.step({
  "name": "Click profile ico",
  "keyword": "And "
});
formatter.step({
  "name": "Click signupbutton",
  "keyword": "And "
});
formatter.step({
  "name": "Enter mobile number as\"\u003cnumber\u003e\"in mobile number field",
  "keyword": "And "
});
formatter.step({
  "name": "Quit the browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "number"
      ]
    },
    {
      "cells": [
        "8520369741"
      ]
    },
    {
      "cells": [
        "7412369850"
      ]
    },
    {
      "cells": [
        "9630258741"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate the positive and negative combination of login functionality of the RedBus app",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "launch browser and window maximize",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.launchBrowserAndWindowMaximize()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Launch redbus url",
  "keyword": "When "
});
formatter.match({
  "location": "Login.launchRedbusUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click profile ico",
  "keyword": "And "
});
formatter.match({
  "location": "Login.clickProfileIco()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click signupbutton",
  "keyword": "And "
});
formatter.match({
  "location": "Login.clickSignupbutton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter mobile number as\"8520369741\"in mobile number field",
  "keyword": "And "
});
formatter.match({
  "location": "Login.enterMobileNumberAsInMobileNumberField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Quit the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.quitTheBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the positive and negative combination of login functionality of the RedBus app",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "launch browser and window maximize",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.launchBrowserAndWindowMaximize()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Launch redbus url",
  "keyword": "When "
});
formatter.match({
  "location": "Login.launchRedbusUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click profile ico",
  "keyword": "And "
});
formatter.match({
  "location": "Login.clickProfileIco()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click signupbutton",
  "keyword": "And "
});
formatter.match({
  "location": "Login.clickSignupbutton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter mobile number as\"7412369850\"in mobile number field",
  "keyword": "And "
});
formatter.match({
  "location": "Login.enterMobileNumberAsInMobileNumberField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Quit the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.quitTheBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the positive and negative combination of login functionality of the RedBus app",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "launch browser and window maximize",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.launchBrowserAndWindowMaximize()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Launch redbus url",
  "keyword": "When "
});
formatter.match({
  "location": "Login.launchRedbusUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click profile ico",
  "keyword": "And "
});
formatter.match({
  "location": "Login.clickProfileIco()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click signupbutton",
  "keyword": "And "
});
formatter.match({
  "location": "Login.clickSignupbutton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter mobile number as\"9630258741\"in mobile number field",
  "keyword": "And "
});
formatter.match({
  "location": "Login.enterMobileNumberAsInMobileNumberField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Quit the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.quitTheBrowser()"
});
formatter.result({
  "status": "passed"
});
});