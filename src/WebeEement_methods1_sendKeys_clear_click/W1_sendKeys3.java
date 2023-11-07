package WebeEement_methods1_sendKeys_clear_click;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class W1_sendKeys3
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions Co=new ChromeOptions();
		Co.addArguments( "--remote-allow-Origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver(Co);
		
		//Enter URL
		driver.get("https://www.instagram.com/accounts/login/");
		
		//Wait
		Thread.sleep(2000);
		
		//Enter Username
	     WebElement  Username=driver.findElement( By.xpath("//input[@type='text']"));
	     
	     Username.sendKeys( "Ovi345");
	
	}
}
