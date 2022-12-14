Feature:
To Validate the Bisto Bites website
Background:
Given Launch browser and window maximize
When launch url
@tag1
Scenario:
To validate the login functionality using invalid User name and password
And User click the account button
And User enter invalid username
And User enter invalid password
And User click login button
Then close browser
@tag2
Scenario:
User to add Dosa to the cart
And User clicks the account button
And User enter valid username and password
And User click the home button
And User click Dosa on popular items
And User click masala dosa
And Print available time
Then close the browser
@tag3
Scenario:
And Click the account button
And Enter name,email,phone number and password
And click register button
And print popup
Then Quit browser
@tag4
Scenario:
And Click search icon
And Enter coke
And check price
Then Quits browser
@tag5
Scenario:
And user click search icon
And Enter Spanish omlet
And Check the price
Then Quit the browser
@tag6
Scenario:
And click user story
Then Quits the browser

