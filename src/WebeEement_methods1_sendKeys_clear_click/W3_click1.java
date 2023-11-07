package WebeEement_methods1_sendKeys_clear_click;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class W3_click1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions Co=new ChromeOptions();
		Co.addArguments( "--remote-allow-Origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver(Co);
		
		//Enter URL
		driver.get("https://www.facebook.com/");
		
		//Wait
		Thread.sleep(2000);
		
		//Click on create account button
		WebElement button=driver.findElement( By.xpath("//a[text()='Create new account']"));
		
		button.click();
	}

}
