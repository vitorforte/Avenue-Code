Feature: Create SubTask
As a ToDo App user
I should be able to create a subtask
So I can break down my tasks in smaller pieces

Background: User is logged in and goes to My Tasks page
Given I launch browser and navigate to login page
When I enter credentials "vitorbmforte@gmail.com" and "0246813579"
And Click Sign In button
And I click the My Tasks link
And I should be redirected to "https://qa-test.avenuecode.com/tasks"
Then I click the Manage Tasks button of the 'Done' task

Scenario: The SubTask modal dialog should have the task ID and task description
Given A modal dialog should open up
Then I should see the task id
Then I should see the task description

Scenario: There should be a form so you can enter the SubTask Description 250 characters and 
SubTask due date (MM/dd/yyyy format)
Given I enter the SubTask description "Hello World"
When I enter the SubTask due date "08/20/2018"
And I click the add button
Then The SubTask "Hello World" should be appended on the bottom part of the modal dialog

Scenario: Add subtask with empty description and empty due date
Given I enter the SubTask description " "
When I enter the SubTask due date " "
And I click the add button
Then The subtask "empty" should NOT be appended

Scenario: Add subtask with due date in wrong format
Given I enter the SubTask description "Wrong Format"
When I enter the SubTask due date "08192018"
And I click the add button
Then The subtask "Wrong Format" should NOT be appended
