package MyTest;

import org.testng.annotations.Test;

public class Guru_Test extends Base_Test {
	//murthy //Kannaiah
	@Test
	void login() 
	{
		LP.login_Details(props.getProperty("ID"),props.getProperty("PW"));
		LP.Click();
	}	
	
	@Test (priority=1)
	void newCustomer() 
	{
		HP.selectNewCustomer();
		NC.customerName(props.getProperty("CustName"),props.getProperty("DOB"),props.getProperty("ADR"),props.getProperty("CT"),
				        props.getProperty("ST"),props.getProperty("PIN"));
	}
	
	@Test (priority=2)
	void editCustomer() 
	{
		HP.selectEditCustomerPage();
	}
	

}
