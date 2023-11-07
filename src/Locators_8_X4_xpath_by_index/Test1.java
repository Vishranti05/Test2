package Locators_8_X4_xpath_by_index;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1 
{
	//Xpath by contains-I
	//(A)Xpath by contains by using attributes
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions  Co=new ChromeOptions();
		Co.addArguments("--remote-arguments-origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver();
		
		//To enter URL
		driver.get("https://kite.zerodha.com/");
		
		//wait
		Thread.sleep(2000);
		
	//Click forgot UserID or Password link //tagname[contains(@attribute name,’attribute value’)]
	driver.findElement(By.xpath("//a[contains(@class,'text-light ')]")).click();
	}
}
