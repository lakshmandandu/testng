package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestEx {

	@Test(priority=5,groups= {"functional"})
	@Parameters(value= {"Browser","WaitTime"})
public void launchBrowser(String Browser, int wait)
{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\om\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.telangana.gov.in/");
		System.out.println("open chrome browser");
		System.out.println("wait");

	}

	@Test(priority=3,description="lakshman")
	public void testB()
	{
			System.out.println("welcome TestNgB");

		}

	@Test(priority=2,enabled=false)
	public void testC()
	{
			System.out.println("welcome TestNgC");

		}

	@Test(priority=6,invocationCount=6,groups= {"smoke"})
	public void testD()
	{
			System.out.println("welcome TestNgD");

		}

	@Test(priority=3,groups= {"sanity"})
	public void testE()
	{
			System.out.println("welcome TestNgE");

		}

	@Test(priority=2,groups= {"sanity","smoke"})
	public void testF()
	{
			System.out.println("welcome TestNgF");

		}

	@Test(priority=3)
	public void login()
	{
		Assert.fail();
			System.out.println("welcome login");

		}
	

	@Test(priority=2,dependsOnMethods= {"login"})
	public void logout()
	{
			System.out.println("welcome logout");

		}

}
