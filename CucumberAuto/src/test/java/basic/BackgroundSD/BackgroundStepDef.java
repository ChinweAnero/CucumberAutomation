package basic.BackgroundSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Assert;

public class BackgroundStepDef {
	
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
	
	@When ("user enters the following data")
	public void user_enters_the_following_data(DataTable table) throws InterruptedException {
		List<List<String>> data = table.raw();
		
		String values1 = data.get(0).get(0);
		String values2 = data.get(0).get(1); 
		String values3 = data.get(0).get(2); 
		
		String values4 = data.get(1).get(0); 
		String values5 = data.get(1).get(1); 
		String values6 = data.get(1).get(2); 
		
		driver.findElement(By.name("firstname")).sendKeys(values4);
		driver.findElement(By.name("lastname")).sendKeys(values5);
		Thread.sleep(2000);
		
		
		
	}


}
