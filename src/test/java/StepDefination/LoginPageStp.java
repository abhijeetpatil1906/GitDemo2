package StepDefination;


import BaseLayer1.BaseClass2;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStp extends BaseClass2{
	
protected static  LoginPage loginpage;

@Given("user is on Loginpage")
public void user_is_on_loginpage() {
   BaseClass2.initialization();
}

@When("user enters valid username and valid password")
public void user_enters_valid_username_and_valid_password() {
  loginpage=new LoginPage();
  loginpage.typeUsernameAndPassword(prop.getProperty("username"),prop.getProperty("password"));
}

@Then("user click on login button")
public void user_click_on_login_button() {
    loginpage.clickOnLoginButton();
}


	}



