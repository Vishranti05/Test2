package Locators_8_X4_xpath_by_index;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test2 
{
	//4.Xpath by index-I
		public static void main(String[] args) throws InterruptedException
		{
			ChromeOptions  Co=new ChromeOptions();
			Co.addArguments("--remote-arguments-origins=*","ignore-certificate-errors");
			
			WebDriver driver=new ChromeDriver();
			
			//To enter URL
			driver.get("https://www.facebook.com/");
			
			//wait
			Thread.sleep(2000);
			
			 //Click Create new Account Button
			 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
			 
			 //Wait
			 Thread.sleep(2000);

			
		// //Enter Surname
		driver.findElement(By.xpath( "(//input[@type='text'])[4]")).sendKeys( "abcd@gmail.com");
		}


}
