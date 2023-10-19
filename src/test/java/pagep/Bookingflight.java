package pagep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Bookingflight {
	WebDriver driver;
	By leavfrm=By.xpath("//*[@id=\"country-select-demo\"]");
	By gngto=By.xpath("//*[@id=\"country-select-demo\"]");
	By calndr=By.xpath("//body/div[@id='root']/div[1]/div[2]/section[1]/div[1]/form[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/button[1]/*[1]");
	By arrow=By.xpath("//body/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/*[1]");
	By year=By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/div/div/div[125]/button");
	By nextmonth=By.xpath("//body/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/button[2]/*[1]");
	By date=By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/div[5]/div[3]/button");
	By trvl=By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[3]/ul/li/div");
	By adult=By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[3]/ul/li/ul/li[1]/div/div/div[3]/p");
	By child=By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[3]/ul/li/ul/li[3]/div/div/div[3]/p");
	By cls=By.xpath("//body/div[@id='root']/div[1]/div[2]/section[1]/div[1]/form[1]/div[2]/div[3]/ul[1]/li[1]/ul[1]/li[4]/div[1]/div[1]/fieldset[1]/div[1]/label[2]/span[1]/span[1]/input[1]");
	By done=By.xpath("//span[contains(text(),'Done')]");
	By search=By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[4]/input");

	public Bookingflight(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String leaving,String goingto)
	{
		driver.findElement(leavfrm).sendKeys(leaving);
		driver.findElement(gngto).sendKeys(goingto);
		
	}
	public void dateselect()
	{
		driver.findElement(calndr).click();
		driver.findElement(arrow).click();
		driver.findElement(year).click();
		driver.findElement(nextmonth).click();
		driver.findElement(date).click();
	}


	public void select()
	{
		driver.findElement(trvl).click();
		driver.findElement(adult).click();
		driver.findElement(child).click();
		driver.findElement(cls).click();
		driver.findElement(done).click();
		
	}
	public void search()
	{
		driver.findElement(search).click();
	}

}
