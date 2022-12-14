Feature: Validate the Flipkart login page

  Scenario: Login should be success
    Given User to launch the browser
    When User to launch Url
    And User enter the username
    And User enter the password
    And click the login button
    Then close the browser
