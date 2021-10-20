package qtrecongition;




import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.qtothers;
import pageobject.qtverification_login;
import resources.base;

public class qt1_6_2 extends base {


	public static Logger log = LogManager.getLogger(base.class.getName());

	
	
		//public static Logger log1 =LogManager.getLogger(base.class.getName());
		@BeforeTest
		public void login4() throws IOException
		{
			driver = initalizeDriver();
			driver.get(prop.getProperty("url"));
			
		qtverification_login qt=new qtverification_login (driver);
		    qt.username().sendKeys("amulya.pujar@qualitestgroup.com");
		    qt.password().sendKeys("P@ssw0rd");
		    qt.login().click();
		   
		}
		 
		

		



		@Test 
		public void kudohimself() throws InterruptedException
		{
			qtothers v=new  qtothers(driver);
			  v.sendk().click();
			    Thread.sleep(2000);
				v.enteremail().sendKeys(" Amulya V Pujar  (amulya.pujar@qualitestgroup.com)" + Keys.DOWN);
				v.click1().click();
				v.comm().sendKeys("goood" );
				v.send().click();
				Thread.sleep(2000);
				v.cancl().click();
				Thread.sleep(2000);
				String z1=v.fromname().getText();
				System.out.println(z1);
				Thread.sleep(2000);
				v.activity().click();
				Thread.sleep(2000);
				String z2=v.toname().getText();
				System.out.println(z2);
				Thread.sleep(4000);
			    Assert.assertEquals(z1, z2);
			   log.error("fail:user cannot be send kudo himself");
			   Thread.sleep(5000);
			   //driver.quit();
			    
		}
		
		
	}




}
