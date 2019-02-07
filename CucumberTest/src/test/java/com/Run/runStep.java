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
		//只运行带有@p1标签的场景。如果是~@P1表示运行除开带有@p1标签之外的所有场景
		tags={"@p1"},
		glue={"com.steps"}
)

public class runStep extends AbstractTestNGCucumberTests{

}
