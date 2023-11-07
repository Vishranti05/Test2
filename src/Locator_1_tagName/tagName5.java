package Locator_1_tagName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class tagName5 
{
	public static void main(String[] args) throws InterruptedException 
	{		
		 ChromeOptions CO=new ChromeOptions();	
	 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
		 		 
		//To enter URL/Open an Application	
		 driver.get("https://www.swiggy.com/restaurants/login-besant-nagar-adyar-chennai-8308");
		 
		 //Wait
		 Thread.sleep(2000);
		 
		 //Click Login Button
		 driver.findElement( By.tagName( "span")).click();
		 
	}



}
