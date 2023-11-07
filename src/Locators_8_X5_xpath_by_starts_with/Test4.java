package Locators_8_X5_xpath_by_starts_with;

import org.openqa.selenium.By;
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
		driver.get("https://in.linkedin.com/");
		
		
		//wait
		Thread.sleep( 2000);
		
		//Enter UN
		driver.findElement( By.xpath( "//button[starts-with(@data-id,'sign-in-form__submit')]")).click();
		
	}


}
