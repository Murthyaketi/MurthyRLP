package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
	
	WebDriver driver;
	
	public BasePage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public void Sendkeys(By locator,String Text) 
	{
		driver.findElement(locator).sendKeys(Text);;
	}
	
	public void Click(By locator) 
	{
		driver.findElement(locator).click();
	}
	
	public void Refresh() 
	{
		driver.navigate().refresh();
	}
	
	public void alertAccept() 
	{
		driver.switchTo().alert().accept();
	}
	
	public void alertDismiss() 
	{
		driver.switchTo().alert().dismiss();
	}
	
	public void Defaultcontents() 
	{
		driver.switchTo().defaultContent();
	}
		

}
