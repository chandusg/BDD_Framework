package com.sampleframework.glue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.sampleframework.utilities.Utility;

import cucumber.api.java.Before;

public class CommonStepDefinition {
	
	protected static WebDriver driver;
	Utility utility= new Utility();
	@Before
	   public void setUpBrowser()
	   {
		   if(utility.readValuesFromProperties("browser").equals("Chrome"))
		   {
			   System.setProperty("webdriver.chrome.driver", "C:\\Users\\s.gowdara\\Documents\\LEARNING_STUFFS\\OwnLearning\\ThoughtWorksFramework\\sampleframework\\src\\main\\resources\\drivers\\chromedriver.exe");
			   driver= new ChromeDriver();
			   
		   }
		   else if(utility.readValuesFromProperties("browser").equals("Firefox"))
		   {
			   System.setProperty("webdriver.gecko.driver", "C:\\Users\\s.gowdara\\Documents\\LEARNING_STUFFS\\OwnLearning\\ThoughtWorksFramework\\sampleframework\\src\\main\\resources\\drivers\\geckodriver.exe");
			   driver= new FirefoxDriver();
			   
		   }
		   else if(utility.readValuesFromProperties("browser").equals("ie"))
		   {
			   System.setProperty("driver.ie.driver", "geckodriver.exe");
			   driver= new FirefoxDriver();
		   }
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   
		   PageFactory.initElements(driver, this);
		   
	   }

}
