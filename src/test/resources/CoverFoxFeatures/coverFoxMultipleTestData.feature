Feature: Coverfox Health Insurance test for multiple data
Scenario Outline: TC01 : Validate coverfox health insurance plan with multiple testdata
Given   I am on hone page
When  I click on Female button
And  I click on next button
And  I provide age as "<age>" and click on next button
And  I provide pincode as "<pincode>" and mobNo as "<mobNo>" and click on continue button
Then  matching health insurance plans should be displayed as "<results>"
Examples:
|age|pincode|mobNo|results|
|22|455231|7777777777|56|
|34|411026|9999999999|23|


