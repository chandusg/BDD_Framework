package com.sampleframework.glue;

import org.openqa.selenium.support.FindBy;

import com.sampleframework.PageClasses.LoginPage;
import com.sampleframework.utilities.Utility;

import cucumber.api.java.en.Given;

public class LoginStepDefinition {
	
	
	
	@FindBy()
	Utility utility= new Utility();
	LoginPage loginPage= new LoginPage() ;
	
	
	@Given("^the user is opened the login page of the application$")
	public void openTheGivenURL()
	{
		
		String URL=utility.readValuesFromProperties("url");
		loginPage.loadURL(URL);
		
	}
	
	


}
