@Feature1
Feature:
Validate the ICICI login page
@Smoke
Scenario:
Enter Valid and invalid details
Given launch browser and window maximize
When Launch url
And Enter Valid user Id
And Enter Invalid password
And Click login
Then quit browser
@Sanity
Scenario Outline:
validate positive and negative details
Given user launch browser and window maximize
When user launch url
And enter id as "<Id>"in Id field
And enter pass as "<Pass>"in password field
And user click login
Then user quit the browser
Examples:
|Id|Pass|
|CaptainAmerica|Shield|
|IronMan|Suite|
|Batman|Bike|
|Thor|Mjolnir|