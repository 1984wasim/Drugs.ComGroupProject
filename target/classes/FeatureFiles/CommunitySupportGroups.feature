@regression @smoke @SKYW-20 @E2E
Feature: Community Support Groups

	Background:
		Given Open Drugs Homepage
		
		
	Scenario: Looking for COVID-19 Support Group
		Given Open Drugs Homepage
		When Click on Community Support
		And Click on COVID-19
		Then User should see COVID-19 Support Group