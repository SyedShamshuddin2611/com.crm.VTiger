package GenericLibrary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

public class ListenersImplementationClass implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
	  String methodName = result.getMethod().getMethodName();
	  Reporter.log("this" + methodName + "test case execution starts !!");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
	  String methodName = result.getMethod().getMethodName();
	  Reporter.log("this" + methodName + "test case executed successfully !!!");

	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
	  String methodName = result.getMethod().getMethodName();
	  TakesScreenshot ts = (TakesScreenshot) BaseClass.driver;
	  File src = ts.getScreenshotAs(OutputType.FILE);
	  File dest = new File(".\\ScreenshotFolder\\" + methodName + ".png");
	  try 
	  {
		Files.copy(src, dest);
	  } 
	  catch (IOException e) 
	  {
	  }
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		String methodName = result.getMethod().getMethodName();
		 Reporter.log("this" + methodName + "test case skipped !!!");
	}
	
	

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}
   
}
