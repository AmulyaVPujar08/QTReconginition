package qtrecongition;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pageobject.qtothers;
import pageobject.qtverification_login;
import resources.base;

public class qt1_6 extends base{
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void login3() throws IOException
	{
			driver = initalizeDriver();
			driver.get(prop.getProperty("url"));
			
		qtverification_login qt=new qtverification_login (driver);
		    qt.username().sendKeys("amulya.pujar@qualitestgroup.com");
		    qt.password().sendKeys("P@ssw0rd");
		    qt.login().click();
}

@Test

	public void qtothers1() throws InterruptedException { //kudosfromme
	qtothers qo= new qtothers(driver);
	qo.kudofromme1().click();
	Thread.sleep(2000);
	Assert.assertTrue(qo.kudofromme1().isDisplayed());
	//System.out.println("qo.kudofromme()");
}

@Test

public void qtothers2() throws InterruptedException {
qtothers qo1= new qtothers(driver);//kudostome
qo1.kudotome1().click();
Thread.sleep(2000);
Assert.assertTrue(qo1.kudotome1().isDisplayed());
}


@Test
public void activity () throws InterruptedException
{
	 qtothers a=new  qtothers(driver);
	 Thread.sleep(4000);
	 a.activity().click();
     String a1=a.Kudocount1().getText();
     System.out.println(a1);
	    Thread.sleep(2000);
	    a.sendk().click();
	    Thread.sleep(2000);
		a.enteremail().sendKeys("Archana Praveen  (archana.praveen@qualitestgroup.com)" + Keys.DOWN);
		a.click1().click();
		a.comm().sendKeys("goood" );
		a.send().click();
		Thread.sleep(2000);
		a.cancl().click();
		Thread.sleep(2000);
	    a.kudotome1().click();
	    a.kudofromme1().click();
	    a.activity().click();
	    Thread.sleep(2000);
	   driver.navigate().refresh();
	   a.activity().click();
	   String a2=a.Kudocount1().getText();
	   System.out.println(a2);
}


}