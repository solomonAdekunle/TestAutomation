package Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.*;

@RunWith(Cucumber.class)

@CucumberOptions(

features = {"src/FeatureFiles/Deposit.feature"},glue = { "StepsDefinations" },

plugin = {"pretty",

"html:target/cucumber-html-report",

"junit:target/cucumber-junit-report/allcukes.xml"}

)

public class Deposit  {

}