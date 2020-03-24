package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import credentials.iboss_ElementLocators;
import objectRepository.iboss_LoginPage;
import objectRepository.iboss_HomePage;
import objectRepository.iboss_MyProfilePage;

public class iboss_SessionOutTest 
{
	
	
		
	@Test
	public void TC_MyProfile() throws InterruptedException
	{
		
		//======================================================================================================
		System.setProperty("webdriver.chrome.driver", "C://sarath_eclipse//sarath_eclipse_jars//chromedriver_win32//chromedriver.exe");
		WebDriver iboss = new ChromeDriver();
		
		
		//maximize browser
		iboss.manage().window().maximize();
		iboss.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		iboss.get("https://dev-iboss-bvss-19.webappuat.com/Home/SignIn");
		
		//verify page title
		//waitForElementDisplay()
		iboss_ElementLocators iboss_EL = new iboss_ElementLocators(iboss);
		iboss_EL.waitAndVerifyTitle();
		
		//access objectRepository package classes
		iboss_LoginPage iboss_LP = new iboss_LoginPage(iboss);
		
				
		//access iboss_Email() and give Username value
		iboss_LP.iboss_Email().sendKeys("idc.test.adm@webappuat.com");
		
		
		
		//Thread.sleep(20000);
		//access iboss_Password() and give Password value
		iboss_LP.iboss_Password().sendKeys("Test1234!");
		
		//access iboss_SignIn() and click SignIn button
		iboss_LP.iboss_SignIn().click();
		
		//=====================================================================================================================
		
		//access objectRepository class - iboss_HomePage
		iboss_HomePage iboss_HP = new iboss_HomePage(iboss);
		
		//wait 20 seconds
		Thread.sleep(20000);
		
		//click on Menu-Toggle
		iboss_HP.iboss_Home().click();
		
				
		//=====================================================================================================================
		
		//My Profile - Test
		//access objectRepository class - iboss_MyProfile
		iboss_MyProfilePage iboss_MP = new iboss_MyProfilePage(iboss);
		
		
		//wait 20 seconds
		Thread.sleep(20000);
				
		//click on MyProfile module
		iboss_MP.iboss_MyProfile().click();
		
		//======================================================================================================================
		
		//wait 30min
		Thread.sleep((long) 1.8e+6); //30 minutes
		
		
		//*[@id="session-timeout-dialog"]
		
		//Return to Console using Menu-Toggle
		iboss_HP.iboss_Home().click();
		
		//click on Home link
		//iboss_HP.iboss_HomeLink().click();
		
		
				
		
	}
	
	

}
