package DriverDetails;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class drivers {
	
	static WebDriver driver;
	
	public static void initDriver(String URL) 
	{
		if(driver==null) 
		{
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   driver.get(URL);
		}
	}
	
	public static void Quitapp() 
	{
		if(driver!=null) 
		{
			driver.quit();
		}
	}
	
	public static WebDriver getDriver() 
	{
		return driver;
	}

}
