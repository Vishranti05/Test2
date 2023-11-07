package WebeEement_methods1_sendKeys_clear_click;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class w3_click2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions Co=new ChromeOptions();
		Co.addArguments( "--remote-allow-Origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver(Co);
		
		//Enter URL
		driver.get("https://kite.zerodha.com/");
		
		//Wait
		Thread.sleep(2000);
		
		//Click on forgot User Id and password
		WebElement Link=driver.findElement( By.xpath( "//a[text()='Forgot user ID or password?']"));
		
		Link.click();
	}
		

}
