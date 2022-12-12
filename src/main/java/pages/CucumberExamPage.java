package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CucumberExamPage {
	
	WebDriver driver;

	public CucumberExamPage(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(how=How.XPATH,using="//button[text()='Set SkyBlue Background']")WebElement setSkyBlueBackgroungButton;
	@FindBy(how=How.XPATH,using="//button[text()='Set White Background']")WebElement setWhiteBackgroundButton;
	@FindBy(how=How.CSS,using="body[style='background-color: skyblue;']") WebElement skyBlueBodyElement;
	@FindBy(how=How.CSS,using="body[style='background-color: white;']")WebElement whiteBodyElement;
	
	public String findSetSkyBlueBackgroundButton()
	{
		System.out.println(setSkyBlueBackgroungButton.getText());
		return setSkyBlueBackgroungButton.getText();
	}
	
	public void clickSetSkyBlueBackgroungButton()
	{
		System.out.println("Clicked Set Sky Blue Button");
		setSkyBlueBackgroungButton.click();
	}
	
		public String findSetWhiteBackgroungButton()
	{
		System.out.println(setWhiteBackgroundButton.getText());
		return setWhiteBackgroundButton.getText();
	}
	
	public void clickSetWhiteBackgroundButton()
	{
		System.out.println("Clicked Set White Button");
		setWhiteBackgroundButton.click();
			}
	
	public String validateSkyBlueBackground()
	{
		System.out.println("Color:"+skyBlueBodyElement.getCssValue("background-color"));
			return skyBlueBodyElement.getCssValue("background-color"); 
	}

	public String validateWhiteBackground()
	{
		System.out.println("Color:"+whiteBodyElement.getCssValue("background-color"));
		return whiteBodyElement.getCssValue("background-color"); 
	}
	
	
	
	
	
	
	
	
	
	

}
