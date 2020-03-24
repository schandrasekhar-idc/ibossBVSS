package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import credentials.iboss_ElementLocators;

public class iboss_MyProfilePage extends iboss_ElementLocators
{	
	
	
	//constructor
	public iboss_MyProfilePage(WebDriver iboss)
	{
		super(iboss);
		
	}
	
	public WebElement iboss_Home()
	{
		return iboss.findElement(Home);
	}
	
	public WebElement iboss_MyProfile()
	{
		return iboss.findElement(MyProfile);
	}
	
	
	
	
	

}
