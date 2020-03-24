package objectRepository;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import credentials.iboss_ElementLocators;
import credentials.iboss_loginProperties;

public class iboss_UsersPage extends iboss_ElementLocators
{	
	
	
	//constructor
	public iboss_UsersPage(WebDriver iboss)
	{
		super(iboss);
		
	}
	
	public WebElement iboss_Home()
	{
		return iboss.findElement(Home);
	}
	
	public WebElement iboss_AccessUsersModule()
	{
		return iboss.findElement(Users);
	}
	
	
	public void iboss_AddUsers() throws InterruptedException, IOException
	{
		iboss_loginProperties lp = new iboss_loginProperties(iboss);
		
		//Access Users module
		iboss_AccessUsersModule().click();
		
		//Click "Add New" button
		iboss.findElement(AddNewUser).click();
		
		//Wait 10 seconds before entering user name/email
		Thread.sleep(10000);
		
		//Enter new user Email address
		iboss.findElement(AddUserEmail).sendKeys(lp.usernameValue(1,0,0));
		
		//Enter new user First Name
		iboss.findElement(AddUserFirstName).sendKeys(lp.usernameValue(0,2,0));
		
		//Enter new user Last Name
		iboss.findElement(AddUserLastName).sendKeys(lp.usernameValue(0,0,3));
		System.out.println("See OK");
		//Click "OK" on Add User modal
		iboss.findElement(AddUserOK).click();
		System.out.println("OK clicked");
		
		Thread.sleep(20000);
		
		WebElement SuccessMsg = iboss.findElement(AddUserModalSuccess);
		WebElement CreatedSuccessMsg = iboss.findElement(AddUserModalCreatedSuccessMsg);
		String SuccessMsgText = SuccessMsg.getText();
		
		if(SuccessMsgText.length()!=0)
		{
			System.out.println(SuccessMsgText);
			System.out.println(CreatedSuccessMsg);
			
		}
		else
		{
			System.out.println("No SuccessMsgText");
		}
		
		//call screenshot method from TakeScreenShot class
		TakeScreenShot TSS = new TakeScreenShot();
		TSS.screenshot(iboss, "iboss", "AddUserConfirm");
		
		//Click "Close" button on success modal
		iboss.findElement(AddUserClose).click();
		
		
		
	}
	 
	
	
	
	

}
