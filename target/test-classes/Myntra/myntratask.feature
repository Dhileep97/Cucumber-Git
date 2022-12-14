Feature: 
  To validate Myntra application

  Scenario: 
    Shopping in myntra

    Given User launch browser and maximize window
    When User launch url
    And mouse over to men
    And User click tshirt option
    And User click first product and select m size
    And user click bag icon
    And user take screenshot
    Then User quit browser