package WebDriver_methods1_get_close_quit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class W2_close3
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions Co=new ChromeOptions();
		Co.addArguments("--remote-allows-origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver(Co);
		//To enter URL or to open application
		driver.get("https://www.instagram.com/accounts/login/");
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
	}


}
