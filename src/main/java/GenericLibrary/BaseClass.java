package GenericLibrary;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import ObjectRepoORPOMClass.HomePage;
import ObjectRepoORPOMClass.LoginPage;

public class BaseClass 
{
  public static WebDriver driver = null;
  PropertiesUtilities PUTIL = new PropertiesUtilities();
  
  @BeforeSuite (alwaysRun = true)
  public void createDbConnection()
  {
	  System.out.println("Db Connection successfull!!");
  }
  
  @BeforeClass (alwaysRun = true)
  public void launchBrowser() throws Exception
  {
	String URL = PUTIL.readDataFromProperties("url");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get(URL);
	System.out.println("Launching browser done!!");
  }
  
  @BeforeMethod (alwaysRun = true)
  public void loginOperation() throws Exception
  {
	  String USERNAME = PUTIL.readDataFromProperties ("username");
	  String PASSWORD = PUTIL.readDataFromProperties ("password");
	  LoginPage lp = new LoginPage(driver);
	  lp.loginToApplication(USERNAME, PASSWORD);
	  System.out.println("login successful!!");  
	  
  }
  
  @AfterSuite (alwaysRun = true)
  public void SignOutButton()
  {
	  HomePage hp = new HomePage(driver);
	  hp.logoutOperation(driver);
	  System.out.println("logout successful!!");
  }
  
  @AfterClass (alwaysRun = true)
  public void closeBrowser()
  {
	  driver.quit();
	  System.out.println("browser closed successfully!!");
  }
  
  @AfterMethod (alwaysRun = true)
  public void closeDbCOnnection()
  {
	  System.out.println("db connection closed successfully !!");
  }
}
