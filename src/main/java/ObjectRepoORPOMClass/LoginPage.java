package ObjectRepoORPOMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a login page POM class
 * 
 */
public class LoginPage 
{
   @FindBy(xpath= "//input[@name='user_name']")
   private WebElement usernameTextfield;
   
   @FindBy(xpath = "//input[@name='user_password']")
   private WebElement passwordTextfield;
   
   @FindBy(xpath = "//input[@id='submitButton']")
   private WebElement loginButton;
   
   public LoginPage(WebDriver driver)    //This is a constructor with parameterized
   {
	   PageFactory.initElements(driver, this);
   }

public WebElement getUsernameTextfield()  //this is getters and setters
{
	return usernameTextfield;
}

public WebElement getPasswordTextfield() //this is getters and setters
{
	return passwordTextfield;
}

public WebElement getLoginButton() //this is getters and setters
{
	return loginButton;
}
  /**
   * This is a business library to perform login operation to application 
   * @param username
   * @param password
   */
   public void loginToApplication(String username, String password)
   {
	   getUsernameTextfield().sendKeys(username);
	   getPasswordTextfield().sendKeys(password);
	   getLoginButton().click();
   }
   
}
