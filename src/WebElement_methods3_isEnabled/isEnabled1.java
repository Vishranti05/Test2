package WebElement_methods3_isEnabled;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class isEnabled1 
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
		
		//Check button is enable or not
		WebElement Button=driver.findElement( By.xpath( " //button[@type='submit']"));
		
		boolean S1=Button.isEnabled();
		System.out.println(S1);
	
		Thread.sleep(2000);
		driver.close();
	}

}
