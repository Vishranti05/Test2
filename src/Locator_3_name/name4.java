package Locator_3_name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class name4 
{
	public static void main(String[] args) throws InterruptedException 
	{		
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
		 		 
		//To enter URL/Open an Application	
		 driver.get("https://www.dishtv.in/pages/login.aspx");
		 
		 //Wait
		 Thread.sleep(2000);
		 
		 //Enter PSW
		 driver.findElement(By.name( "ctl00$ucHeader$ucLogin$txtPassword")).sendKeys( "98709");
	}

}
