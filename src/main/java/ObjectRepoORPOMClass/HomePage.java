package ObjectRepoORPOMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
  @FindBy(xpath = "//a[text()='Leads']")
  private WebElement leadsModule;
  
  @FindBy(xpath = "(//a[text()='Organizations'])[1]")
  private WebElement organizationsModule;
  
  @FindBy(xpath ="(//a[text()='Contacts'])[1]")
  private WebElement contactsModule;
  
  @FindBy(xpath = " //img[@src='themes/softed/images/user.PNG']")
  private WebElement administratorIcon;
  
  @FindBy(xpath ="//a[text()='Sign Out']")
  private WebElement signOutButton;
  
  public HomePage (WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }

public WebElement getLeadsModule() 
{
	return leadsModule;
}

public WebElement getOrganizationsModule() 
{
	return organizationsModule;
}

public WebElement getContactsModule() {
	return contactsModule;
}



public WebElement getAdministratorIcon() {
	return administratorIcon;
}



public WebElement getSignOutButton() {
	return signOutButton;
}

/**
 * This is business library to access home page
 */
  public void accessHomePageModules()
  {
	  getLeadsModule().click();
	  getOrganizationsModule().click();
	  getContactsModule().click();
	  getAdministratorIcon().click();
	  getSignOutButton().click();
	  
  }
  
  public void logoutOperation(WebDriver driver)
  {
	  Actions act = new Actions (driver);
	  act.moveToElement(signOutButton).perform();
	  signOutButton.click();
	  
  }
}
