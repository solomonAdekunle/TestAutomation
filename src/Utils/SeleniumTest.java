package Utils;


import java.util.concurrent.TimeUnit;
//import static org.junit.Assert.*;
import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.Scenario;


import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.safari.SafariDriver;


public class SeleniumTest {
	public WebDriver driver;

	public String baseUrl;

	public String browserName;

	public String browserVersion;
	//----------------------------------------------------------------------------


	public void Launchbrowser() throws Exception 
      {
			//driver = new HtmlUnitDriver();
			System.setProperty("webdriver.gecko.driver", "Lib\\geckodriver.exe");
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", true);
			driver = new FirefoxDriver(capabilities);
			//	driver.get("http://www.toolsqa.com");
			//     driver =new FirefoxDriver();
			//
			//driver = new FirefoxDriver();

			//driver = new ChromeDriver();

			//driver = new  InternetExplorerDriver ();

			//driver = new  SafariDriver();

			baseUrl = "http://www.dunelm-mill.com";

			//note due to issue in wordpress the URL does not display properly above. The URL should end with a forward slash, then quote marks, then a semi colon.

			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			driver.manage().window().maximize();

			Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();

			browserName = caps.getBrowserName();

			browserVersion = caps.getVersion();

			System.out.println("Automated test run. We�re running on "+browserName+" "+browserVersion);
			System.out.println("Launching browser"); 
			 driver.get(baseUrl);
			 System.out.println("In base class: "+driver.toString());
      }

	public void tidyUp(Scenario s) 
		{
			 if (s.isFailed()) {
				 System.out.println("Failed");
				  }
			 else{
				 System.out.println("Passed");
			 }
			 
			 driver.quit();
		}
	

	
	//----------------------------------------------------------------------------

	
	
}
