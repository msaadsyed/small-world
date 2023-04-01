Feature: To Verify Functionality Of A Sauce Demo Website

  Scenario: Verify Login to Application with correct credentials
    Given Sam is on Sauce demo application
    And   Title page "Swag Labs" of the application is visible
    When  Sam enters username "standard_user"
    And   Sam enters password "secret_sauce"
    And   Click on Submit button
    Then  Login should be successful
    And   Product listing should be visible


