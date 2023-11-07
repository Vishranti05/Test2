package WebElement_methods2_getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class getText1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions Co=new ChromeOptions();
		Co.addArguments( "--remote-allow-Origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver(Co);
		
		//Enter URL
		driver.get("https://www.facebook.com/");
		
		//Wait
		Thread.sleep(2000);
		
		//get text
	WebElement text=driver.findElement(By.xpath( "//h2[text()='Facebook helps you connect and share with the people in your life.']"));
	
			String	S1=text.getText();
			System.out.println(S1);
			
			//wait
			Thread.sleep(2000);
			
			//close a current tab
			driver.close();
			
			
		
	}
}
