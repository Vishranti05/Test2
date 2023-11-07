package Locators_8_X31_xpath_by_contains_by_text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions  Co=new ChromeOptions();
		Co.addArguments("--remote-arguments-origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver();
		
		//To enter URL
		driver.get("https://zoom.us/signin#/login");
		
		//maximize
		driver.manage().window().maximize();
		
		//wait
		Thread.sleep( 2000);
		
		//Enter UN
		driver.findElement( By.xpath( "//span[contains(text(),' Sign Up ')]")).click();
		
	}

}
