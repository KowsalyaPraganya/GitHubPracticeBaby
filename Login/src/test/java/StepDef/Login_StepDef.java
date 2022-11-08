package StepDef;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Constants.constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Login_PageObjects;
import StepDef.Common_functions;
import driver.DriverManager;
public class Login_StepDef {
	
	@Given("user is on login page")
	public void user_is_on_login_page() throws IOException{
		DriverManager.getDriver().get(constants.URL);
	}
	@When("enter username and password")
	public void enter_username_and_password() throws IOException {
		  Login_PageObjects.getInstance().getUserName().sendKeys(constants.Username);
		  Login_PageObjects.getInstance().getPassWord().sendKeys(constants.Password);
		  Login_PageObjects.getInstance().getLoginButton().click();
		}
    @Then("should logged in")
	public void should_logged_in() {
		  Assert.assertEquals("Congratulations student. You successfully logged in!",DriverManager.getDriver().findElement(By.xpath("//*[contains(text(),'Congratulation' )]")).getText()); 
		}
	}

