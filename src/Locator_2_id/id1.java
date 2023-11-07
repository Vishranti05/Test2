package Locator_2_id;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class id1 
{
	//Locator:-Id
	public static void main(String[] args) throws InterruptedException 
	{		
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
		 		 
		//To enter URL/Open an Application	
		 driver.get("https://www.facebook.com/");
		 
		 //Wait
		 Thread.sleep(2000);
		 
		 //Enter UN
		 driver.findElement(By.id("email")).sendKeys( "abcd@gmail.com"); 	 
	}


} 
