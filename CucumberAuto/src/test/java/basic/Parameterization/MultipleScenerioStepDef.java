package basic.MultipleScenerioSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

public class MultipleScenerioStepDef {
	
	WebDriver driver;
	
	
	@Given("^user need to be on facebook login page$")
	public void user_need_to_be_on_Facebook_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chinwe\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
	}
	
	@When("^user enters user firstname$")
	public void user_enters_user_first_name() throws InterruptedException {
		driver.findElement(By.name("firstname")).sendKeys("Chinwe");
		Thread.sleep(1000);
		
	}
	
	@Then("^user checks if firstname is present$")
	public void user_checks_if_firstname_is_present() throws InterruptedException {
		String userNameActual = driver.findElement(By.name("firstname")).getAttribute("value");
		Assert.assertEquals("Chinwe", userNameActual);
		Thread.sleep(1000);
		
	}
	
	@And("User enters user surname")
	public void user_enters_user_surname() {
		driver.findElement(By.name("lastname")).sendKeys("Anero");
	}
	
	@But("user mobile field should be blank")
	public void user_mobile_field_should_be_blank() throws InterruptedException{
		String mobileActual = driver.findElement(By.xpath("//*[@id=\"u_0_r\"]")).getAttribute("value");
		Assert.assertEquals("", mobileActual);
		Thread.sleep(1000);
		
	}
	
	@Then("close browser")
	public void close_browser() {
		driver.quit();
		driver = null; 
	}


}
