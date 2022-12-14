@Feature1
Feature: To validate the login functionality of the Facebook application
@Smoke
  Scenario: validate login with valid username and invalid password
    Given Launch browser and maximize window
    When Launch fb url
    And Enter valid username in email field
    And Enter Invalid password in password field
    And Click the login button
    Then Quit the browser
@Sanity
  Scenario Outline: To validate the positive and negative combination of login functionality of the Facebook application
    Given launch browser and window maximize
    When launch URl
    And Enter the data "<email>" in email field
    And Enter the data "<password>" in password field
    And Click login button
    Then close the browser

    Examples: 
      | email                | password  |
      | tdhileep97@gmail.com | Test@1997 |
      | Vikram@bingo.com     | yhoo@143  |
      | Ghost@ymail.com      | vruvu@145 |
      | fggfrgh@fy.com       | fvu@356   |
      | Bingo@ymail.com      | dreamu@15 |
      | Cinema@yahoo.com     | Connet@35 |
