Feature: Calculator Addition

  Scenario Outline: Add two numbers
    Given I have a calculator
    When I add <num1> and <num2>
    Then the result should be <result>

    Examples:
      | num1 | num2 | result |
      | 5    | 7    | 12     |
      | 2    | 3    | 5      |
      | 8    | 5    | 13     |