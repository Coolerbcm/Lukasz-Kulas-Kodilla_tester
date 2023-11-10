package wallet;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class WalletSteps {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();

    @Given("I have deposited ${int} in my wallet")
    public void i_have_deposited_$_in_my_wallet(Integer int1) {
        wallet.deposit(int1);
        assertEquals(int1, wallet.getBalance(), "Incorrect wallet balance");
    }
    @When("I request ${int}")
    public void i_request_$(Integer int1) {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, int1);
    }
    @Then("${int} should be dispensed")
    public void $_should_be_dispensed(Integer int1) {
        assertEquals(int1, cashSlot.getContents());
    }
    @Then("${int} should not be dispensed")
    public void $_should_not_be_dispensed(Integer int1) {
        assertNotEquals(int1, cashSlot.getContents());
    }
}