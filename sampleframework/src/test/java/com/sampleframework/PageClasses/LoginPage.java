package com.sampleframework.PageClasses;

import org.openqa.selenium.WebDriver;

import com.sampleframework.common.BaseClass;


public class LoginPage extends BaseClass
{
//   WebDriver driver;
	public void loadURL(String url)
	   {
		   driver.get(url);
	   }
   
}
