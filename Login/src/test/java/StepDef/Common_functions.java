package StepDef;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Constants.constants;
import driver.DriverManager;
import io.cucumber.java.Before;

public class Common_functions {
	@Before
	public void beforeScenario()
	{   
		
		try {
			Common_Utilities common_Utilities = new Common_Utilities();
		    common_Utilities.loadProperties();	
			if(DriverManager.getDriver() == null)
				DriverManager.launchBrowser();
			    common_Utilities.InitializeinitElements();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
