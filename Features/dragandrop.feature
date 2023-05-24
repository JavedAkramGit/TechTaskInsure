
Feature: Check functionality of multiple features in JQuery website

Background: Steps common to all scenarios

 Given User initializes the Browser-driver
 When  User navigates to the JQuery page
 Then User is able to view the JQuery Main page
 

  Scenario: Verify Drag and Drop aligns with functional requirement
  
    When User navigates to the Drag and Drop Page
    And User Drags and Drops an Element
    Then Navigate to the Main page

Scenario: Verify Select functionality
    
     When User navigates to the Select Options Page
    And User Selects mutiple items ( Item 1, Item 3 , Item 7)
    Then User is able to select multiple elements 
 
 Scenario: Verify Control group
    
     When User navigates to Control group page
    And User chooses multiple options as assigned
    Then User is able to choose multiple options and book