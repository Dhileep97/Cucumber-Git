Feature:
Validate Fb account creation
Scenario:
Create new account
Given Launch browser and maximize window
And Launch url
And Click create new account button
And Enter first name in firstname text box
|Iron|Captain|Harry|Thor|Doctor|
And Enter second name in second name text box
|man|America|Potter|Thunder|Strange|
And Enter mobile no or email in email text box
|Ghost@gmail.com|Panther@gmail.com|9756186275|9762861437|
|8657913549|Thanos@gmail.com|9764863215|loki@gmail.com|
|Gantak@gmail.com|Spider@gmail.com|8462169874|9752489654|
And Enter new password in new password field
Then Close the browser