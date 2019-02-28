#Author: Juan Pablo Gomez Monsalve
Feature: phone call in Hangout
   As a user of the hangout 
    I want to a system phone call
   To talk with my friends

  Background: User is logged in Hangout
    Given I am navigate to the login page
    When I start session
      | user        | password  |
      | pruebadevco | Prueba123 |

  Scenario: Successful call no existent contact
    And I call an no existent contact
    Then I can verify that was called

  Scenario: Successful call existent contact
    And I call an existent contact
    Then I can verify that was called

  Scenario: Successful call another country
    And I call an contact in another country
    Then I can verify that was called
