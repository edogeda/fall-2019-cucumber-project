@smoke
Feature: Login

  As a user,
  I should be able to login application
  @librarian @staff
  Scenario: Login as a liberarian
    Given I am on the login page
    When I login as a liberarian
    Then dashboard should be displayed

@student
    Scenario:Login as a student
      Given I am on the login page
      When I login as a student
      Then dashboard should be displayed

 @admin @staff
  Scenario:Login as admin
    Given I am on the login page
    When I login as an admin
    Then dashboard should be displayed