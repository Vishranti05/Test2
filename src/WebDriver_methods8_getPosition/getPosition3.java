package WebDriver_methods8_getPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class getPosition3 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions Co=new ChromeOptions();
		Co.addArguments("--remote-allow-Origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(Co);
		
		//Enter URL/open an app
		driver.get( "https://kite.zerodha.com/");
		//wait
		Thread.sleep( 2000);
		
		//Get position of browser
		Point P1=driver.manage().window().getPosition();
		System.out.println(P1);
		
	}


}
