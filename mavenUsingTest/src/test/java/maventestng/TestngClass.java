package maventestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngClass {
	public WebDriver driver;
	@BeforeMethod
	public void LaunchApp()
	{
		//Launch application
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\om\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	
		}
	
	@AfterMethod
	public void CloseApp() throws Exception
	{
		//Close my application
		
		Thread.sleep(3000);
		driver.quit();
	}
	@Test
	public void keysDownAndKeysup() throws InterruptedException
	{
		WebElement e=driver.findElement(By.id("lst-ib"));
		Thread.sleep(3000);
		
		Actions a=new Actions(driver);
		a.sendKeys(e,"lakshman").build().perform();
		Thread.sleep(3000);
		a.sendKeys(Keys.DOWN,Keys.DOWN,Keys.DOWN,Keys.DOWN,Keys.ENTER).build().perform();
		Thread.sleep(5000);
		WebElement e1=driver.findElement(By.id("lst-ib"));
		e1.click();
		Thread.sleep(2000);
		a.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).build().perform();
	}
	
	
}
