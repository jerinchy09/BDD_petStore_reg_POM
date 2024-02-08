package test_runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)  //running with jUnit. importing from cucu.junit
	@CucumberOptions(
			features="E:\\Nexvalli\\Eclipse Wrokspace\\Cucumber_petstore_reg_POM\\src\\test\\resources\\Feature"
			//,glue= "\\stepDefinition"
			,glue= "StepDefinition"
			//,dryRun=true// chcks if you have respective features or not . By deafault it is false
			//,monochrome=true//helps you to get a better console output
			,tags="@required"//like groups in testng
			//you will get a report in pretty format
			//,plugin= {"pretty","html:E:\\Nexvalli\\Eclipse Wrokspace\\BDD_cucumber\\target\\report.html"}
			//you will get a report in time format
			,plugin= {"usage","html:E:\\Nexvalli\\Eclipse Wrokspace\\Cucumber_petstore_reg_POM\\target\\report.html"}
			
			
			)

public class runner {

}
