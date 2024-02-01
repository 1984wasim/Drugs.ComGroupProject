@regression @smoke @us-248
Feature: Drugs Side Effects information

Description: Drugs side effects information for multiple drugs
  
  Background:
    Given Open Drugs Homepage

  Scenario: Drugs Side Effects information
  	When the user clicks on the Side Effects link
    And the user click on  Adderall link
    Then the user should see related drugs side effects information