package Locators_8_X3_xpath_by_contains_by_Attributes;

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
		driver.get("https://www.linkedin.com/signup");
		
		//wait
		Thread.sleep(2000);
		
		 //Click on Agree and join
		 driver.findElement(By.xpath(" //button[contains(@type,'submit')]")).click();
		 
	}

		


}
