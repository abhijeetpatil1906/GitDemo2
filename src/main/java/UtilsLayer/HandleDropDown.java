package UtilsLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import BaseLayer1.BaseClass2;



public class HandleDropDown extends BaseClass2 {
	
	protected static Select sel;
	
	public static void HandleDropdown(WebElement wb,String value) {
	
	new Select(wb).selectByVisibleText(value);
	}

}
