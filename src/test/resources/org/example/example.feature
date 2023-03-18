Feature: An example

  Scenario: The example
    Given I am on the main page
    When I write the email address of "test@tester.com"
    And I click the submit button
    Then The confirmation pop-up appears


  Scenario: Negative #1
    Given I am on the main page
    When I write the email address of "test@tester.ro"
    And I click the submit button
    Then The confirmation pop-up appears



  Scenario: Negative #2
    Given I am on the main page
    When I write the email address of "testsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestssss"
    And I click the submit button
    Then A red border lines the email field


  Scenario: Pop-up appearing
    Given I am on the main page
    When I write the email address of "test@tester.com"
    When I click the submit button
    Then The confirmation pop-up appears

  Scenario: VirtualReadmore
    Given I am on the main page
    When I click the virtual read more button
    Then A new page opens

  Scenario: VirtualReturnToMain
    Given I am on the main page
    When I click the virtual read more button
    Then A new page opens
    And I click on the virtual return button
    Then I return tot the main page

  Scenario: HybridReadmore
    Given I am on the main page
    When I click the hybrid read more button
    Then Hybrid page opens

  Scenario: HybridReturnToMain
    Given I am on the main page
    When I click the hybrid read more button
    Then Hybrid page opens
    And I click on the hybrid return button
    Then I return tot the main page

   Scenario:WhatYou'llLearn
     Given I am on the main page
     When I click on what you'll learn button
     Then I am taken to the learn the fundamentals section

   Scenario: FundamentalsReadMore
     Given I am on the main page
     When I click on what you'll learn button
     Then I am taken to the learn the fundamentals section
     And I click on the fundamentals read more button
     Then Fundamentals page opens

   Scenario: FundamentalsReturnToMain
     Given I am on the main page
     When I click on what you'll learn button
     Then I am taken to the learn the fundamentals section
     And I click on the fundamentals read more button
     Then Fundamentals page opens
     And I click the fundamentals return button
     Then I return tot the main page

   Scenario: BeginStartTheEnrollment
     Given I am on the main page
     When I click start the enrollment button
     Then Sign up for the software testing course page opens

   Scenario: CompletingPersonalInformationOfEnrollment
     Given I am on the personal information of the enrollment page
     When I write the first name of "Alina"
     And I write the last name of "Alison"
     * I write the username of "aliali"
     * I write the password of "hope191"
     * I write the confirm password of "hope191"
     * I click the next button from personal information
     Then I am taken to the contact information of the enrollment page

   Scenario: CompletingContactInformationOfEnrollment
     Given I am on the contact information of the enrollment page
     When I write the contact email of "alina123@gmail.com"
     And I write the contact phone of "0789542123"
     * I write the contact country of "Romania"
     * I write the contact city of "Brasov"
     * I write the contact post code of "555555"
     * I click the next button from contact information
     Then I am taken to the course options of the enrollment page

   Scenario: BackToTopMainPage
     Given I am on the main page
     When I scroll to the bottom of the main page
     And I click the return to the top button
     Then I am taken to the top of the main page








