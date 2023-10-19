package pagep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Saucedemopage {
WebDriver driver;
By susername=By.xpath("//*[@id=\"user-name\"]");
By spaswd=By.xpath("//*[@id=\"password\"]");
By login=By.xpath("//*[@id=\"login-button\"]");
By product1=By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
By product2=By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");
By product3=By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]");
By product4=By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']");
By product5=By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']");
By product6=By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']");

By cart=By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]");
By checkout=By.xpath("//button[@id='checkout']");
By fname=By.xpath("//input[@id='first-name']");
By lname=By.xpath("//input[@id='last-name']");
By pcode=By.xpath("//input[@id='postal-code']");
By cont=By.xpath("//input[@id='continue']");
By finish=By.xpath("//button[@id='finish']");
By backhome=By.xpath("//button[@id='back-to-products']");
By menu=By.xpath("//*[@id=\"react-burger-menu-btn\"]");
By logout=By.xpath("//a[@id='logout_sidebar_link']");

public Saucedemopage(WebDriver driver)
{
	this.driver=driver;
}
public void setvalues(String usrname,String pswd)
{
	driver.findElement(susername).sendKeys(usrname);
	driver.findElement(spaswd).sendKeys(pswd);

}
public void log()
{
	driver.findElement(login).click();
}
public void products()
{
	driver.findElement(product1).click();
	driver.findElement(product2).click();
	driver.findElement(product3).click();
	driver.findElement(product4).click();
	driver.findElement(product5).click();
	driver.findElement(product6).click();
	driver.findElement(cart).click();
	driver.findElement(checkout).click();
}
public void values(String fstname,String sndname,String postelcode)
{
	driver.findElement(fname).sendKeys(fstname);
	driver.findElement(lname).sendKeys(sndname);
	driver.findElement(pcode).sendKeys(postelcode);
}
public void logout()
{
	driver.findElement(cont).click();
	driver.findElement(finish).click();
	driver.findElement(backhome).click();
	driver.findElement(menu).click();
	driver.findElement(logout).click();
}

}
