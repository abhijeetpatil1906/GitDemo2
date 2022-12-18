package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer1.BaseClass2;
import UtilsLayer.UtilsClass;



public class LoginPage extends BaseClass2{
	
	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	@FindBy(xpath="//button")
	private WebElement LoginButton;
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
			}
	
	public void typeUsernameAndPassword(String uname,String pass) {
		UtilsClass.entervalue(username, uname);
		UtilsClass.entervalue(password, pass);
		
	}
	public void clickOnLoginButton() {
		UtilsClass.clickOnButton(LoginButton);
	}
	
}