package com.Run;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="src/test/features/BDD.feature",
		format={
				"pretty",
				"html:target/site/cucumber-pretty",
				"rerun:target/site/rerun.txt",
				"json:target/cucumber.json"
		},
		tags={"~@Automation"},
		glue={"com.steps"}
)

public class run extends AbstractTestNGCucumberTests{

}
