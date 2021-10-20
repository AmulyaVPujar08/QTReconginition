package pageobject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class qtothers {
	public WebDriver driver;
	
	public qtothers(WebDriver driver) {
		this.driver=driver;
	}


	By kudofromme = By.xpath("//span[contains(text(),'Kudos from me')]");
	By kudotome = By.xpath("//span[contains(text(),'Kudos to me')]");
	By kudocount= By.xpath("//h5[@id='todayCount']");
	By sendkudobutton=By.xpath("//body/nav[1]/div[1]/div[1]/div[2]/a[1]");
	By nameoremail=By.xpath("//input[@id='email_address']");
	By kudo1=By.xpath("//body/div[@id='myModal']/div[1]/div[1]/form[1]/div[2]/div[3]/div[1]/div[1]/div[1]");
	By comments=By.xpath("//textarea[@id='comment']");
	By sendbutton=By.xpath("//button[contains(text(),'Send')]");
	By kudocount1=By.xpath("//h5[@id='todayCount']");
	By activity=By.xpath("//span[contains(text(),'Activity')]");
	By cancelbutton=By.xpath("//button[contains(text(),'Cancel')]");
	By kudocnt2=By.xpath("//h5[@id='todayCount']");
	By formname = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/h5[1]/b[1]");
	By toname = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/h5[1]/b[2]");

public WebElement kudofromme1() {
	return driver.findElement(kudofromme);
}

public WebElement kudotome1() {
	return driver.findElement(kudotome);
}
public WebElement activity()
{
	return driver.findElement(activity);
}
public  WebElement Kudocount1()
{
	return driver.findElement(kudocount1);
}

public WebElement sendk()
{
	return driver.findElement(sendkudobutton);
}

public WebElement enteremail()
{
	return driver.findElement(nameoremail);
}

public WebElement click1()
{
	return driver.findElement(kudo1);
}

public WebElement comm()
{
	return driver.findElement(comments);
}
public WebElement send()
{
	return driver.findElement(sendbutton);
}
public WebElement Kudocounnt2()
{
	return driver.findElement(kudocnt2);
}

public WebElement cancl()
{
	return driver.findElement(cancelbutton);
}
public WebElement toname()
{
	return driver.findElement(toname);
}
public WebElement fromname()
{
	return driver.findElement(formname);
}
}
