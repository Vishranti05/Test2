package WebDriver_methods2_navigate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class navigate1 
{
	//navigate method

	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions Co=new ChromeOptions();
		Co.addArguments("--remote-allows-origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver(Co);
		
		//To enter URL/open an application
		driver.navigate().to("https://www.zomato.com/india");
		
		//wait
		Thread.sleep(2000);
		
		//To enter URL/open an application
		driver.navigate().to("https://www.swiggy.com/");
		
		//wait
		Thread.sleep(2000);
		
		//To move Backward
		driver.navigate().back();
		
		//wait
		Thread.sleep(2000);
		
		//To move forward
		driver.navigate().forward();
		
		//Wait
		Thread.sleep(2000);
		
		//To refresh current tab
		driver.navigate().refresh();
		
	}

}
