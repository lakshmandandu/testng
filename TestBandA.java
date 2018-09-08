package testNG;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestBandA {
	
@BeforeSuite
public void beforeSuite()
{
	System.out.println("beforesuite");
}
@AfterSuite
public void afterSuite()
{
	System.out.println("aftersuite");
}
@BeforeClass
public void beforeClass()
{
	System.out.println("beforeClass");
}
@Test
public void testClass1()
{
	System.out.println("iam writing before class");
}
@AfterClass
public void afterClass()
{
	System.out.println("afterclass");
}

@Test
public void testClass()
{
	System.out.println("iam writing after class");
}
@BeforeMethod
public void beforeMethod()
{
	System.out.println("beforeMethod");
}
@AfterMethod
public void afterMethod()
{
	System.out.println("afterMethod");
}

}
