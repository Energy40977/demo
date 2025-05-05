Feature: Login

  Scenario: Successfully login
    Given The application has been started
    When Click the skip button
    And Click the eye
    And Click the enviroment section
    And Select preprod
    Then Login button should be displayed

