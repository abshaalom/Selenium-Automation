package testng;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngpgm {
	@BeforeTest
	public void beforetest()
	{
		System.out.println("Before test");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before method");
	}
	@Test(priority = 3,invocationCount = 3)
	public void test1()
	{
		System.out.println("test 1");
	}
	@Test(priority = 1,groups = {"smoke"})
	public void test2() 
	{
		System.out.println("test 2");
	}
	@Test(priority = 2, groups="sanity")
	public void test3()
	{
		System.out.println("test 3");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("After method");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("After test");
	}

}
//(priority=2,invocationCount = 3)