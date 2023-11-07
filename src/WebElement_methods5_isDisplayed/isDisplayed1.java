package WebElement_methods5_isDisplayed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class isDisplayed1 
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
		
		//Check FB logo is presesnt or not
		WebElement RadioButton=driver.findElement( By.xpath( "//img[@class='fb_logo _8ilh img']"));
		
		boolean S1=RadioButton.isDisplayed();
		System.out.println(S1);
		
		Thread.sleep(2000);
		driver.close();
	}  

}
