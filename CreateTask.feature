Feature: Create Task
As a ToDo App user
I should be able to create a task
So I can manage my tasks

Background: User is logged in and goes to My Tasks page
Given I launch browser and navigate to login page
When I enter credentials "vitorbmforte@gmail.com" and "0246813579"
And Click Sign In button
And I click the My Tasks link
Then I should be redirected to "https://qa-test.avenuecode.com/tasks"

Scenario: The user should see a message on the top part saying that list belongs to the logged
user: If the logged user name is John, then the displayed message should be ‘Hey John, this is 
your todo list for today
Given I am in My Tasks page
Then I should see "Hey VitorForte, this is your todo list for today"

Scenario: The user should be able to enter a new task by hitting enter
Given I add the task "Hit Enter" and hit enter
Then The task "Hit Enter" should be appended

Scenario: The user should be able to enter a new task by clicking on the add task button
Given I add the task "Click Add Task Button" and click on the add task button
Then The task "Click Add Task Button" should be appended

Scenario: Add a task with less than three characters
Given I add the task "Hi" and hit enter
Then The task "Hi" should NOT be appended

Scenario: Add a task with more than 250 characters
Given I add the task "This Task has exactly 251 characters. This is a Equivalence Partitioning and Boundary Values Analysis. 0 to 2 must be invalid. 3 to 250 must be valid. 251 onwards must be invalid. The results were divided in 3 partitions,so this test should be invalid." and hit enter
Then The task "This Task has exactly 251 characters. This is a Equivalence Partitioning and Boundary Values Analysis. 0 to 2 must be invalid. 3 to 250 must be valid. 251 onwards must be invalid. The results were divided in 3 partitions,so this test should be invalid." should NOT be appended

Scenario: The user should see a button labeled as Manage Subtasks
Given I am in My Tasks page
Then I should see the Manage Subtasks button

Scenario: The button Manage Subtasks should have the number of subtasks created for that task
Given I am in My Tasks page
Then I should see the number 1 in the Manage Subtasks button of the 'Done' task

Scenario: Add task with empty description by clicking the add task button
Given I add the task " " and click on the add task button
Then The task "empty" should NOT be appended
