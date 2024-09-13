package GenericLibrary;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SeleniumUtility 
{
   public WebDriver driver = null;
   public Actions act = new Actions(driver);
/** 
 * this is a generic method to maximize window
 * @param args
 */

	public void maximizeWindow()
	{
     driver.manage().window().maximize();
	}
/**
 * this is a generic method for implicit wait
 */

	public void implicitWait(int seconds)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}
	/**
	 * --------------Actions class Method--------------------*/
	 
	 /**
	  * This is a generic method to move the cursor to an element
	  */

     public void moveCursorToAnElement(WebElement element)
     {
		 act.moveToElement(element).perform();
     }
     /**
      * This is a generic method to right click
      */
	 public void rightClick(WebElement element)
	 {
		 act.contextClick(element).perform();
	 }
	 /** this is a generic method for drag and drop
	  * 
	  */
     public void dragAndDropAnElement(WebElement src, WebElement target)
     {
    	 act.dragAndDrop(src, target).perform();
     }
     /**
      * This is a generic method to handle pointer
      */
     public void dragAndDropAPointer(WebElement src, int xOffset, int yOffset)
     {
    	 act.dragAndDropBy(src, xOffset, yOffset).perform();
     }
     /**
      * This is a generic method to click and hold an element
      */
      public void clickAndHoldAnElement(WebElement element)
      {
    	  act.clickAndHold(element).perform();
      }
      /**
       * this is a generic method to perform scroll down operation
       */
      public void scrollToaParticularElement(WebElement element)
      {
    	  act.scrollToElement(element).perform();
      }
      /**
       * This is a generic method to release an element
       */
      public void releaseAnElement(WebElement element)
      {
    	  act.release(element).perform();
      }
      /**
       * ----------------Alert Method----------------*/
      
      
       /**
        * this is a generic method to accept an alert
        */
       public void acceptAlert()
       {
    	   driver.switchTo().alert().accept();
       }
       /**
        * This is a generic method to dismiss the alert
        */
       public void cancelAlert()
       {
    	   driver.switchTo().alert().dismiss();
       }
       /**
        * this is a generic method to fetch alert message
        */
       public String readAlertMsg()
       {
    	   String msg = driver.switchTo().alert().getText();
    	   return msg;
       }
}



