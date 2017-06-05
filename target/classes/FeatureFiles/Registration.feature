Feature: Registraction Page

@Runme

Scenario: Registraction with Invalid Data

Given I am on the homepage

When I search for pillows

Then the page title is as expected


@Runme

Scenario: Registraction with valid data

Given I am on the homepage

When I search for pillows
