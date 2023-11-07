package Locator_6_partialLinkText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class partial_LinkText2 
{
	public static void main(String[] args) throws InterruptedException 
	{		
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
		 		 
		//To enter URL/Open an Application	
		 driver.get("https://www.instagram.com/accounts/login/");
		 
		 //Wait
		 Thread.sleep(2000);
		 
		 //click on forgot PSW link
		 driver.findElement(By.partialLinkText( "Forgot")).click();
		 
	}



}
