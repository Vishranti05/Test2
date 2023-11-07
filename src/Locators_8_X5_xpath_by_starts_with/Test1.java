package Locators_8_X5_xpath_by_starts_with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1
{
	//starts-with
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions Co=new ChromeOptions();
		Co.addArguments("--remote-allow-Origins","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver();
		//Enter URL
		driver.get( "https://www.instagram.com/");
		
		//wait
		Thread.sleep(4000);
		
		//click on forgot password 
		driver.findElement(By.xpath("//a[starts-with(@role,'link')]")).click();
		
		
		
		
	}

}
