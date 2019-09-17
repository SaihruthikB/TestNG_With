package TestNG.FinalCode_TestNG;

import org.testng.annotations.Test;

public class TestGroup {
	@Test(priority=6)
	public static void Logout()
	{
		System.out.println("user Logout is done succesfully");
	}
	
	@Test(priority=5)
	public static void PaceOrder()
	{
	System.out.println("OrderPlaed Successfully");
	}
	

}
