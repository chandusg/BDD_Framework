package com.sampleframework.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility {
	static Properties properties=null;
	
	
	
	
static {
	try {
		 properties= new Properties();
		FileInputStream input=new FileInputStream("C:\\Users\\s.gowdara\\Documents\\LEARNING_STUFFS\\OwnLearning\\ThoughtWorksFramework\\sampleframework\\src\\main\\resources\\properties\\environment.properties");
		properties.load(input);
		System.out.println(properties);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
}
	
	public String readValuesFromProperties(String key)
	{
		String propValue=properties.getProperty(key);
		return propValue;
	}
	
	
	
	}
	
	

