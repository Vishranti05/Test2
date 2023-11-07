package Locator_7_T1_cssSelector_Tagname_and_id;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions Co=new ChromeOptions();
		Co.addArguments("--remote-allow-Origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(Co);

		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);

		//driver.findElement(By.cssSelector("[name=email]")).sendKeys("vishranti23");
		
		//Thread.sleep(2000);

		//driver.findElement(By.cssSelector("input[@type=password]")).sendKeys("sanvish0505");
		//Thread.sleep(2000);

		WebElement button=driver.findElement(By.partialLinkText("Log "));
		Thread.sleep(2000);
		
		boolean B1=button.isEnabled();
		System.out.println(B1);
		
		

	}
	

}
