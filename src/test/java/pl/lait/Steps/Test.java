package pl.lait.Steps;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = false, format = { "pretty", "html:target/cucumber", "json:target/cucumber.json"},monochrome = true)  //przekreślone oznacza przestarzałe jest już coś nowego
public class Test {
}


