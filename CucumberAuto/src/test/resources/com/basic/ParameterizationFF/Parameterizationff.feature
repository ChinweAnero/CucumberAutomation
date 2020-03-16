Feature: create account of Facebook
  As a user you need to open facebbook home page and do the validations

  Scenario: Validate firstname field
    Given user need to be on facebook login page
    When user enters user "Chinwe" firstname
    Then user checks if firstname "Chinwe" is present
    Then close browser

  Scenario: Validate create user multiple fields
    Given user need to be on facebook login page
    When user enters user "Chinwe" firstname
    And User enters user "Anero" surname
    Then user checks if firstname "Chinwe" is present
    But user mobile field should be blank
    Then close browser
