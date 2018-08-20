Feature: Home Page

Background: Login with valid credentials
Given I launch browser and navigate to login page
When I enter credentials "vitorbmforte@gmail.com" and "0246813579"
And Click Sign In button
Then I should log into the system

Scenario: The user should always see the My Tasks link on the NavBar
Given I am logged into the system
Then I should see the My Tasks link on the NavBar

Scenario: Clicking the My Tasks link will redirect the user to a page with all the created 
tasks so far
Given I click the My Tasks link
Then I should be redirected to "https://qa-test.avenuecode.com/tasks"
