package stepDefination;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;

public class Constants {
 public static WebDriver driver;
 @Given("^looking for is this running in background or not$")
	public void looking_for_is_this_running_in_background_or_not() throws Throwable {
	  System.out.println("looking for is this running in background or not");
	}

 
}
