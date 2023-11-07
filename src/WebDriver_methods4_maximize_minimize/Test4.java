package WebDriver_methods4_maximize_minimize;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test4
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions  Co=new ChromeOptions();
		Co.addArguments("--remote-arguments-origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver();
		
		//To enter URL
		driver.get("https://www.dishtv.in/pages/login.aspx");
		
		//wait
		Thread.sleep(2000);
		
		//To maximize
		driver.manage().window().maximize();
		
		//wait
		Thread.sleep(2000);
		
		//To minimize Browser
		driver.manage().window().minimize();
		
		
		
	}


}
