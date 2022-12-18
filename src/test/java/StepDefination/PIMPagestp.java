package StepDefination;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;

import BaseLayer1.BaseClass2;
import PageLayer.PIMPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class PIMPagestp extends BaseClass2 {
	
	protected static PIMPage pimpage;
	private static String empID;
	
	@When("user is on PIM page")
	public void user_is_on_pim_page() {
	   pimpage=new PIMPage();
	   pimpage.clickOnPimLink();
	}

	@Then("validate PIM page url")
	public void validate_pim_page_url() {
	    Assert.assertEquals(true, pimpage.capturePIMPageUrl().contains("pim"));
	}

	@When("user click on Add button")
	public void user_click_on_add_button() {
	   pimpage.clickOnAddButton();
	}

	@When("user is on add employee page")
	public void user_is_on_add_employee_page() {
	    Assert.assertEquals(true,pimpage.captureAddEmployeePageUrl().contains("addEmployee"));
	}

	@Then("user enter firstname and lastname")
	public void user_enter_firstname_and_lastname() throws InterruptedException {
		Thread.sleep(3000);
	   pimpage.enterFirstnameAndLastname("ramesh","Dev");
	}

	@Then("user can capture employee id")
	public void user_can_capture_employee_id() throws InterruptedException {
		Thread.sleep(2000);
	  empID=  pimpage.CaptureEmpID();
	}

	@Then("user can click on Save button")
	public void user_can_click_on_save_button() throws InterruptedException {
		Thread.sleep(2000);
	    pimpage.ClickOnSave();
	}

	@When("user click on employee list")
	public void user_click_on_employee_list() throws InterruptedException {
    Thread.sleep(3000);
    pimpage.clickonEmplist();

	}

	@When("user enter employee id")
	public void user_enter_employee_id() throws InterruptedException {
		
		Thread.sleep(2000);
	    pimpage.searchempID(this.empID);
	}

	@Then("user click on search")
	public void user_click_on_search() throws InterruptedException {
		Thread.sleep(2000);
	    pimpage.clickonsearchButton();
	}

	@Then("user click on checkBox")
	public void user_click_on_check_box() throws InterruptedException {
	  Thread.sleep(3000);
	  pimpage.clickOnselecteCheckBox();
	}

	@Then("user click on Delete selected")
	public void user_click_on_delete_selected() throws InterruptedException {
		Thread.sleep(2000);
		
		pimpage.clickondeleteselected();
	    
	}

	@Then("capture popup text")
	public void capture_popup_text() {
	   String a= pimpage.capturePopUpText();
	   System.out.println(a);
	  Assert.assertEquals(true, a.contains("permanently"));
	}

	@Then("click on yes delete button")
	public void click_on_yes_delete_button() throws InterruptedException {
	    Thread.sleep(3500);
	    pimpage.clickonyesDelete();
	}

	
	

}
