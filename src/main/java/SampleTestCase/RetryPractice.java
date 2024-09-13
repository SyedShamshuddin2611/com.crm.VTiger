package SampleTestCase;

import org.testng.Assert;
import org.testng.annotations.Test;


public class RetryPractice 
{
  @Test(retryAnalyzer = GenericLibrary.RetryAnalyzerImplementation.class)
  public void retryPractice()
  {
	  Assert.fail();
	  System.out.println("Hi");
  }
}
