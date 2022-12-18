package UtilsLayer;

import org.openqa.selenium.WebElement;

import BaseLayer1.BaseClass2;

public class UtilsClass extends BaseClass2{
	
	public static void entervalue(WebElement wb,String value) {
		if((wb.isDisplayed()&&(wb.isDisplayed()))) {
			
			wb.sendKeys(value);
		}
		
	}
	
	public static void clickOnButton(WebElement wb) {
		if((wb.isDisplayed()&&(wb.isDisplayed()))) {
			wb.click();
		}
		
	}

}
