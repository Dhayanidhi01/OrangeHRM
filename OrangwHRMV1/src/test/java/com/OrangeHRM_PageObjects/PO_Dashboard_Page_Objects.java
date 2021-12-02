package com.OrangeHRM_PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PO_Dashboard_Page_Objects {

	@FindBy(xpath="//*[@id='task-list-group-panel-menu_holder']/table/tbody/tr/td")
	public static WebElement pendingLeaveRequests;
	
}
