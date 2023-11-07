package WebDriver_methods6_getsize;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class getSize2 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions  Co=new ChromeOptions();
		Co.addArguments("--remote-arguments-origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver();
		
		//To enter URL
		driver.get("https://www.facebook.com/");
		
		//wait
		Thread.sleep(2000);
		
		//get size of the browser
		Dimension S1=driver.manage().window().getSize();
		System.out.println(S1);
	}	

}
