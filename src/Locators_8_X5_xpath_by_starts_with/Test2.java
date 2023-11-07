package Locators_8_X5_xpath_by_starts_with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test2
{
	//Xpath by starts-with-I
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions  Co=new ChromeOptions();
		Co.addArguments("--remote-arguments-origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver();
		
		//To enter URL
		driver.get("https://kite.zerodha.com/");
		
		//wait
		Thread.sleep(2000);
		 
		//Click Forgot user ID or password Link //tagname[starts-with(@attribute name,’attribute value’)]
		driver.findElement(By.xpath("//a[starts-with(@class,'text-light forgot-link')]")).click();

		
	}
}
