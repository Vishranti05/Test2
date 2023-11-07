package Locator_4_className;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class className2
{
	//classname
	public static void main(String[] args) throws InterruptedException 
	{		
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
		 		 
		//To enter URL/Open an Application	
		 driver.get("https://www.dishtv.in/pages/login.aspx");
		 
		 //Wait
		 Thread.sleep(2000);
		 
		 //Enter UN
		 driver.findElement(By.className("login_txt_input")).sendKeys("123456789");
		 
		 
		 
	}


}
