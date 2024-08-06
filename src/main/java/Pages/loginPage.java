package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage extends BasePage{

    WebDriver driver;
    
    public loginPage(WebDriver driver) 
    {
    	super(driver);
		this.driver = driver;
	}

	//locator
	
	By userName = By.name("uid");
	By passWord = By.name("password");
	By submit = By.name("btnLogin");
	
	//Methods & Actions
	
	public void login_Details(String Text1, String Text2) 
	{
		Sendkeys(userName, Text1);
		Sendkeys(passWord, Text2);
	}
	
	public void Click() 
	{
		Click(submit);
	}

}
