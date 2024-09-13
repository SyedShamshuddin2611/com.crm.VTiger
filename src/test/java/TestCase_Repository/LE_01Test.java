package TestCase_Repository;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import GenericLibrary.ExcelUtility;
import ObjectRepoORPOMClass.CreateNewLeadsPage;
import ObjectRepoORPOMClass.LeadsPage;

@Listeners (GenericLibrary.ListenersImplementationClass.class)
public class LE_01Test extends BaseClass
{
 @Test
 
 public void le_01Tc() throws Exception
 {
	 ExcelUtility EUTIL = new ExcelUtility();
	 String fname = EUTIL.readDataFromExcel ("Leads", 2, 1);
	 String lname = EUTIL.readDataFromExcel ("Leads", 2, 2);
	 String company = EUTIL.readDataFromExcel ("Leads", 2, 3);
	 
//     HomePage hp = new HomePage(driver);
//     hp.getLeadsModule();
	 Thread.sleep(6000);
//	 driver.findElement(By.xpath("//a[text()='Leads']"));
     
     LeadsPage lp = new LeadsPage(driver);
     lp.clickOnCreateLeadButton();
     
     CreateNewLeadsPage clp = new CreateNewLeadsPage (driver);
     clp.createLead(fname, lname, company);
     System.out.println("le_01 execution successful!!!");
 }
}
