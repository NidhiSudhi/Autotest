package testp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagep.Saucedemopage;

public class Saucedemotest {
WebDriver driver;
@BeforeTest
public void set()
{
	driver=new ChromeDriver();
}
@BeforeMethod
public void url()
{
	driver.get("https://www.saucedemo.com/");
}
@Test
public void test()
{
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	Saucedemopage ob=new Saucedemopage(driver);
	ob.setvalues("standard_user", "secret_sauce");
	ob.log();
	ob.products();
	ob.values("Hari", "Kishan", "670702");
	ob.logout();
}

}
