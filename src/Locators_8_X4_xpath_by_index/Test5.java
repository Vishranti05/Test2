package Locators_8_X4_xpath_by_index;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test5 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions  Co=new ChromeOptions();
		Co.addArguments("--remote-arguments-origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver();
		
		//To enter URL
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		
		//wait
		Thread.sleep(2000);
		
		//Click Create new Account Button
		 driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys( "Ovi56");
		 
	}


}
