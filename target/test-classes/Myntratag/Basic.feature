@Feature1
Feature: 
  To validate the login functionality of Myntra App

  @Smoke
  Scenario: 
    Enter Valid details

    Given Launch browser and maximize window
    When Launch url
    And Mouse over to profile
    And Click login button
    And Enter Mobile no
    And Click continue button
    Then Quit the browser

  @Sanity
  Scenario Outline: 
    Enter valid and invalid details

    Given launch browser and window maximizze
    When launch the url
    And mouseover to the profile
    And click signup button
    And enter valid and invalid details as "<phone>"in email field
    And click continue
    Then close browser

    Examples: 
      | phone      |
      | 9852364178 |
      | 8520369741 |
      | 7410236589 |
