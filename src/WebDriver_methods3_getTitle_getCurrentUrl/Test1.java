package WebDriver_methods3_getTitle_getCurrentUrl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions Co=new ChromeOptions();
		Co.addArguments("--remote-allows-origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver(Co);
		
		//To enter URL/open an application
		driver.navigate().to("https://www.zomato.com/india");
		
		//wait
		Thread.sleep(2000);
	
		//To get title
		String	S1=driver.getTitle();
		System.out.println(S1);
		
		//wait
		Thread.sleep(2000);
		
		//To get URL of current webpage
		String S2=driver.getCurrentUrl();
		System.out.println(S2);
				
		//To close current tab
		driver.close();
	}

}
