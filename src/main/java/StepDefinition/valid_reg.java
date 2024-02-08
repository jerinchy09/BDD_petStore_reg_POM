package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Object_repository.Register;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class valid_reg {
	WebDriver driver;
	@Before
	public void before() {
		System.out.println("Before");
	}
	
	@After
	public void after() {
		driver.close();
	}
		
	@Given("when the user launches the url")
	public void launch_url() {
		driver= new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
	}
	@And("click on sign in")
	public void button_singin() {
		driver.findElement(By.linkText("Sign In")).click();
		//System.out.println("sign in clicked");
	}
	@And("click on register now")
	public void button_regNow() {
		driver.findElement(By.linkText("Register Now!")).click();
		//System.out.println("reg_now clicked");

	}
	@When("^the user enters \"(.*)\" and \"(.*)\" and \"(.*)\" credentials$")
	public void valid_cred(String user, String pass, String rep_pass) {
		Register r = new Register(driver);
		r.reg_userInfo(user, pass, rep_pass);
		
	}
	@Then("user should successfully register a new account")
	public void successful_reg() {
		System.out.println(driver.getTitle());
	}
//	@When("the user enters invalid credentials")
//	public void invalid_reg() {
//		Register r = new Register(driver);
//		r.reg_userInfo("jkjk", "bbb", "bbb");
//		
//	}
	@Then("error message")
	public void error() {
		System.out.println("invalid error message");
	}
}
