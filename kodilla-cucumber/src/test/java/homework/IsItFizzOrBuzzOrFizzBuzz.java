package homework;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsItFizzOrBuzzOrFizzBuzz {
    private int number;
    private String result;

    @Given("I have a chosen number {int}")
    public void i_have_a_chosen_number(int number) {
        this.number = number;
    }
    @When("I play fizz buzz game")
    public void i_play_the_fizzbuzz_game() {
        this.result = FizzBuzzGameChecker.fizzBuzz(this.number);
    }

    @Then("I should see {string} as the output")
    public void i_should_see_as_the_output(String expected) {
        assertEquals(expected, this.result);
    }
}