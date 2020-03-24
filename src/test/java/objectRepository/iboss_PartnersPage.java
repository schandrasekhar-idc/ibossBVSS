package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import credentials.iboss_ElementLocators;

public class iboss_PartnersPage extends iboss_ElementLocators
{	
	
	
	//constructor
	public iboss_PartnersPage(WebDriver iboss)
	{
		super(iboss);
		
	}
	
	public WebElement iboss_Home()
	{
		return iboss.findElement(Home);
	}
	
	public WebElement iboss_Partners()
	{
		return iboss.findElement(Partners);
	}
	
	public WebElement ibossCompliance()
	{
		return iboss.findElement(Compliance);
	}
	
	public WebElement ibossEdit()
	{
		return iboss.findElement(Edit);
	}

	
	
	
	
	
	

}
