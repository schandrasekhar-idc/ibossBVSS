package credentials;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class iboss_loginProperties 
{
	protected WebDriver iboss;
	protected Properties loginproperties;
	
	protected final String filePath = "configs//Configuration.properties";
	
	
	
	public iboss_loginProperties(WebDriver iboss)
	{
		this.iboss = iboss;		
	}
	
	public String usernameValue(int a, int b, int c)
	{
		String Username="idc.test.adm@webappuat.com";
		String Password="Test1234!";		
		String NewUserEmail="idcqatest1@webappuat.com";
		String NewUserFirstName="IDC Test1";		
		String NewUserLastName="Admin1";
		
		
		if(a==1)
		{			
			return NewUserEmail;
		
		}
		if(b==2)
		{			
			return NewUserFirstName;
		}
		if(c==3)
		{			
			return NewUserLastName;
		}
		return Password;
		
				
		
	}
	
	
	
}
