package qtrecongition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pageobject.qtverification_login;
import resources.base;

public class qt1_1_1 extends base {
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void qtframework() throws IOException
	{
		driver=initalizeDriver();//invokes the browser
		driver.get(prop.getProperty("url"));//enters the qt url
		log.info("driver initialized");
		
		qtverification_login qv=new qtverification_login (driver);
	    qv.username().sendKeys("amulya.pujar@qualitestgroup.com");//user name and password for the url
	    qv.password().sendKeys("P@ssw0rd");
	    qv.login().click();//clicks on login button
	    qv.title();//displays the title qt reconginition
	    
	}
	
	
}


