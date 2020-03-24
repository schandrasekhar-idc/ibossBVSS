package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import credentials.iboss_ElementLocators;
import objectRepository.iboss_LoginPage;
import objectRepository.iboss_ManageTemplatePage;
import objectRepository.iboss_AnalyticsPage;
import objectRepository.iboss_CampaignPage;
import objectRepository.iboss_CustomizeEmailPage;
import objectRepository.iboss_CustomizeReportPage;
import objectRepository.iboss_DataMiningPage;
import objectRepository.iboss_DomainBlacklistPage;
import objectRepository.iboss_HomePage;
import objectRepository.iboss_MyProfilePage;
import objectRepository.iboss_PartnersPage;
import objectRepository.iboss_URLPage;
import objectRepository.iboss_UsersPage;

public class iboss_TC_AdminConsole 
{
	
	
		
	@Test
	public void TC_AdminConsole() throws InterruptedException
	{
		
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
		
		//wait 20 seconds
		Thread.sleep(20000);
		
		//Return to Console using Menu-Toggle
		iboss_HP.iboss_Home().click();
		
		//click on Home link
		iboss_HP.iboss_HomeLink().click();
		
		
		//======================================================================================================================
		
		//Campaign - Test
		//access objectRepository class - iboss_CampaignPage
		iboss_CampaignPage iboss_MC = new iboss_CampaignPage(iboss);
		
		//wait 20 seconds
		Thread.sleep(20000);
		
		//click on Campaign module
		iboss_MC.iboss_Campaign().click();
		
		//======================================================================================================================
		
		//wait 20 seconds
		Thread.sleep(20000);
				
		//Return to Console using Menu-Toggle
		iboss_HP.iboss_Home().click();
				
		//click on Home link
		iboss_HP.iboss_HomeLink().click();
				
				
		//======================================================================================================================
		
		//Users - Test
		//access objectRepository class - iboss_UsersPage
		iboss_UsersPage iboss_U = new iboss_UsersPage(iboss);
				
		//wait 20 seconds
		Thread.sleep(20000);
				
		//click on Users module
		iboss_U.iboss_AccessUsersModule().click();
		
		
		
		//======================================================================================================================
		
		//wait 20 seconds
		Thread.sleep(20000);
						
		//Return to Console using Menu-Toggle
		iboss_HP.iboss_Home().click();
						
		//click on Home link
		iboss_HP.iboss_HomeLink().click();
						
						
		//======================================================================================================================
				
		//Data Mining - Test
		//access objectRepository class - iboss_DataMiningPage
		iboss_DataMiningPage iboss_DM = new iboss_DataMiningPage(iboss);
						
		//wait 20 seconds
		Thread.sleep(20000);
						
		//click on DataMining module
		iboss_DM.iboss_DataMining().click();
		
		//======================================================================================================================
		
		//wait 20 seconds
		Thread.sleep(20000);
								
		//Return to Console using Menu-Toggle
		iboss_HP.iboss_Home().click();
								
		//click on Home link
		iboss_HP.iboss_HomeLink().click();
								
								
		//======================================================================================================================
						
		//Analytics - Test
		//access objectRepository class - iboss_AnalyticsPage
		iboss_AnalyticsPage iboss_AN = new iboss_AnalyticsPage(iboss);
								
		//wait 20 seconds
		Thread.sleep(20000);
								
		//click on Analytics module
		iboss_AN.iboss_Analytics().click();
		
		
		//======================================================================================================================
		
		//wait 20 seconds
		Thread.sleep(20000);
										
		//Return to Console using Menu-Toggle
		iboss_HP.iboss_Home().click();
										
		//click on Home link
		iboss_HP.iboss_HomeLink().click();
										
										
		//======================================================================================================================
								
		//Partners - Test
		//access objectRepository class - iboss_AnalyticsPage
		iboss_PartnersPage iboss_P = new iboss_PartnersPage(iboss);
										
		//wait 20 seconds
		Thread.sleep(20000);
										
		//click on Analytics module
		iboss_P.iboss_Partners().click();
				
				
		//======================================================================================================================
		
		//wait 20 seconds
		Thread.sleep(20000);
										
		//Return to Console using Menu-Toggle
		iboss_HP.iboss_Home().click();
										
		//click on Home link
		iboss_HP.iboss_HomeLink().click();
										
										
		//======================================================================================================================
								
		//URL - Test
		//access objectRepository class - iboss_AnalyticsPage
		iboss_URLPage iboss_URL = new iboss_URLPage(iboss);
										
		//wait 20 seconds
		Thread.sleep(20000);
										
		//click on URL module
		iboss_URL.iboss_URL().click();
		
		//======================================================================================================================
		
		//wait 20 seconds
		Thread.sleep(20000);
												
		//Return to Console using Menu-Toggle
		iboss_HP.iboss_Home().click();
												
		//click on Home link
		iboss_HP.iboss_HomeLink().click();
												
												
		//======================================================================================================================
										
		//Customize Email - Test
		//access objectRepository class - iboss_CustomizeEmailPage
		iboss_CustomizeEmailPage iboss_CE = new iboss_CustomizeEmailPage(iboss);
												
		//wait 20 seconds
		Thread.sleep(20000);
												
		//click on Analytics module
		iboss_CE.iboss_CustomizeEmail().click();
		
		//======================================================================================================================
		
		//wait 20 seconds
		Thread.sleep(20000);
														
		//Return to Console using Menu-Toggle
		iboss_HP.iboss_Home().click();
														
		//click on Home link
		iboss_HP.iboss_HomeLink().click();
														
														
		//======================================================================================================================
												
		//Customize Report - Test
		//access objectRepository class - iboss_CustomizeReportPage
		iboss_CustomizeReportPage iboss_CR = new iboss_CustomizeReportPage(iboss);
														
		//wait 20 seconds
		Thread.sleep(20000);
														
		//click on CustomizeReport module
		iboss_CR.iboss_CustomizeReport().click();
		
		//======================================================================================================================
		
		//wait 20 seconds
		Thread.sleep(20000);
																
		//Return to Console using Menu-Toggle
		iboss_HP.iboss_Home().click();
																
		//click on Home link
		iboss_HP.iboss_HomeLink().click();
																
																
		//======================================================================================================================
														
		//Domain Blacklist - Test
		//access objectRepository class - iboss_DomainBlacklistPage
		iboss_DomainBlacklistPage iboss_DB = new iboss_DomainBlacklistPage(iboss);
																
		//wait 20 seconds
		Thread.sleep(20000);
																
		//click on Domain Blacklist module
		iboss_DB.iboss_DomainBlacklist().click();
		
		//======================================================================================================================
		
		//wait 20 seconds
		Thread.sleep(20000);
																		
		//Return to Console using Menu-Toggle
		iboss_HP.iboss_Home().click();
																		
		//click on Home link
		iboss_HP.iboss_HomeLink().click();
																		
																		
		//======================================================================================================================
																
		//Manage Template - Test
		//access objectRepository class - iboss_ManageTemplate
		iboss_ManageTemplatePage iboss_MT = new iboss_ManageTemplatePage(iboss);
																		
		//wait 20 seconds
		Thread.sleep(20000);
																		
		//click on ManageTemplate module
		iboss_MT.iboss_ManageTemplate().click();
		
		//======================================================================================================================
		
		//wait 20 seconds
		Thread.sleep(20000);
												
		//Return to Console using Menu-Toggle
		iboss_HP.iboss_Home().click();
												
		//click on Home link
		iboss_HP.iboss_HomeLink().click();
												
												
		//======================================================================================================================
		
		
	}
	
	

}
