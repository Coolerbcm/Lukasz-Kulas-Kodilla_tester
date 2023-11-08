Feature:  FizzBuzz Number game.
  Everybody likes games

  Scenario Outline: Let's play children FizzBuzz game

    Given I have a chosen number <number>
    When  I play fizz buzz game
    Then  I should see <result> as the output
    Examples:
      | number | result |
      | 1 | "None" |
      | 2 | "None" |
      | 3 | "Fizz" |
      | 4 | "None" |
      | 5 | "Buzz" |
      | 6 | "Fizz" |
      | 7 | "None" |
      | 8 | "None" |
      | 9 | "Fizz" |
      | 10 | "Buzz" |
      | 11 | "None" |
      | 12 | "Fizz" |
      | 13 | "None" |
      | 14 | "None" |
      | 15 | "Fizz Buzz" |
      | 16 | "None" |
      | 17 | "None" |
      | 18 | "Fizz" |
      | 19 | "None" |
      | 20 | "Buzz" |