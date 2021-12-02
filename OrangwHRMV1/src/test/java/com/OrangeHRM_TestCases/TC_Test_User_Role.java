package com.OrangeHRM_TestCases;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.CommonFunctions.CommonFunctions;
import com.OrangeHRM_PageObjects.PO_User_Role_Page_Objects;

public class TC_Test_User_Role extends CommonFunctions{

	
	
	public void moveToUserPage() {
		
		Actions actions=new Actions(driver);
		actions.moveToElement(PO_User_Role_Page_Objects.adminlink).click(PO_User_Role_Page_Objects.adminlink).build().perform();
		actions.moveToElement(PO_User_Role_Page_Objects.usermanagementlink).click(PO_User_Role_Page_Objects.usermanagementlink).build().perform();
		actions.moveToElement(PO_User_Role_Page_Objects.usersLink).click().build().perform();
		
	}
	public void selectUserRole() {
		Select selectRole=new Select(PO_User_Role_Page_Objects.userRole);
		selectRole.selectByIndex(1);	
	}
	public void selectStatus() {
		Select selectStatus=new Select(PO_User_Role_Page_Objects.userStatus);
		selectStatus.selectByIndex(1);	
	}
	
	public void searchButton() {
		PO_User_Role_Page_Objects.searchButton.click();
	}
	
	public void UserandStatusValue() {
		
		String actualRole=PO_User_Role_Page_Objects.userRoleValue.getText();
		String actualStatus=PO_User_Role_Page_Objects.userStatusValue.getText();
		
		Assert.assertEquals(actualRole, "Admin");
		Assert.assertEquals(actualStatus, "Enabled");
		
		System.out.println(actualRole + actualStatus);
		
	}
	
	
	@Test
	public void checkUserRole() {
		PageFactory.initElements(driver, PO_User_Role_Page_Objects.class);
		moveToUserPage();
		selectUserRole();
		selectStatus();
		searchButton();
		UserandStatusValue();
	
	}
}
