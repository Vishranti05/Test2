package WebDriver_methods5_setSize;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class setSize3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-Origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver(co);
		 //Enter URL
		driver.get("https://www.wikipedia.org/");
		
		//wait
		Thread.sleep(2000);
		
		//setSize
		Dimension D1=new Dimension(200,300);
		
		driver.manage().window().setSize(D1);
		
		
	}	
		
		
		

}
