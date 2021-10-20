package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.base;

public class qtverification_login extends base{
	
	public WebDriver driver;
	
	//xpath of username,password and loginbutton
	
	By username=By.xpath("//body/div[2]/form[1]/input[1]");
	By password=By.xpath("//body/div[2]/form[1]/input[2]");
	By login=By.xpath("//button[contains(text(),'Login')]");
	By upper = By.xpath("//body/div[1]");
	By lower = By.xpath("//body");
	By loginb=By.xpath("//button[contains(text(),'Login')]");
	public qtverification_login(WebDriver driver) {
		this.driver=driver;
	}
	
//1.1.1 verification and login
	
public WebElement username()
{
	return driver.findElement(username);
}
public WebElement password()
{
	return driver.findElement(password);
}
public WebElement login()
{
	return driver.findElement(login);
}
public WebElement upperb() 
{
	return driver.findElement(upper);
}

public WebElement lowb() 
{
	return driver.findElement(lower);
}

public WebElement lb() 
{
	return driver.findElement(loginb);
}
public void title() {
	System.out.println(driver.getTitle());
}

}
