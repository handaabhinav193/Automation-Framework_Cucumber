package com.FaceBook.qa.TestRunner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\handa\\git\\Automation-Framework_Cucumber\\Facebook\\src\\main\\resources\\UserStories\\Sprints\\Sprint_1\\S0001\\TC0001.feature", //location of the feature files in project
		glue = {"com.FaceBook.qa.steps"}, //package name where path of the step definitions are defined
		//format = {"pretty","html:test-output"}, //to define the format of the report
		monochrome = true, //to display the output in readable format
		plugin = {"html:target/LeadershipReport/cucumber-html-report"},
		strict = false,	//it will fail the methods if any undefined methods are given.
		dryRun = false // will check if the mapping is done correctly or not.
		)
public class TestRunner {

}