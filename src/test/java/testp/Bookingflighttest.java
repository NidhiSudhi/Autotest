package testp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagep.Bookingflight;



public class Bookingflighttest {
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://marinersforex.com/Flights-Booking");
	}

	@Test
	public void test()
	{
		driver.manage().window().maximize();
		//driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		Bookingflight ob=new Bookingflight(driver);
		
		
		
		ob.setvalues("New Delhi, India ", "Chennai/Madras, India ");
		ob.dateselect();
		ob.select();
		ob.search();
		
		
	}

}
