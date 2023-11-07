package WebDriver_methods1_get_close_quit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class W3_quit1
{
	//get() & quit() method
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions Co=new ChromeOptions();
		Co.addArguments("--remote-allows-origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver(Co);
		//To enter URL or to open application
		driver.get("https://www.zomato.com/india");
		
		//wait
		Thread.sleep(2000);
		
		//To close all the tabs/close the browser
	    driver.quit();
	}
		

}
