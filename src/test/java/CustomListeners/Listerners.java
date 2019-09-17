package CustomListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listerners implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("captring screenshot"+result.getName());
		
	}

	public void onTestFailure(ITestResult result){
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log("<a href=\"E:\\TestNGPic\\errormessage.PNG\"target=\"_blank\">Screen shot Link</a>");
		Reporter.log("<br>");
		Reporter.log("<a href=\"E:\\TestNGPic\\errormessage.PNG\"target=\"_blank\"><imag height=600 width =800 src =\"E:\\TestNGPic\\errormessage.PNG\"></a>");
		System.out.println("captring screenshot on test failure"+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
}
