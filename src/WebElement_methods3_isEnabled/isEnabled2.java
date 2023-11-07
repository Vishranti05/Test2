package WebElement_methods3_isEnabled;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class isEnabled2
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions Co=new ChromeOptions();
		Co.addArguments( "--remote-allow-Origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver(Co);
		
		//Enter URL
		driver.get("https://login.yahoo.com/?.intl=in");
		
		//Wait
		Thread.sleep(2000);
		
		//check Enabled or not
		WebElement button=driver.findElement( By.xpath( "//input[@type='submit']"));
		boolean B1=button.isEnabled();
		System.out.println(B1);
		
	}

}
