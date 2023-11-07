package Locator_7_T4_cssSelector_Tagname_class_and_attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Tagname_class_and_attribute2 
{
	public static void main(String[] args) throws InterruptedException 
	{	
		ChromeOptions Co=new ChromeOptions();
		Co.addArguments( "--remote-allows-Origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver(Co);
		
	    //Enter URL
		driver.get( "https://kite.zerodha.com/");
		
		//wait
		Thread.sleep( 2000);
		
		//click on login
		driver.findElement( By.cssSelector( "button.button-orange[type=submit]")).click();
		
		}



}
