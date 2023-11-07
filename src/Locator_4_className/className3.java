package Locator_4_className;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class className3
{
	//Classname:Duplicate address of two element
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
		 driver.findElement(By.className("login_txt_input")).sendKeys("1234");
		 
		 //wait
		 Thread.sleep(2000);
		 
		 //Enter PSW
		 
		 driver.findElement(By.className("login_txt_input")).sendKeys("0011");
		 
		 
	}


}
