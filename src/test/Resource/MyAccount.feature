Feature:
  Scenario Outline: Testing MyAccount page
    Given user is on Habitat homepage
    When user clicks on MyAccount button
    And  user types "<emailID>" and "<password>"
    Then user should be able to see Account page
    Examples:
      | emailID | password |
    |chp026@hotmail.com|Password|
