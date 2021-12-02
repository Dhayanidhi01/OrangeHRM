package com.OrangeHRM_PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PO_User_Role_Page_Objects {

	@FindBy(id="searchSystemUser_userName")
	public static WebElement username;

	@FindBy(id="searchSystemUser_userType")
	public static WebElement userRole;

	@FindBy(id="searchSystemUser_status")
	public static WebElement userStatus;

	@FindBy(id="searchBtn")
	public static WebElement searchButton;

	@FindBy(xpath="//*[@id='resultTable']/tbody/tr[1]/td[3]")
	public static WebElement userRoleValue;

	@FindBy(xpath="//*[@id='resultTable']/tbody/tr[1]/td[5]")
	public static WebElement userStatusValue;

	@FindBy(linkText="Admin")
	public static WebElement adminlink;

	@FindBy(linkText="User Management")
	public static WebElement usermanagementlink;

	@FindBy(linkText="Users")
	public static WebElement usersLink;


}
