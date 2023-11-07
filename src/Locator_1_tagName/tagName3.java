package Locator_1_tagName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class tagName3
{
	public static void main(String[] args) throws InterruptedException 
	{
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
		 
		 //Enter URL/open an app
		 driver.get("https://kite.zerodha.com/");
		 
		 //wait
		 Thread.sleep(2000);
		 
		 //Enter UN number
		 driver.findElement(By.tagName( "input")).sendKeys( "AD6789");
		 
		 
		
	}

}
