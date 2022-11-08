package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Constants.constants;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager 
{   
	private static WebDriver driver = null;
	public static WebDriver getDriver() {
		return driver;
	}
	public static void launchBrowser()
	{
		try {
			
			switch("browserChosen") {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
                break;
                
			case "Edge" :
                WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
                break;
                
            default:
            	WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}


}
