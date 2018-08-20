Feature: Login

Scenario: Login with valid credentials
Given I launch browser and navigate to login page
When I enter credentials "vitorbmforte@gmail.com" and "0246813579"
And Click Sign In button
Then I should log into the system
