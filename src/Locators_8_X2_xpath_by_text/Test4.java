package Locators_8_X2_xpath_by_text;

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
		driver.get("https://in.linkedin.com/?original_referer=https%3A%2F%2Fwww.google.com%2F");
		
		//wait
		Thread.sleep(2000);
		
	//Click forgot password link
	driver.findElement(By.xpath( "//a[text()='Forgot password?']")).click();
	}

}
