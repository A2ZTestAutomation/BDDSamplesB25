package stepDefs;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GooglePageStepDef {
	WebDriver driver;
	@Given("User is on Google Home page")
	public void user_is_on_google_home_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Assert.assertEquals("Google", driver.getTitle());
	}
	@When("User Search Java Tutorial")
	public void user_search_java_tutorial() {
		WebElement searchBox = driver.findElement(By.cssSelector(".gLFyf.gsfi"));
		searchBox.sendKeys("Java Tutorial");
		searchBox.submit();
	    
	}
	@Then("Should display Java Search Results")
//	@Then("Should display Java Search")
	public void should_display_java_search_results() {
		String strTitle = driver.getTitle();
		Assert.assertEquals("Java Tutorial - Google Search", strTitle);
	}
	
	@When("User Search Selenium Tutorial")
	public void user_search_selenium_tutorial() {
		WebElement searchBox = driver.findElement(By.cssSelector(".gLFyf.gsfi"));
		searchBox.sendKeys("Selenium Tutorial");
		searchBox.submit();
	    
	}
	@Then("Should display Selenium Search Results")
	public void should_display_selenium_search_results() {
		String strTitle = driver.getTitle();
		Assert.assertEquals("Selenium Tutorial - Google", strTitle);
	}
//	@After
//	public void attachScreenshot(Scenario scenario) throws IOException {
//			if(scenario.isFailed()) {
//				TakesScreenshot screen = (TakesScreenshot)driver;
//				File file = screen.getScreenshotAs(OutputType.FILE);
//				byte[] imgByte = FileUtils.readFileToByteArray(file);
//				scenario.attach(imgByte,  "image/png", "image1");
//			}
//		}
}
	