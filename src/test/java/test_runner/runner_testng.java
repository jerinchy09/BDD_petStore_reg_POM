package test_runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="E:\\Nexvalli\\Eclipse Wrokspace\\Cucumber_petstore_reg_POM\\src\\test\\resources\\Feature"
		,glue= "StepDefinition"
		//,dryRun=true// chcks if you have respective features or not . By deafault it is false
		//,monochrome=true//helps you to get a better console output
		//,tags="@required"//like groups in testng
		//you will get a report in pretty format
		//,plugin= {"pretty","html:E:\\Nexvalli\\Eclipse Wrokspace\\BDD_cucumber\\target\\report.html"}
		//you will get a report in time format
		,plugin= {"usage","html:E:\\Nexvalli\\Eclipse Wrokspace\\Cucumber_petstore_reg_POM\\target\\report_testng.html"}
		
		
		)
	public class runner_testng extends AbstractTestNGCucumberTests{
	
	}
