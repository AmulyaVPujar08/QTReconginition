package qtrecongition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobject.qtsendkudo;
import pageobject.qtverification_login;
import resources.base;

public class qt1_3 extends base {
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void login1() throws IOException
	{
		driver =initalizeDriver();
		driver.get(prop.getProperty("url"));
			
		qtverification_login qt=new qtverification_login (driver);
		    qt.username().sendKeys("amulya.pujar@qualitestgroup.com");
		    qt.password().sendKeys("P@ssw0rd");
		    qt.login().click();
		 

	   
	}
	
	@Test
	public void qtsendkudo1() throws InterruptedException, IOException
	{
		
	qtsendkudo qsk=  new qtsendkudo(driver);
	//User should be able to send kudos form Activity page
	//Thread.sleep(2000);
	qsk.sendkudobutttn().click();//send kudo button
	Thread.sleep(1000);
	qsk.enteremail().sendKeys("Archana Praveen  (archana.praveen@qualitestgroup.com)"+Keys.DOWN);//email id entered
	Thread.sleep(2000);
	qsk.clickkudo1().click();//clicks on one of the kudo
	qsk.comment().sendKeys("hello");//enters comment
	Thread.sleep(2000);
	qsk.send().click();//kudo send button
	
}
	@Test
	
	public void resend() throws InterruptedException, IOException
	{
		//driver =initalizeDriver();
		qtsendkudo k= new qtsendkudo(driver);
		Thread.sleep(1000);
		//k.resendbtn().click();
		//Thread.sleep(1000);
		k.clickkudo1().click();
		Thread.sleep(1000);
		k.comment().sendKeys("congratulations");
		Thread.sleep(1000);
		k.send().click();
	}

	
	

}




