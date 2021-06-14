#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Loggin to the account
  I want tologgin
@regression @positive
  Scenario:Loggin
    Given I want to logging to page

    When I provided "Username" and "AB@123"
   
    And i will click on loggin button
    Then i will be able to loggin to next page.
   
 @senity  @negetive
  Scenario: not Loggin
    Given I want to see 

    When I provided "Mail" and "XYZ@123"
   
    And i will validate
    Then i will  not able to loggin to next page with Error.

  
