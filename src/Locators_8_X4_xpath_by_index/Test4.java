package Locators_8_X4_xpath_by_index;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test4 
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
		
		//maximize
		driver.manage().window().maximize();
		
		 //Click Create new Account Button
		 driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys( "Ovi Jadhav");
		 
	}

}
