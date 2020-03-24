package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

//import credentials.iboss_ElementLocators;
//import objectRepository.iboss_LoginPage;
//import objectRepository.iboss_HomePage;
//import objectRepository.iboss_MyProfilePage;

public class iboss_LaunchAllBrowsersTest 
{
	
	
		
	@Test
	public void TC_MyProfile() throws InterruptedException
	{
		//Firefox Launch
		//=====================================================================================================
		System.setProperty("webdriver.gecko.driver", "C://sarath_eclipse//sarath_eclipse_jars//geckodriver-v0.26.0-win32//geckodriver.exe");
		WebDriver ibossFirefox = new FirefoxDriver();
		System.out.println("Firefox launched cs");
		
		//maximize browser
		ibossFirefox.manage().window().maximize();
		ibossFirefox.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		ibossFirefox.get("https://dev-iboss-bvss-19.webappuat.com/");
		
		//Chrome Launch
		//======================================================================================================
		System.setProperty("webdriver.chrome.driver", "C://sarath_eclipse//sarath_eclipse_jars//chromedriver_win32//chromedriver.exe");
		WebDriver ibossChrome = new ChromeDriver();
		System.out.println("Chrome launched cs");
		
		//maximize browser
		ibossChrome.manage().window().maximize();
		ibossChrome.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		ibossChrome.get("https://dev-iboss-bvss-19.webappuat.com/");
		
		//Edge Launch
		//======================================================================================================
		System.setProperty("webdriver.edge.driver", "C://Windows//System32//MicrosoftWebDriver.exe");
		WebDriver ibossEdge = new EdgeDriver();
		System.out.println("MicrosoftEdge launched cs");
		
		//maximize browser
		ibossEdge.manage().window().maximize();
		ibossEdge.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		ibossEdge.get("https://dev-iboss-bvss-19.webappuat.com/");
		
		//Opera Launch
		//======================================================================================================
			
		System.setProperty("webdriver.opera.driver","C://sarath_eclipse//sarath_eclipse_jars//operadriver_win64//operadriver_win64//operadriver.exe");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		OperaOptions options = new OperaOptions();
		options.setBinary("C://Users//schandrasekhar//AppData//Local//Programs//Opera//65.0.3467.48//Opera.exe");
		capabilities.setCapability(OperaOptions.CAPABILITY, options);
		@SuppressWarnings("deprecation")
		OperaDriver ibossOpera = new OperaDriver(capabilities);
		
		System.out.println("Opera launched cs");
		
		//maximize browser
		ibossOpera.manage().window().maximize();
		ibossOpera.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		ibossOpera.get("https://dev-iboss-bvss-19.webappuat.com/");
		
		
						
	}
	
	

}
