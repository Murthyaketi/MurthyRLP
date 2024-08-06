package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class newCustomerPage extends BasePage {

	WebDriver driver;
	
	public newCustomerPage(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
	}
	
	
	By customerName = By.name("name");
	By genderM = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]");
	By DOB = By.id("dob");
	By address = By.name("addr");
	By city = By.name("city");
	By state = By.name("state");
	By pinCode = By.name("pinno");
	
	
	//Methods
	
	public void customerName(String Text1,String Text2,String Text3,String Text4,String Text5,String Text6) 
	{
		Sendkeys(customerName, Text1);
		Click(genderM);
		Sendkeys(DOB, Text2);
		Sendkeys(address, Text3);
		Sendkeys(city, Text4);
		Sendkeys(state, Text5);
		Sendkeys(pinCode, Text6);
	}
}
