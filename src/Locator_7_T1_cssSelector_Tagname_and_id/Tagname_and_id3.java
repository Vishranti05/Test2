package Locator_7_T1_cssSelector_Tagname_and_id;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Tagname_and_id3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions Co=new ChromeOptions();
		Co.addArguments( "--remote-allow-Origin","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver(Co);
		
		//Enter URL/open an Application
		driver.get( "https://login.yahoo.com/?.intl=in");
		
		//wait
		Thread.sleep(2000);
		
		//Enter UN
		//driver.findElement( By.cssSelector( "input#login-username")).sendKeys( "Nita1234@yahoo.com");
		
		//OR
		driver.findElement( By.cssSelector( "#login-username")).sendKeys( "Gita1234@yahoo.com");
	}
}
