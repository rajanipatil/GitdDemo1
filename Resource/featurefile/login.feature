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
@tag
Feature: Title of your feature
  I want to use this template for my feature file

 @tag1
 
 Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then page title should be "Login - My Store"
 
  #Scenario: Login to Ryan website
   ## Given user is on login page
    #And enter "username" and "password"
    #When user click on "Login" button
    #Then user able to login to Ryan website
    #And username is displayed on website
    #And user check the Announcement

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step

    #Examples:
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
