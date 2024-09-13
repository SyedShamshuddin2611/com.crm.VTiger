package ObjectRepoORPOMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewLeadsPage 
{
  @FindBy(xpath = "//input[@name='firstname']")
  private WebElement fName;
  
  @FindBy(xpath ="//input[@name='lastname']")
  private WebElement lName;
  
  @FindBy(xpath = "//input[@name='company']")
  private WebElement company;
  
  @FindBy(xpath ="//input[@name='noofemployees']")
  private WebElement noofEmployees;
  
  @FindBy(xpath =" //input[@name='phone']")
  private WebElement phoneNo;
  
  @FindBy(xpath = "//input[@name='mobile']")
  private WebElement mobile;
  
  @FindBy(xpath ="//input[@name='email']")
  private WebElement email;
  
  @FindBy(xpath ="//textarea[@name='lane']")
  private WebElement street;
  
  @FindBy(xpath ="//input[@name='pobox']")
  private WebElement poBox;
  
  @FindBy(xpath ="//input[@name='city']")
  private WebElement city;
  
  @FindBy(xpath ="//input[@id='country']")
  private WebElement country;
  
  @FindBy(xpath ="//input[@title='Save [Alt+S]']")
  private WebElement saveButton;
  
  
  public CreateNewLeadsPage (WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }


public WebElement getfName() {
	return fName;
}


public WebElement getlName() {
	return lName;
}


public WebElement getCompany() {
	return company;
}


public WebElement getNoofEmployees() {
	return noofEmployees;
}


public WebElement getPhoneNo() {
	return phoneNo;
}


public WebElement getMobile() {
	return mobile;
}


public WebElement getEmail() {
	return email;
}


public WebElement getStreet() {
	return street;
}


public WebElement getPoBox() {
	return poBox;
}


public WebElement getCity() {
	return city;
}


public WebElement getCountry() {
	return country;
}


public WebElement getSaveButton() {
	return saveButton;
}
  
/**
 * This is a business library to create new lead
 * @param fName
 * @param lName
 * @param Company
 */
  public void createLead(String fName, String lName, String company)
  {
	  getfName().sendKeys(fName);
	  getlName().sendKeys(lName);
	  getCompany().sendKeys(company);
	  getSaveButton().click();
  }
  
  /**
   * This is a business library to create new lead
   * @param fName
   * @param lName
   * @param company
   * @param title
   * @param phone
   * @param mobile
   * @param email
   * @param noofEmployees
   * @param street
   * @param poBox
   * @param postalCode
   * @param city
   * @param country
   * @param state
   */
  public void createLead(String fName, String lName, String company, String phone, String mobile, 
		  String email, String noofEmployees, String street, String poBox, String postalCode, 
		  String city, String country, String saveButton)
  {
	  getfName().sendKeys(fName);
	  getlName().sendKeys(lName);
	  getCompany().sendKeys(company);
	 // getTitle().sendKeys(title);
	  getPhoneNo().sendKeys(phone);
	  getMobile().sendKeys(mobile);
	  getEmail().sendKeys(email);
	  getNoofEmployees().sendKeys(noofEmployees);
	  getStreet().sendKeys(street);
	  getPoBox().sendKeys(poBox);
	  getCity().sendKeys(city);
	  getCountry().sendKeys(country);
	 // getState().sendKeys(state);
	  getSaveButton().click();
	  	  
  }
  
}
