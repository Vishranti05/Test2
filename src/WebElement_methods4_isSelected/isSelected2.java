package WebElement_methods4_isSelected;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class isSelected2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions Co=new ChromeOptions();
		Co.addArguments( "--remote-allow-Origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver(Co);
		
		//Enter URL
		driver.get("https://login.yahoo.com/?.intl=in");
		
		//Wait
		Thread.sleep(2000);
		
		//to check checkbox is selected or not
		WebElement CheckBox=driver.findElement( By.xpath( "//label[@for='persistent']"));
		boolean B1 =CheckBox.isSelected();
		System.out.println(B1);
	}

}
