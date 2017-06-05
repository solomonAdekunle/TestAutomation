package StepsDefinations;

import StepsDefinationsHelper.RegistractionPageHelper;

//import java.util.Base64;

//import org.junit.Assert;



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

public class DepositStepDefination {

	private BaseStepDefination contextSteps;
	private RegistractionPageHelper registerPage;
	public DepositStepDefination(BaseStepDefination contextSteps) throws Exception {
		this.contextSteps = contextSteps;
		System.out.println(this.contextSteps);
		registerPage=new RegistractionPageHelper(contextSteps.getwebdriver());
	}

@Given("^I search for Step2$") 
	public void Test() throws Throwable{

	    System.out.println("Deposit In step 2");
	   registerPage.get("http://www.dunelm-mill.com");
	};
	

	@Given("^found Step3$") 
	public void Test2() throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("In step 3");
		//throw new PendingException();
	};


}
