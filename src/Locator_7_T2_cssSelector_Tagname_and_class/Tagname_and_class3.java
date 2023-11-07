package Locator_7_T2_cssSelector_Tagname_and_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Tagname_and_class3
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions Co=new ChromeOptions();
		Co.addArguments( "--remote-allow-Origin","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver(Co);
		
		//Enter URL/open an Application
		driver.get( "https://zoom.us/signin#/login");
		
		//wait
		Thread.sleep(2000);
		
		//Enter UN
		//driver.findElement( By.cssSelector( "input.zm-input__inner")).sendKeys("vishranti678@yahoo.com");
		
		//OR
		
		//enter un
		driver.findElement( By.cssSelector( ".zm-input__inner")).sendKeys("vishranti678@yahoo.com");
	}
}
