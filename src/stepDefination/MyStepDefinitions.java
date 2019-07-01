package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefinitions {
	
	@Given("^Open the Chrome and launch the application$")
	public void open_the_Chrome_and_launch_the_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Software file\\All jar\\chromedriver_win32 (1)\\chromedriver.exe");
		Constants.driver = new ChromeDriver();
		Constants.driver.manage().window().maximize();
		Constants.driver.get("http://demo.guru99.com/v4");

	}

	@When("^Enter the Username User(\\d+)and Password password(\\d+)$")
	public void enter_the_Username_User_and_Password_password(String username, String password) throws Throwable {
		Constants.driver.findElement(By.name("uid")).sendKeys(username);
		Constants.driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("^Reset the credential$")
	public void reset_the_credential() throws Throwable {
		Constants.driver.findElement(By.name("btnReset")).click();
	}

	

}
