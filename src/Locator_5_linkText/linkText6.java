package Locator_5_linkText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class linkText6 
{
	public static void main(String[] args) throws InterruptedException 
	{		
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
		 		 
		//To enter URL/Open an Application	
		 driver.get("https://login.yahoo.com/?.intl=in");
		 
		 //Wait
		 Thread.sleep(2000);
		 
		 //click on zoom privacy statement   
		 driver.findElement(By.linkText( "Forgotten username?")).click();
		 
	}


}
