@regression @api
Feature: Petstore API Testing

Scenario: pet CRUD API
	
	Given Create pet
	And Get pet
	When Update pet
	Then Delete pet