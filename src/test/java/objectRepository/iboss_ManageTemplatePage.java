package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import credentials.iboss_ElementLocators;

public class iboss_ManageTemplatePage extends iboss_ElementLocators
{	
	
	
	//constructor
	public iboss_ManageTemplatePage(WebDriver iboss)
	{
		super(iboss);
		
	}
	
	public WebElement iboss_Home()
	{
		return iboss.findElement(Home);
	}
	
	public WebElement iboss_ManageTemplate()
	{
		return iboss.findElement(ManageTemplate);
	}
	
	
	
	
	

}
