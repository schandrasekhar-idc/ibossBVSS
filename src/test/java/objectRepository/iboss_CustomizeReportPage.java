package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import credentials.iboss_ElementLocators;

public class iboss_CustomizeReportPage extends iboss_ElementLocators
{	
	
	
	//constructor
	public iboss_CustomizeReportPage(WebDriver iboss)
	{
		super(iboss);
		
	}
	
	public WebElement iboss_Home()
	{
		return iboss.findElement(Home);
	}
	
	public WebElement iboss_CustomizeReport()
	{
		return iboss.findElement(CustomizeReport);
	}
	
	
	
	
	

}
