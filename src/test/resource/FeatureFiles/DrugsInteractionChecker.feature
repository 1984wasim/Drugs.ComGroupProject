@regression @smoke @us-248
Feature: Drugs Interaction Checker Functionality

Description: Interaction checker for multiple drugs
  
  Background:
    Given Open Drugs Homepage

  Scenario: Drugs Interaction Checker Functionality
  	When the user clicks on the Interaction Checker link
    And the user enters Drugs name
    And the user clicks to the Add button
    And the user clicks to the Check Ineraction button
    Then the user should see related drugs information