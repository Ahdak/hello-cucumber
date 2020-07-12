package net.dammak.service;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class SummingStepdefs {

    private SummingService summingService = new SummingService();

    private int firstInt;
    private int secondInt;
    private int result;

    @Given("Two integers {int} and {int}")
    public void integersAnd(int firstInt, int secondInt) {
        this.firstInt = firstInt;
        this.secondInt = secondInt;
    }

    @When("call sum")
    public void callSum() {
        result = summingService.sum(firstInt, secondInt);
    }

    @Then("return {int}")
    public void returnInt(int expectedResult) {
        Assertions.assertEquals(expectedResult,result);
    }
}
