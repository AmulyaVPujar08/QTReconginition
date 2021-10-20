package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class base {
	public WebDriver driver;
	public Properties prop;
	

	//public static void main(String[] args) {
		
		
		public WebDriver initalizeDriver() throws IOException 
		{
			 prop= new Properties();
			FileInputStream fis= new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\qtrecongition\\src\\main\\java\\resources\\data.properties");
			prop.load(fis);
			String browserName= prop.getProperty("browser");
			if(browserName.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Documents\\qt\\chromedriver.exe");
				 driver = new ChromeDriver();	
			}
			return driver;
		}
		

	}
