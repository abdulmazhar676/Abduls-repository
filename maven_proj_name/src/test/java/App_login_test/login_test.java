package App_login_test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import maven_proj_developer.App;

public class login_test {

	@Test

	public void login_test1()
	{

		App login = new App();

		AssertJUnit.assertEquals(0,login.userLogin("mazhar", "mazhar124"));

	}

	@Test
	public void login_test2()
	{

		App login = new App();

		AssertJUnit.assertEquals(0,login.userLogin("mazhar", "mazhar123"));	

	}
	
	@Test 
	public void login_test3() 
	{
		App login = new App();
		
		AssertJUnit.assertEquals(0,login.userLogin("mazhar", "0mazhar"));
	}

}
