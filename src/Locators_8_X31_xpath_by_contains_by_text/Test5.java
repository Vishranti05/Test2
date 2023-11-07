package Locators_8_X31_xpath_by_contains_by_text;

import org.openqa.selenium.By;
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
		driver.get("https://www.facebook.com/");
		
		//wait
		Thread.sleep( 2000);
		
		//click on create new account button
		driver.findElement( By.xpath( "//a[contains(text(),'Forgotten password?')]")).click();
	
	}



}
