package WebElement_methods5_isDisplayed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class isDisplayed2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions Co=new ChromeOptions();
		Co.addArguments( "--remote-allow-Origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver(Co);
		
		//Enter URL
		driver.get("https://www.zomato.com/india");
		
		//Wait
		Thread.sleep(2000);
		
		//Check zomato logo is presesnt or not
		WebElement RadioButton=driver.findElement( By.xpath( "(//img[@alt='Zomato logo'])[1]"));
		
		boolean S1=RadioButton.isDisplayed();
		System.out.println(S1);
		
		Thread.sleep(2000);
		driver.close();
	}  


}
