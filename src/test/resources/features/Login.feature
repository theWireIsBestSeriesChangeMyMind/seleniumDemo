Feature: Actions with login page

  Scenario Outline: User is able to log in using correct credentials
    Given login page is loaded
    When user provide correct "<username>" and "<password>"
    And login button is clicked
    Then main page should be loaded

    Examples:
      | username        | password |
      | Ahmad.Trantow35 | s3cret   |