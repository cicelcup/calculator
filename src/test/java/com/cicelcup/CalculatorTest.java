package com.cicelcup;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/cicelcup/features",glue={"com.cicelcup.steps"})
public class CalculatorTest 
{}
