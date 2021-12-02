package com.OrangeHRM_PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.CommonFunctions.CommonFunctions;

public class PO_LoginPage extends CommonFunctions {

	
	@FindBy(id="txtUsername")
	public static WebElement userName;

	@FindBy(id="txtPassword")
	public static WebElement password;

	@FindBy(id="btnLogin")
	public static WebElement submitButton;

	
}
