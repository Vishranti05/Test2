package Locators_8_X2_xpath_by_text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1
{
	//	Xpath by text-I
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions  Co=new ChromeOptions();
		Co.addArguments("--remote-arguments-origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver();
		
		//To enter URL
		driver.get("https://www.facebook.com/");
		
		//wait
		Thread.sleep(2000);
		
	//Click Forgotten Password link  //Tagname[text()=’text value’]
	driver.findElement(By.xpath( "//a[text()='Forgotten password?']")).click();
	}
}
