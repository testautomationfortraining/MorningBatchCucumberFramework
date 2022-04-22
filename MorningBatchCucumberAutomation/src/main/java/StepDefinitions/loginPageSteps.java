package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class loginPageSteps {
	
	WebDriver driver;

	@Given("^user is already in loginPage$")
	public void user_already_in_loginPage() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/");
		driver.manage().window().maximize();
	}
	
	@When("^user enter username and Password$")
	public void user_enter_username_and_Password(){
	   WebElement username=driver.findElement(By.xpath("//input[@name='uid']"));
	   WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
	   username.sendKeys("mngr398089");
	   password.sendKeys("menUvAp");
	}

	@Then("^user click on login button$")
	public void user_click_on_login_button() {
	    WebElement btnLogin=driver.findElement(By.xpath("//input[@name='btnLogin']"));
	    btnLogin.click();
	    driver.close();
	}
}
