package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
//import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//tags which "tag1","tag2" are AnDing 
//tags which "tag1 , tag2" are ORing
/* extends AbstractTestNGCucumberTests it is used for running using testng */
@CucumberOptions(features = "Features", 
	glue = { "stepDefination" },
	tags = { "~@ignore , @Run" }, 
	monochrome = true ,
	plugin = {"pretty","html:target/cucumber"}
   // plugin= {"com.vimalselvam.cucumber.ExtentCucumberFormatter:output/report.html"}
	)
public class Runner {
}
