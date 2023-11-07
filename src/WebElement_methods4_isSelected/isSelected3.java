package WebElement_methods4_isSelected;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class isSelected3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions Co=new ChromeOptions();
		Co.addArguments( "--remote-allow-Origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver(Co);
		
		//Enter URL
		driver.get("https://zoom.us/signin#/login");
		
		//Wait
		Thread.sleep(2000);
		
		//to check checkbox is selected or not
		WebElement Checkbox=driver.findElement( By.xpath( "//i[@class='zm-checkbox__knob']"));
		
		
		boolean c1 =Checkbox.isSelected();
		System.out.println(c1);
	}


}
