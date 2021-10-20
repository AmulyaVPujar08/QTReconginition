package qtrecongition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.qtkudosearch;
import pageobject.qtverification_login;
import resources.base;

public class qt1_4_1 extends base {
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void login2() throws IOException
	{
		driver = initalizeDriver();
		driver.get(prop.getProperty("url"));
			
		qtverification_login qt=new qtverification_login (driver);
		    qt.username().sendKeys("amulya.pujar@qualitestgroup.com");
		    qt.password().sendKeys("P@ssw0rd");
		    qt.login().click();
		 }

	@Test
	
public void qtkudos() {
	qtkudosearch qs =new qtkudosearch(driver);
	 Assert.assertTrue(qs.searchkudo().isDisplayed());//kudosearch button is seen
	 log.info("user finds the kudo option");


}
	@Test
	   public void qtkudos1() throws InterruptedException
	   {
		   qtkudosearch qs1= new qtkudosearch(driver);
		   Thread.sleep(3000);
		   qs1.searchkudo().click();//searchkudo button
		   Thread.sleep(3000);
		   qs1.searchoption().sendKeys("Archana Praveen"+ Keys.DOWN);//searches the entered name
		   Thread.sleep(3000);
		   qs1.searchbutton().click();//search button
		   Thread.sleep(3000);
		   //Assert.assertEquals(qs1.postsearch().getText(),"Archana Praveen");
		   
	   }
	
}
