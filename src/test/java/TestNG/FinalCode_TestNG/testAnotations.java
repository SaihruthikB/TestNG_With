package TestNG.FinalCode_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testAnotations {
	@Test(priority=1,groups="hruthik")
	public static void Registration()
	{
		Assert.fail("Registration faailed");
		//System.out.println("user Registration is done");
	}
	@Test(priority=2)
	public static void Login()
	{
		System.out.println("Login is done succesfully");
	}
	
	
	}


