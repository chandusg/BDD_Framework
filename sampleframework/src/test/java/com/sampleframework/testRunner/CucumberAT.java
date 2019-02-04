package com.sampleframework.testRunner;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.sampleframework.utilities.Utility;

import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		plugin ={"pretty", "html:Reports"},
		monochrome=true,
		glue= {"com.sampleframework.glue"},
		features= {"src/test/resources/features"}
		)

public class CucumberAT {
	
	

}
