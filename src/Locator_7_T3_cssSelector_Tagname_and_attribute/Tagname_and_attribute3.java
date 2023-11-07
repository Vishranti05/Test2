package Locator_7_T3_cssSelector_Tagname_and_attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Tagname_and_attribute3 
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
		//driver.findElement( By.cssSelector( "input[type=email]")).sendKeys( "xyz21234");
		//OR
		//Enter UN
		driver.findElement( By.cssSelector( "[type=email]")).sendKeys( "xyz21234");
	}

}
