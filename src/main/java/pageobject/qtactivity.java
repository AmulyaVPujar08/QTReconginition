package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import resources.base;

public  class qtactivity extends base
{
	
		public WebDriver driver;
		
		By nameleft = By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h5[1]");

		public qtactivity(WebDriver driver)
		{
			this.driver=driver;
		}
		public boolean returnNameLeft()
		{
			return driver.findElement(nameleft).isDisplayed();
		}
		public  void title()
		{
			System.out.println(driver.getTitle());
		}
		
	}