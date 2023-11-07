package Locator_7_T1_cssSelector_Tagname_and_id;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Tagname_and_id1
{
	//Tagname And ID-1
	public static void main(String[] args) throws InterruptedException 
	{	
		ChromeOptions Co=new ChromeOptions();
		Co.addArguments( "--remote-allows-Origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver(Co);
		
	    //Enter URL
		driver.get( "https://kite.zerodha.com/");
		
		//wait
		Thread.sleep( 2000);
		
		//Enter UN
		driver.findElement( By.cssSelector( "input#userid")).sendKeys( "PQR34");
		
		//driver.findElement( By.cssSelector( "#userid")).sendKeys( "PQR56");
		
		
		
		}

}
