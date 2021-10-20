package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.base;

public class qtkudosearch extends base {
	
public WebDriver driver;
public qtkudosearch(WebDriver driver) {
	this.driver=driver;
}
By searchkudo=By.xpath("//span[contains(text(),'Kudos Search')]");
By searchoption=By.xpath("//input[@id='s_e_add']");
By searchbutton=By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]");
By postsearch=By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/h5[1]/b[2]");

public WebElement searchkudo() {
	return driver.findElement(searchkudo);
}
public WebElement searchoption() {
	return driver.findElement(searchoption);
}
public WebElement searchbutton() {
	return driver.findElement(searchbutton);
}
public WebElement postsearch() {
	return driver.findElement(postsearch);
}
	
}