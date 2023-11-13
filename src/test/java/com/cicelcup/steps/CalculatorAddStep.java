package com.cicelcup.steps;

import static org.junit.Assert.assertEquals;

import com.cicelcup.Calculator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorAddStep {
    public Calculator calculator;
    public Integer result;

    @Given("I have a calculator")
    public void i_have_a_calculator() {
        calculator = new Calculator();
    }
    @When("I add {int} and {int}")
    public void i_add_and(Integer int1, Integer int2) {
        result = calculator.add(int1, int2);
    }
    @Then("the result should be {int}")
    public void the_result_should_be(Integer int1) {
        assertEquals(int1, result);
    }   
}
