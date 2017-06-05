package StepsDefinations;

//import java.util.Base64;

import org.openqa.selenium.WebDriver;

import Utils.SeleniumTest;

//import com.google.common.net.MediaType;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

//import org.eclipse.jetty.util.Promise;
//import org.json.simple.JSONObject;
//import org.testng.ITestResult;
//import org.testng.TestListenerAdapter;

public class BaseStepDefination extends SeleniumTest{
	//public WebDriver driver;
	private static boolean initialized = false;
	@Before
	   public void setUp() throws Exception {
	      if (!initialized) {
	         this.Launchbrowser();
	         initialized = true;
	      }
	   }

	
	
	@After
	public void Teardown(Scenario s) throws Throwable{
		this.tidyUp(s);
		 initialized = false;
	}
	
	
	
	public WebDriver getwebdriver(){
		return driver;
		
	}
}
