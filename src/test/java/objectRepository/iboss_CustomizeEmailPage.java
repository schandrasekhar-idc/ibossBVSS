package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import credentials.iboss_ElementLocators;

public class iboss_CustomizeEmailPage extends iboss_ElementLocators
{	
	
	
	//constructor
	public iboss_CustomizeEmailPage(WebDriver iboss)
	{
		super(iboss);
		
	}
	
	public WebElement iboss_Home()
	{
		return iboss.findElement(Home);
	}
	
	public WebElement iboss_CustomizeEmail()
	{
		return iboss.findElement(CustomizeEmail);
	}
	
	
	
	
	

}
