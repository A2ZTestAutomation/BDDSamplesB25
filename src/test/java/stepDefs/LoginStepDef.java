package stepDefs;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDef {

	WebDriver driver;
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
	}

//	@When("User enter login credentials")
//	public void user_enter_login_credentials() {
//		String strUser= "tomsmith";
//		String strPwd = "SuperSecretPassword!";
//		driver.get("http://the-internet.herokuapp.com/login");
//		driver.findElement(By.id("username")).sendKeys(strUser);
//		driver.findElement(By.id("password")).sendKeys(strPwd);
//		driver.findElement(By.className("radius")).click();
//	}
	

	//	@When("User enter {string} and {string}")
//	public void user_enter_and(String user, String pwd) {
//		String strUser= user; 
//		String strPwd = pwd;
//		driver.get("http://the-internet.herokuapp.com/login");
//		driver.findElement(By.id("username")).sendKeys(strUser);
//		driver.findElement(By.id("password")).sendKeys(strPwd);
//		driver.findElement(By.className("radius")).click();
//	}

//	//As List
//	@When("User enter login credentials")
//	public void user_enter_login_credentials(DataTable userData) {
//		List<List<String>> data = userData.asLists();
//		String strUser=  data.get(0).get(0);
//		String strPwd = data.get(0).get(1);;
//		driver.get("http://the-internet.herokuapp.com/login");
//		driver.findElement(By.id("username")).sendKeys(strUser);
//		driver.findElement(By.id("password")).sendKeys(strPwd);
//		driver.findElement(By.className("radius")).click();
//	}
	
	//As Map
		@When("User enter login credentials")
		public void user_enter_login_credentials(DataTable userData) {
			List<Map<String, String>> data = userData.asMaps();
			String strUser = data.get(0).get("username");
			String strPwd = data.get(0).get("password");
			driver.get("http://the-internet.herokuapp.com/login");
			driver.findElement(By.id("username")).sendKeys(strUser);
			driver.findElement(By.id("password")).sendKeys(strPwd);
			driver.findElement(By.className("radius")).click();
		}
	
	@Then("Should navigate to Home Page")
	public void should_navigate_to_home_page() {
		boolean isValid = driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
		Assert.assertTrue(isValid);
	}
}
