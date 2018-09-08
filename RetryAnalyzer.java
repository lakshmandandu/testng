package testNG;




	import org.testng.Assert;
	import org.testng.annotations.Test;

	public class RetryAnalyzer {
		 int i=1;
		 
		 @Test(retryAnalyzer=RetryClass.class)
		    public void testretry() throws Exception
		    {

			 i=i+1;
		   if(i>15)
		   {
			  
			   Assert.assertTrue(true);
		   }
		   else
		   {
			   Assert.fail();
		   }

		    
	}
	}




