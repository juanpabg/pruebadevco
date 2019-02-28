#Author: Juan Pablo Gomez Monsalve
Feature: message in Hangout
   As a user of the hangout 
    I want to a system messaging
   To talk with my friends

  Background: User is logged in Hangout
    Given I am navigate to the login page
    When I start session
      | user        | password  |
      | pruebadevco | Prueba123 |

  Scenario: Successful looking for a contact
    And I look for a contact in the message
      | user                  | name                      |
      | figu.figu45@gmail.com | Juan Pablo Gomez Monsalve |
    Then I can verify that the contact exists

  Scenario: Succesful send invitation
    And I send an invitation
    Then I can verify that the invitation was sent

  Scenario: Succesful send a message
    And I send a message
    Then I can verify that the message was sent

  Scenario: Succesful conversation group
    And I form a conversation group
    And I send a message
    Then I can verify that the message was sent
