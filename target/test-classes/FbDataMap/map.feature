Feature: 
  Validate Fb account creation

  Scenario: 
    Create new account

    Given Launch browser and maximize window
    And Launch url
    And Click create new account button
    #1D map
    And Enter first name in firstname text box
      #key   value
      | name1 | Iron    |
      | name2 | captain |
      | name3 | Thor    |
      | name4 | Harry   |
    #1D map
    And Enter second name in second name text box
      #key	 value
      | name1 | man     |
      | name2 | America |
      | name3 | Thunder |
      | name4 | Potter  |
    #2D map
    And Enter mobile no or email in email text box
      | mail1            | mail2             | mail3          |
      | Ghost@gmail.com  | Panther@gmail.com |     9756186275 |
      |       8657913549 | Thanos@gmail.com  | loki@gmail.com |
      | Spider@gmail.com |        8462169874 |     9752489654 |
    And Enter new password in new password field
    Then Close the browser
