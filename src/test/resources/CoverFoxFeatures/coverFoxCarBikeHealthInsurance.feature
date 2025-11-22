Feature: Coverfox Health Insurance test

Background:
Given I am on home page
@login
Scenario: TC01: Validate coverfox health insurance plan for single person
Given   I am on hone page
When  I click on Female button
And  I click on next button
And  I provide age as "27" and click on next button
And  I provide pincode as "413512" and mobNo as "8888888888" and click on continue button
Then  matching health insurance plans should be displayed as "48"
@Payment
Scenario: TC02: Validate Coverfox Car Insurance
When I click on carInsurance button
And I provide valid RTO number and click on view quotes button
Then I shoould get plan details
 
Scenario: TC03: Validate Coverfox Bike Insurance
When I click on bikeInsurance button
And I provide valid RTO number and click on view quotes button
Then I shoould get plan details
 