package package2;

import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HolyDeveloper {
	
	@Given("^I work in ([^\"]*)$")
	public void I_work_in_microsoft(String companyType){
		System.out.println("############################");
		System.out.println("@Given - I work in " + companyType);
	}
	
	@When("^I meet ([^\"]*)$")
	public void when_I_meet(String personName){
		System.out.println("@When - I meet " + personName);
	}
	
	@Then("^I ([a-zA-Z]{1,})$")
	public void then_I(String voiceAction){
		System.out.println("@Then - I " + voiceAction);
	}
	
	@But("^He is a ([^\"]*) person$")
	public void he_is_a(String personType){
		System.out.println("@But - He is a " + personType + "person");
	}
	

}
