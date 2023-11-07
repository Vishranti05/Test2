package Locators_8_X1_xpath_by_Attributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test2 
{
	//Xpath by attributes-II
	
		public static void main(String[] args) throws InterruptedException
		{
			ChromeOptions  Co=new ChromeOptions();
			Co.addArguments("--remote-arguments-origins=*","ignore-certificate-errors");
			
			WebDriver driver=new ChromeDriver();
			
			//To enter URL
			driver.get("https://kite.zerodha.com/");
			
			//wait
			Thread.sleep(2000);
			
		  //To enter Username    //tagname[@attribute name = 'attribute value']
	driver.findElement(By.xpath( "//input[@type='text']")).sendKeys("AB004");
		}
}
