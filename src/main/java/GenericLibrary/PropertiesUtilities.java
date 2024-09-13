package GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtilities 
{

	public String readDataFromProperties (String data) throws IOException
	{
      FileInputStream fis = new FileInputStream(IconstantUtility.propertiesPath);
      Properties pobj = new Properties();
      pobj.load(fis);
      String value = pobj.getProperty(data);
      return value;
	}

}
