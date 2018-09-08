package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerEx implements ITestListener {
	

	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println("class is closed");
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		System.out.println("class is start");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		//System.out.println("Test is failed");
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		System.out.println("Test is failed");
		
		/*File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try
		{
			
		
		FileUtils.copyFile(src, new File("./src/lakshm.png"));
		}
		catch(Exception se)
		{
			System.out.println("Exception is"+se);
		}
		
	}*/
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("Test is skipped");
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("Test is start");
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("Test is passed");
		
	}

}
