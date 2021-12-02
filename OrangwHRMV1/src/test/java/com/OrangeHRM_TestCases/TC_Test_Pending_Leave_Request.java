package com.OrangeHRM_TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.CommonFunctions.CommonFunctions;
import com.OrangeHRM_PageObjects.PO_Dashboard_Page_Objects;
import com.OrangeHRM_PageObjects.PO_LoginPage;

public class TC_Test_Pending_Leave_Request extends CommonFunctions {

	
	public void login() {
		PageFactory.initElements(driver, PO_LoginPage.class);
		PO_LoginPage.userName.sendKeys(properties.getProperty("username"));
		PO_LoginPage.password.sendKeys(properties.getProperty("password"));
		PO_LoginPage.submitButton.click();
	}
	
	
	public void getPendingLeaveRequests() {
		PageFactory.initElements(driver, PO_Dashboard_Page_Objects.class);
		String actualMessage=PO_Dashboard_Page_Objects.pendingLeaveRequests.getText();
	    
	     
	   // Assert.assertnotEquals(actualMessage1, "01. rama ayyar 2021-11-05");
		System.out.println(actualMessage);
	}
	
	@Test
	public void verfiyPendingLeaveRequests() {
		login();
		getPendingLeaveRequests();
		
		
		
		
	}
	
	
}
