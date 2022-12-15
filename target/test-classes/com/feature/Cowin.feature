Feature: User Find The Vaccinee Availability

Scenario: Home Page

Given user Launch The Application Url
When user Select The State
And user Select The District
And user Click The Search 
And user Select The Age Group
And user Select The No Of Dose
And user Select The Cost Of Dose
And user Select The Vaccine
And user Print The Availabe Center
Then user Compare Selected Option are Showing


