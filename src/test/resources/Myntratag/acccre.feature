@Feature2
Feature: 
  To validate account Creation in Myntra

  @Regression
  Scenario: 
    Create account in Myntra

    Given User launch browser and maximize window
    When User launch url
    And User click create new accout button
    And User enter mobile number
    And User click continue
    Then User quit browser
