@compose
Feature: Compose Functionality

  Scenario Outline: Verify that the ComposeButton existed
    Given Browser opens and enter the url
    When User should be able to login with gmail account "<EmailAddress>" and "<password>"
    And Home page should open
    Then verify the compose button on the left side

    Examples: 
      | EmailAddress  | password |
      | abc@gmail.com | Admin123 |

  Scenario: Verify that the user is able to send an attachment
    Given Click on the Compose button and NewMessage box opens
    And Enter the values and attach the file
    Then click on send button
