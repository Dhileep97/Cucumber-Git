
@tag
Feature: Validate Redbus login

  @tag1
  Scenario: validate login with valid mobile number
    Given Launch browser and maximize window
  	When  launch url
    And click profile icon
    And click signup button
    And enter mobile number
    Then quit browser

  @tag2
  Scenario Outline: To validate the positive and negative combination of login functionality of the RedBus app
    Given launch browser and window maximize
    When Launch redbus url
    And Click profile ico
    And Click signupbutton
    And Enter mobile number as"<number>"in mobile number field
    Then Quit the browser

    Examples: 
      | number  | 
      | 8520369741 |    
      | 7412369850 |
      | 9630258741 |    
