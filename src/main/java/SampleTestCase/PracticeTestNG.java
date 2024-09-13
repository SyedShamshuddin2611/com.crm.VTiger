package SampleTestCase;

import org.testng.annotations.Test;

public class PracticeTestNG 
{
	@Test (priority=1)
	public void createUser()
	{
		System.out.println("user created");
	}
    
	@Test (priority=-1)
	public void modifyUser()
	{
		System.out.println("user modified");
	}
	
	@Test (priority=-2)
	public void deleteUser()
	{
		System.out.println("user deleted");
	}
}
