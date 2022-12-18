package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer1.BaseClass2;

public class HomePage extends BaseClass2{
	
	@FindBy(xpath="//img[@alt='client brand banner']")
	private WebElement logo;
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	public String captureHomepageTitle() {
		
		return driver.getTitle();
	}
	public String captureHomepageUrl() {
		
		return driver.getCurrentUrl();
	}
	public boolean validateLogo() {
		
		return logo.isDisplayed();
	}

}
