package GenericLibrary;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * this is a generic java utility to keep all the java related generic function
 */
public class JavaUtility 
{
/**
 * This is a generic method to handle current calendar date
 * @param args
 */
	public String handlingCalendar(String customizeFormat)
	{
      Calendar cal = Calendar.getInstance();  //use getInstance method from java
      Date d = cal.getTime();      //getTime is also a method
      SimpleDateFormat sdf = new SimpleDateFormat(customizeFormat);
      String currentDate = sdf.format(d);
      return currentDate;
	}

    public long generateRandomNumbers (long range)
    {
    	Random r = new Random();
    	long num = r.nextLong(range);
    	return num;
    }
}