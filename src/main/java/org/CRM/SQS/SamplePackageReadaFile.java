package org.CRM.SQS;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SamplePackageReadaFile 
{

	public static void main(String[] args) throws IOException 
	{
      FileInputStream fis = new FileInputStream("C:\\Selenium\\FrameworkCommonData.properties");
      Properties pobj = new Properties();
      pobj.load(fis);
      String URL = pobj.getProperty("url");
      String USERNAME = pobj.getProperty("username");
      String PASSWORD = pobj.getProperty("password");
      
      System.out.println(URL);
      System.out.println(USERNAME);
      System.out.println(PASSWORD);
      
	}

}
