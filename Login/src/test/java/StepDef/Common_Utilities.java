package StepDef;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import Constants.constants;
import driver.DriverManager;
import pageObjects.Login_PageObjects;

public class Common_Utilities {
	
	public  void loadProperties() {
		
		Properties properties = new Properties();
	    try {
			properties.load(getClass().getResourceAsStream("/config.properties"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	  constants.browserChosen =   properties.getProperty("browserChosen");
	  constants.URL = properties.getProperty("URL");
	  constants.Username = properties.getProperty("Username");
	  constants.Password=  properties.getProperty("Password");
	  constants.chrome_driver_location = properties.getProperty("chrome_driver_location");
	  constants.Edge_driver_location = properties.getProperty("Edge_driver_location");
	   
	  constants.chrome_driver= properties.getProperty("chrome_driver");	
	  constants.Edge_driver =   properties.getProperty("Edge_driver");
		
	}
	
	public static void InitializeinitElements()
	{
		PageFactory.initElements(DriverManager.getDriver(), Login_PageObjects.getInstance());
	}

}
