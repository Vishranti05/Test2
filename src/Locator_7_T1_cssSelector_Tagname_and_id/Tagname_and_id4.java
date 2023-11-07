package Locator_7_T1_cssSelector_Tagname_and_id;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Tagname_and_id4 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions Co=new ChromeOptions();
		Co.addArguments( "--remote-allow-Origin","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver(Co);
		
		//Enter URL/open an Application
		driver.get( "https://kite.zerodha.com/");
		
		//wait
		Thread.sleep(2000);
		
		//Enter PSw
		//driver.findElement(By.cssSelector( "input#password")).sendKeys( "768989");
		
		//or
		
		//enter PSW
		driver.findElement(By.cssSelector( "#password")).sendKeys( "768989");
	}
}
