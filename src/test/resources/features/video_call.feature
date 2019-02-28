#Author: Juan Pablo Gomez Monsalve
Feature: video call in Hangout
   As a user of the hangout 
    I want to a system video call
   To talk with my friends

  Background: User is logged in Hangout
    Given I am navigate to the login page
    When I start session
      | user        | password  |
      | pruebadevco | Prueba123 |

  Scenario: Successful video call to a contact
    And I make video call to a contact
    Then I can verify that the video call was made

  Scenario: Successful video call to a group
    And I make video call to a group
    Then I can verify that the video call was made

  Scenario: Succesful invite a video call
    And I invite a video call to an contact
    Then I can verify that the video call was made
