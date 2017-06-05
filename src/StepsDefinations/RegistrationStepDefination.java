package StepsDefinations;

//import java.util.Base64;

import org.junit.Assert;
import StepsDefinationsHelper.RegistractionPageHelper;


//import com.google.common.net.MediaType;

import cucumber.api.java.en.Given;
//import java.io.IOException;
//import java.net.URI;
//import java.util.Arrays;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;

//import org.eclipse.jetty.util.Promise;
//import org.json.simple.JSONObject;
//import org.testng.ITestResult;
//import org.testng.TestListenerAdapter;

public class RegistrationStepDefination{
	//public WebDriver driver;
	private BaseStepDefination contextSteps;
	
	private RegistractionPageHelper registerPage;
	public RegistrationStepDefination(BaseStepDefination contextSteps) throws Exception {
		this.contextSteps = contextSteps;
		System.out.println(this.contextSteps);
		registerPage=new RegistractionPageHelper(contextSteps.getwebdriver());
	}
	
	
	
	@Given("^I am on the homepage$") 
	public void Test() throws Throwable{
	    System.out.println("In step 1");
	   
	    registerPage.get("http://www.dunelm-mill.com");
	};
	

	@Given("^I search for pillows$") 
	public void Test2() throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("In step 2");
		//throw new PendingException();
	};

	@Given("^the page title is as expected$") 
	public void Test3() throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
		Assert.fail();
		System.out.println("In step 3");
		//throw new PendingException();
	};

	
	
}
