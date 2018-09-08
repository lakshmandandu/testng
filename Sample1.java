package testNG;

import org.testng.annotations.Test;

public class Sample1 {
	@Test(priority=3,groups= {"smoke","sanity"})
	public void testA()
	{
		System.out.println("welcome testA");
	}
	
	@Test(priority=4,invocationCount=5,groups= {"smoke"})
	public void testB()
	{
		System.out.println("welcome testB");
	}
	@Test(priority=1,enabled=false)
	public void testC()
	{
		System.out.println("welcome testC");
	}
	@Test(priority=2,groups= {"sanity"})
	public void testD()
	{
		System.out.println("welcome testD");
	}
	
}
