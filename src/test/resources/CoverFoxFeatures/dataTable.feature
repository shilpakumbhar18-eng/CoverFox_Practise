Feature: Study dataTable in BDD
Scenario: Test Gmail login
Given I am on home page1
When I provide username and password 
|userName|password|msg|
|test1234|test@1234|Welcome|
|test5678|test@5678|Thank you|
Then I should navigate to inbox
