package StepsDefinationsHelper;

import org.openqa.selenium.WebDriver;

import Utils.LocatorReader;
import Utils.ProeprtyReader;

public class RegistractionPageHelper {
	public WebDriver driver;
	public RegistractionPageHelper(WebDriver driver) {
		// this.driver = driver;
		this.driver=driver;
		System.out.println("In base Helperclase: "+driver.toString());
	}
	
	public void get(String baseURL) {
		// Reading the the locators from the "Header.xml" locator file.
		LocatorReader readXml = new LocatorReader("Header.xml");
        String locator1 = readXml.getData("register");
        System.out.println("Home : "+locator1);
     // Reading the the locators from the "Config.properties" property file.
        ProeprtyReader prpertyreader = new ProeprtyReader("Config.properties");

       String value1 = prpertyreader.getdata("siteName");
       System.out.println("Site Name : "+value1);
       String value2 = prpertyreader.getdata("browser");
       System.out.println("Brwoser Name : "+value2);
       String value3 = prpertyreader.getdata("defaultUsername");
       System.out.println("Username Name : "+value3);
       String value4 = prpertyreader.getdata("defaultPassword");
       System.out.println("Password : "+value4);
		driver.get(baseURL + "/webapp/wcs/stores/servlet/RegistrationLogonView");
	}
}
