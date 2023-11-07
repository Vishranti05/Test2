package WebeEement_methods1_sendKeys_clear_click;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class W1_sendKeys1
{
	//Approch -I
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions Co=new ChromeOptions();
		Co.addArguments( "--remote-allow-Origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver(Co);
		
		//Enter URL
		driver.get("https://www.facebook.com/");
		
		//Wait
		Thread.sleep(2000);
		
		//Enter Username
		driver.findElement(By.xpath( "//input[@type='text']")).sendKeys( "abc2345@gmail.com");
		
		//Wait
		Thread.sleep(2000);
		
		//Clear Username
		driver.findElement(By.xpath( "//input[@type='text']")).clear();
		
		//Wait
		Thread.sleep(2000);
		
		//Enter UN again
		driver.findElement( By.xpath( "//input[@type='text']")).sendKeys( "abcd2345@gmail.com");
		
		
		
		
		
	}
   
}
