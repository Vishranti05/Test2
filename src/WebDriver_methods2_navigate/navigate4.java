package WebDriver_methods2_navigate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class navigate4
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions Co=new ChromeOptions();
		Co.addArguments("--remote-allows-origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver(Co);
		
		//enter URL/open an app
		driver.navigate().to( "https://login.yahoo.com/?.intl=in");
		
		//wait
		Thread.sleep(2000);
		
		//Enter URL/open an app
		driver.navigate().to( "https://www.sky.com/");
		
		//Move Backward
		driver.navigate().back();
		
		//wait
		Thread.sleep(2000);
		
		//Move forward
		driver.navigate().forward();
		
		//wait
		Thread.sleep(2000);
		
		//to Refresh webpage
		driver.navigate().refresh();
		
		//close
		driver.close();
	}

}
