package basic.firstFeatureFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

public class StepDefinition1 {
	
	WebDriver driver;
	
	
	@Given("^user need to be on facebook login page$")
	public void user_need_to_be_on_Facebook_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chinwe\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
	}
	
	@When("^user enters user firstname$")
	public void user_enters_user_first_name() {
		driver.findElement(By.name("firstname")).sendKeys("Chinwe");
		
	}
	
	@Then("^user checks if firstname is present$")
	public void user_checks_if_firstname_is_present() {
		String userNameActual = driver.findElement(By.name("firstname")).getAttribute("value");
		Assert.assertEquals("David", userNameActual);
		
	}

}
