package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.CucumberExamPage;
import pages.TestBase;

@SuppressWarnings("deprecation")
public class CucumberExamPageStepDefinitions extends TestBase{
	
	CucumberExamPage cucumberExamPage;
	
	@Before
	public void setUp() {
		TestBase.init();
		cucumberExamPage = PageFactory.initElements(driver, CucumberExamPage.class);
	}
	
	@Given("^\"([^\"]*)\" button exists$")
	public void button_exists(String buttonName)  {
	    
		if(buttonName.equals("Set SkyBlue Background"))
		  {
			  Assert.assertEquals(buttonName, cucumberExamPage.findSetSkyBlueBackgroundButton());
		  }
		  else  if(buttonName.equals("Set SkyWhite Background"))
		  {
			  Assert.assertEquals(buttonName, cucumberExamPage.findSetWhiteBackgroungButton());

		  }
	}

	@When("^I click on the button As \"([^\"]*)\"$")
	public void i_click_on_the_button_As(String button)  {
	    
		if(button.equals("Set SkyBlue Background"))
	    {
			cucumberExamPage.clickSetSkyBlueBackgroungButton();
	    }
	    else if(button.equals("Set White Background"))
	    {
	    	cucumberExamPage.clickSetWhiteBackgroundButton();;
	    }
	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() {
		
		Assert.assertEquals("rgba(135, 206, 235, 1)", cucumberExamPage.validateSkyBlueBackground());
	}

	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() {
	    
		Assert.assertEquals("rgba(255, 255, 255, 1)",cucumberExamPage.validateWhiteBackground());
	}

	@After
	public void tearDown() {
		
		TestBase.closeBrowser();
	}

	
	
	
	
}
