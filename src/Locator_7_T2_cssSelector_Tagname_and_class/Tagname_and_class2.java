package Locator_7_T2_cssSelector_Tagname_and_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Tagname_and_class2 
{
	public static void main(String[] args) throws InterruptedException 
	{	
		ChromeOptions Co=new ChromeOptions();
		Co.addArguments( "--remote-allows-Origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver(Co);
		
	    //Enter URL
		driver.get( "https://login.yahoo.com/?.intl=in");
		
		//wait
		Thread.sleep( 2000);
		
		//Click on Next button
		//driver.findElement( By.cssSelector( "input.pure-button ")).click();
		
		driver.findElement( By.cssSelector( ".pure-button ")).click();
		
		
		
		}


}
