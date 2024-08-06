package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage extends BasePage  {
	
	WebDriver driver;
	
	public homePage(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
	}
	
	
	//locators
	
	By newCustomer = By.linkText("New Customer");
	By editCustomer = By.linkText("Edit Customer");
	
	//Methods & Actions
	
	public void selectNewCustomer () 
	{
	    Click(newCustomer);
	    Refresh();
	    Click(newCustomer);
	}
	
	public void selectEditCustomerPage() 
	{
		 Click(editCustomer);
		 Refresh();
		 Click(editCustomer);
	}
	

}
