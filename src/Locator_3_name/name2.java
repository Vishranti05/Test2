package Locator_3_name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class name2 
{
	public static void main(String[] args) throws InterruptedException 
	{		
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
		 		 
		//To enter URL/Open an Application	
		 driver.get("https://www.instagram.com/accounts/emailsignup/");
		 
		 //Wait
		 Thread.sleep(2000);
		 
		 //Enter UN
		 driver.findElement(By.name( "username")).sendKeys( "vish@1234");
	}


}
