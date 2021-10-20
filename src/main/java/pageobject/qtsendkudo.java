package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.base;

public class qtsendkudo extends base {
	public WebDriver driver;
	
	public qtsendkudo(WebDriver driver) {
		this.driver=driver;
	}
	By sendkudobutton=By.xpath("//body/nav[1]/div[1]/div[1]/div[2]/a[1]");
	By nameoremail=By.xpath("//input[@id='email_address']");
	By kudo1=By.xpath("//body/div[@id='myModal']/div[1]/div[1]/form[1]/div[2]/div[3]/div[1]/div[1]/div[1]");
	By comments=By.xpath("//textarea[@id='comment']");
	By cancelbutton=By.xpath("//button[contains(text(),'Cancel')]");
	By send=By.xpath("//button[contains(text(),'Send')]");
	By comment=By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/h5[1]/b[2]");
	By nocomment=By.xpath("//center[contains(text(),'Please enter any comment.')]");
	//By resendbtn=By.xpath("//body/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/h5[1]/small[1]/a[1]/i[1]");
	


public WebElement sendkudobutttn()
{
	return driver.findElement(sendkudobutton);
}
public WebElement enteremail()
{
	return driver.findElement(nameoremail);
}
public WebElement clickkudo1()
{
	return driver.findElement(kudo1);
}

public WebElement comment()
{
	return driver.findElement(comments);
}
public WebElement cancel()
{
	return driver.findElement(cancelbutton);
}
public WebElement send()
{
	return driver.findElement(send);
}
public WebElement commented()
{
	return driver.findElement(comment);
}
public WebElement nocomment()
{
	return driver.findElement(nocomment);
}
/*public WebElement resendbtn()
{
	return driver.findElement(resendbtn);
}*/
}

