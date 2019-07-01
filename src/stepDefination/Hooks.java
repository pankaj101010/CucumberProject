package stepDefination;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks  {
	@Before
	public void setUp() {
		System.out.println("before lauching setpDefination files");
	}

	@After
	public void tearDwon() {
		
		System.out.println("After lauching setpDefination files");
		Constants.driver.close();
	}
}
