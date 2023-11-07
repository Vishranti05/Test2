package WebDriver_methods4_maximize_minimize;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test5
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions  Co=new ChromeOptions();
		Co.addArguments("--remote-arguments-origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver();
		
		//To enter URL
		driver.get("https://www.wikipedia.org/");
		
		//wait
		Thread.sleep(2000);
		
		//Maximize browser
		driver.manage().window().maximize();
		
		//wait
		Thread.sleep(2000);
		
		//To minimize browser
		driver.manage().window().minimize();
	}
		

}
