$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Myntra/myntratask.feature");
formatter.feature({
  "name": "",
  "description": "  To validate Myntra application",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "    Shopping in myntra",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User launch browser and maximize window",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdef.userLaunchBrowserAndMaximizeWindow()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User launch url",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef.userLaunchUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "mouse over to men",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.mouseOverToMen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click tshirt option",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.userClickTshirtOption()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click first product and select m size",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.userClickFirstProductAndSelectMSize()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click bag icon",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.userClickBagIcon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user take screenshot",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.userTakeScreenshot()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User quit browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.userQuitBrowser()"
});
formatter.result({
  "status": "passed"
});
});