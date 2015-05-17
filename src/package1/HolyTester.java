package package1;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HolyTester {
	
	@Given("^I am a ([a-zA-Z]{1,}) tester$")
	public void I_am_a_bad_tester(String testerType){
		System.out.println("********************************************");
		System.out.println("@Given - I am a "+testerType+" tester.");
	}
	
	@When("^I go to work$")
	public void i_go_to_work(){
		System.out.println("@When - I go to work");
	}
	
	@Then("^I ([a-zA-Z]{1,}) it$")
	public void i_mess_with_it(String workOutput){		
		System.out.println("@Then - I "+workOutput+" it");
	}
	
	@And("^My boss ([a-zA-Z]{1,}) me$")
	public void my_boss_fires_me(String bossAction){
		System.out.println("@And - My boss "+bossAction+" me");
	}
	
	@But("^The developer ([a-zA-Z]{1,}) me$")
	public void the_developer_likes_me(String developerAction){
		System.out.println("@But - the developer "+developerAction+" me");
	}
	
	
	

}
