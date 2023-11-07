package Locator_7_T2_cssSelector_Tagname_and_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Tagname_and_class1 
{
	public static void main(String[] args) throws InterruptedException 
	{	
		ChromeOptions Co=new ChromeOptions();
		Co.addArguments( "--remote-allows-Origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver(Co);
		
	    //Enter URL
		driver.get( "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//wait
		Thread.sleep( 2000);
		
		//Enter UN
		//driver.findElement( By.cssSelector( "input.oxd-input")).sendKeys( "Asmita@23");
		
		driver.findElement( By.cssSelector( ".oxd-input")).sendKeys( "Asmita@23");
		
		
		
		}

}
