package Locator_7_T3_cssSelector_Tagname_and_attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Tagname_and_attribute1
{
	//Tagname and Attribute
	public static void main(String[] args) throws InterruptedException 
	{	
		ChromeOptions Co=new ChromeOptions();
		Co.addArguments( "--remote-allows-Origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver(Co);
		
	    //Enter URL
		driver.get( "https://www.instagram.com/accounts/login/");
		
		//wait
		Thread.sleep( 2000);
		
		//Enter UN
		//driver.findElement( By.cssSelector( "input[aria-required=true]")).sendKeys( "Abcd_23");
		
		driver.findElement( By.cssSelector( "[aria-required=true]")).sendKeys( "Abcd_23");
		
		
		
		
		
		
		
		
	}
}
