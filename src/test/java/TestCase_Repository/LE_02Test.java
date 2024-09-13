package TestCase_Repository;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import GenericLibrary.ExcelUtility;
import ObjectRepoORPOMClass.CreateNewLeadsPage;
import ObjectRepoORPOMClass.HomePage;
import ObjectRepoORPOMClass.LeadsPage;

public class LE_02Test extends BaseClass
{
 @Test
 
 public void le_02Tc() throws Exception
 {
	 ExcelUtility EUTIL = new ExcelUtility();
	 String fname = EUTIL.readDataFromExcel ("Leads", 4, 1);
	 String lname = EUTIL.readDataFromExcel ("Leads", 4, 2);
	 String company = EUTIL.readDataFromExcel ("Leads", 4, 3);
	 String title = EUTIL.readDataFromExcel ("Leads", 4, 4);
	 String phone = EUTIL.readDataFromExcel ("Leads", 4, 5);
	 String mobile = EUTIL.readDataFromExcel ("Leads", 4, 6);
	 String email = EUTIL.readDataFromExcel ("Leads", 4, 7);
	 String noOfEmployees = EUTIL.readDataFromExcel ("Leads", 4, 8);
	 String street = EUTIL.readDataFromExcel ("Leads", 4, 9);
	 String poBox = EUTIL.readDataFromExcel ("Leads", 4, 10);
	 String postalCode = EUTIL.readDataFromExcel ("Leads", 4, 11);
	 String city= EUTIL.readDataFromExcel("Leads", 4, 12);
	 String country = EUTIL.readDataFromExcel("Leads", 4, 13);
//	 String state = EUTIL.readDataFromExcel("Leads", 4, 14);
	 
	 HomePage hp=new HomePage(driver);
	 hp.getLeadsModule();

	 
////     HomePage hp = new HomePage(driver);
////     hp.getLeadsModule();
//	 Thread.sleep(6000);
//	 driver.findElement(By.xpath("//a[text()='Leads']"));
     
     LeadsPage lp = new LeadsPage(driver);
     lp.clickOnCreateLeadButton();
     
     CreateNewLeadsPage clp = new CreateNewLeadsPage (driver);
     clp.createLead(fname, lname, company,title, phone, mobile, email, noOfEmployees, street, poBox, postalCode, city, country);
     System.out.println("le_02 execution successful!!!");
 }
}
