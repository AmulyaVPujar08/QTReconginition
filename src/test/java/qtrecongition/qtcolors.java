package qtrecongition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.qtverification_login;
import resources.base;

public class qtcolors extends base {
	public static Logger log = LogManager.getLogger(base.class.getName());

	
		@Test
		public void colors() throws IOException
		{
			
		
		driver=initalizeDriver();
		driver.get(prop.getProperty("url"));
		
		qtverification_login qt=new qtverification_login (driver);
		WebElement TB = qt.upperb();
		String G=TB.getCssValue("background-color");
	    String gold=Color.fromString(G).asHex();
	    Assert.assertEquals( "#fdcc16",gold);
	    System.out.println("gold"); 

		WebElement LB = qt.lowb();	
		String W=LB.getCssValue("background-color");
		 String White=Color.fromString(W).asHex();
		Assert.assertEquals( "#ffffff",White);
		System.out.println("White");
		 
		WebElement Log = qt.lb();
		String N=Log.getCssValue("background-color");
		 String Navy=Color.fromString(N).asHex();
		Assert.assertEquals("#2a2559",Navy);
		System.out.println("Navy");
		}
	}


