package Locator_4_className;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class className4 
{
	public static void main(String[] args) throws InterruptedException 
	{		
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
		 		 
		//To enter URL/Open an Application	
		 driver.get("https://passport.alibaba.com/icbu_login.htm");
		 
		 //Wait
		 Thread.sleep(2000);
		 
		 //maximize
		 driver.manage().window().maximize();
		
		 //Wait
		 Thread.sleep(2000);
		 
		  //Enter UN
		 driver.findElement(By.className("fm-text")).sendKeys("abcd");
		 
		//Wait
		 Thread.sleep(2000);
		 
		 
		 //Enter PSW
		 driver.findElement(By.className("fm-text")).sendKeys("1234");
		 
		 
		 
		 
		 
	}

}
