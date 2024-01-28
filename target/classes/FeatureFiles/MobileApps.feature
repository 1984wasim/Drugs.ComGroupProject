@regression @smoke @SKYW-20 @E2E
Feature: Mobile Apps

	Background:
		Given Open Drugs Homepage
		
		
	Scenario: Install Drugs.com Medication Guide
		When Click on Mobile Apps
		And Click on "Get It ON Google Play" Button
		Then Click on Install
		