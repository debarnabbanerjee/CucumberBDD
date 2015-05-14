package package1;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tester {
	
	@Given("I am a bad tester")
	public void I_am_a_bad_tester(){
		System.out.println("Given - I am a bad tester");
	}
	
	@When("I go to work ")
	public void when_I_go_to_work(){
		System.out.println("When - I go to work");
	}
	
	@Then("I mess with it")
	public void I_mess_with_it(){
		System.out.println("Then - I mess with it");
	}
	
	@And("my boss fires me")
	public void my_boss_fires_me(){
		System.out.println("And - My boss fires me");
	}
	
	@But("the developer likes me ")
	public void the_developer_likes_me (){
		System.out.println("the developer likes me ");
	}
	
	
	
	
	
	

}
