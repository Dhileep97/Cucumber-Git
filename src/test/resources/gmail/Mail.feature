Feature: Validate the Gmail Login page

  Scenario Outline: Validate the positive and negative test cases
    Given User navigate to the gmail login page
    When User enter the username as "<name>" in email field
    And User click next button
    Then User quit the browser

    Examples: 
      | name                 | pass      |
      | tdhileep97@gmail.com | Hustle97  |
      | Jack@gmail.com       | Sparrow57 |
      | Black@gmail.com      | Ship123  |
      | fggfrgh@gmail.com    | fvu356   |
      | Bingo@gmail.com      | dreamu15 |
      | Cinema@gmail.com     | Connet35 |
