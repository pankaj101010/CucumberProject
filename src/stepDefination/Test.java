package stepDefination;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test {

	@Given("^i am a Automation tester$")
	public void i_am_a_Automation_tester() throws Throwable {
		System.out.println("i am a Automation tester");

	}

	@When("^i started my job in resonantia$")
	public void i_started_my_job_in_resonantia() throws Throwable {
		System.out.println("i started my job in resonantia");

	}

	@Then("^i Learnt more skill set$")
	public void i_learnt_more_skill_set(DataTable table) throws Throwable {
		List<Map<String, String>> data = table.asMaps(String.class, String.class);
		System.out.println("Skill set: " + data.get(0).get("Skill"));
		System.out.println("Duration: " + data.get(0).get("Duration"));
	}

	@Then("^i switch my job$")
	public void i_switch_my_job() throws Throwable {
		System.out.println("i switch my job");
	}
}
