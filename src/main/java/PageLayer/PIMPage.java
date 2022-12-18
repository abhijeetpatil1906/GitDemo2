package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer1.BaseClass2;
import UtilsLayer.UtilsClass;

public class PIMPage extends BaseClass2 {
	
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement pimlink;
	
	public PIMPage() {
		
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnPimLink() {
		
		UtilsClass.clickOnButton(pimlink);
	}
	
	public String capturePIMPageUrl() {
		return driver.getCurrentUrl();
	}
	
	@FindBy(xpath="//button[text()=' Add ']")
	private WebElement AddButton;
	
	@FindBy(name="firstName")
	private WebElement firstName;
	
	@FindBy(name="lastName")
	private WebElement lastName;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement empID ;
	
	@FindBy(xpath="//button[text()=' Save ']")
	private WebElement SaveButton;
	
	public void clickOnAddButton() {
		
		UtilsClass.clickOnButton(AddButton);
	}
	public String captureAddEmployeePageUrl() {
		return driver.getCurrentUrl();
	}
	
	public void enterFirstnameAndLastname(String Fname,String Lname) {
		
		UtilsClass.entervalue(firstName, Fname);
		UtilsClass.entervalue(lastName, Lname);
	}
	
	public String CaptureEmpID() {
		
		return empID.getAttribute("value");
	}
	
	public void ClickOnSave() {
		
		UtilsClass.clickOnButton(SaveButton);
		
	}
	
	@FindBy(xpath="//a[text()='Employee List']")
	private WebElement Emplist;
	
	public void clickonEmplist() {
		
		UtilsClass.clickOnButton(Emplist);
	}
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement searchEmpId;
	
	public void searchempID(String ID) {
		
		UtilsClass.entervalue(searchEmpId, ID);
			}
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement search;
	
	public void clickonsearchButton() {
		
		UtilsClass.clickOnButton(search);
	}
	
	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	private WebElement checkbox;
	
	public void clickOnselecteCheckBox() {
		UtilsClass.clickOnButton(checkbox);
		
	}
	
	@FindBy(xpath="(//button[@type='button'])[4]")
	private WebElement Deleteselected;
	
	public void clickondeleteselected() {
		
		UtilsClass.clickOnButton(Deleteselected);
	}
	
	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--card-body']")
	private WebElement capturePopText;

	public String capturePopUpText() {
		return capturePopText.getText();
	}
	@FindBy(xpath="//button[text()=' Yes, Delete ']")
	private WebElement yesDelete;
	
	public void clickonyesDelete() {
		
		UtilsClass.clickOnButton(yesDelete);
	}
	

}
