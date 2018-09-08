package testNG;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEx1 {

		@Test(priority=5,groups= {"functional"})
	public void testA()
	{
			System.out.println("welcome TestNgA");

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



