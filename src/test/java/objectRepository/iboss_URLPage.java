package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import credentials.iboss_ElementLocators;

public class iboss_URLPage extends iboss_ElementLocators
{	
	
	
	//constructor
	public iboss_URLPage(WebDriver iboss)
	{
		super(iboss);
		
	}
	
	public WebElement iboss_Home()
	{
		return iboss.findElement(Home);
	}
	
	public WebElement iboss_URL()
	{
		return iboss.findElement(URL);
	}
	
	
	
	
	

}
