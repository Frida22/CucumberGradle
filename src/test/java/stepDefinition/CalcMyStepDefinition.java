package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalcMyStepDefinition {
    @Given("Open google.com")
    public void openGoogleCom() {
    }

    @When("Entering number {string} and {string}")
    public void enteringNumberFirstNumberAndSecondNumber(String a, String b) {
    }

    @When("Press enter")
    public void pressEnter() {
    }

    @Then("Result should be {string}")
    public void resultShouldBeResult(String c) {
    }
}
