package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.iboss_LoginPage;
import objectRepository.iboss_HomePage;
import objectRepository.iboss_PartnersPage;

public class iboss_ApplicationPartners 
{
	
	
		
	@Test
	public void TC_MyProfile() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C://sarath_eclipse//sarath_eclipse_jars//chromedriver_win32//chromedriver.exe");
		WebDriver iboss = new ChromeDriver();
		
		
		//maximize browser
		iboss.manage().window().maximize();
		
		iboss.get("https://dev-iboss-bvss-19.webappuat.com/Home/SignIn");
		
		
		//access objectRepository package classes
		iboss_LoginPage iboss_LP = new iboss_LoginPage(iboss);
		
		//wait statement and
		//constructor for iboss_ElementLocators
			
		
		//access iboss_Email() and give Username value
		iboss_LP.iboss_Email().sendKeys("schandrasekhar@idc.com");
		
	 	
		
		Thread.sleep(20000);
		//access iboss_Password() and give Password value
		iboss_LP.iboss_Password().sendKeys("Test1234!");
		
		//access iboss_SignIn() and click SignIn button
		iboss_LP.iboss_SignIn().click();
		
		//=====================================================================================================================
		
		//access objectRepository class - iboss_HomePage
		iboss_HomePage iboss_HP = new iboss_HomePage(iboss);
		
		//wait 20 seconds
		Thread.sleep(16000);
		
		//click on Home link
		iboss_HP.iboss_Home().click();
		
				
		//=====================================================================================================================
		
		//access objectRepository class - iboss_PartnersPage
		iboss_PartnersPage iboss_Part = new iboss_PartnersPage(iboss);
		
		//wait 20 seconds
		Thread.sleep(20000);
				
		//click on Partners
		iboss_Part.iboss_Partners().click();
		
		//wait  10 mseconds
		Thread.sleep(10000); //time in milliseconds
		
		//click on Compliance
		//iboss_Part.ibossCompliance().click();
		
		//click on Edit
		iboss_Part.ibossEdit().click();
		
		
		
		
		
		
		
		
		
	}
	
		

}
