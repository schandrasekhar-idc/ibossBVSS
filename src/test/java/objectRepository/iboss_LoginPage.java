package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import credentials.iboss_ElementLocators;

public class iboss_LoginPage extends iboss_ElementLocators
{
	
	public iboss_LoginPage(WebDriver iboss) 
	{
		super(iboss);
				
	}
	
	
	public WebElement iboss_Email()
	{		
		//waitForElementDisplay();
		
		
		return iboss.findElement(Username);		
	}	
	
	
	public WebElement iboss_Password()
	{
		return iboss.findElement(Password);
	}
	
	public WebElement iboss_SignIn()
	{
		return iboss.findElement(SignIn);
	}
	
	
	

}












