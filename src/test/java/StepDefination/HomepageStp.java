package StepDefination;

import org.junit.Assert;

import BaseLayer1.BaseClass2;
import PageLayer.HomePage;
import io.cucumber.java.en.Then;


public class HomepageStp extends BaseClass2 {
	
	protected static HomePage homepage;
	
	@Then("verify homepage title")
	public void verify_homepage_title() {
		
		homepage=new HomePage();
		Assert.assertEquals(true, homepage.captureHomepageTitle().contains("HRM"));
	
		  
	}

	@Then("verify homepage url")
	public void verify_homepage_url() {
	   Assert.assertEquals(true,homepage.captureHomepageUrl().contains("hrm"));
	}

	@Then("verify homepage logo")
	public void verify_homepage_logo() {
	   Assert.assertEquals(true, homepage.validateLogo());
	}


}
