package qtrecongition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.qtactivity;
import pageobject.qtverification_login;
import resources.base;

public class qt1_2 extends base {
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void login() throws IOException
	{
			driver=initalizeDriver();
			driver.get(prop.getProperty("url"));
			
		    qtverification_login qt=new qtverification_login (driver);
		    qt.username().sendKeys("amulya.pujar@qualitestgroup.com");
		    qt.password().sendKeys("P@ssw0rd");
		    qt.login().click();
		 

	   
	}
		@Test
		public void qtactivity() 
		{
			qtactivity  qa=new qtactivity (driver);
		    System.out.println(qa.returnNameLeft());//user able to see the name in the leftside of the page
		    qa.title();
	    }
		
	}