package MyTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import DriverDetails.drivers;
import Pages.homePage;
import Pages.loginPage;
import Pages.newCustomerPage;

public class Base_Test {
	
	WebDriver driver;
	loginPage LP;
	homePage  HP;
	newCustomerPage NC;
	Properties props;
	
	@BeforeTest
	void initDetails() throws IOException  
	{
		props = new Properties();
	    FileInputStream File = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\MurthyRLP\\src\\test\\resources\\config.properties");
		props.load(File);
        drivers.initDriver(props.getProperty("URL"));
        driver = drivers.getDriver();
        LP = new loginPage(driver);
        HP = new homePage(driver);
        NC = new newCustomerPage(driver);
	}
	
	@AfterTest
	void tearDown() 
	{
		drivers.Quitapp();
	}

}
