package WebElement_methods4_isSelected;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class isSelected1 
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
		
		//click on create account button
		driver.findElement( By.xpath( "(//a[@role='button'])[2]")).click();
		
		//wait
		Thread.sleep( 2000);
		
		//check Radio button selected or not
		WebElement RadioButton =driver.findElement(By.xpath( "//label[text()='Female']"));
		
		RadioButton.click();
		
		boolean S1=RadioButton.isSelected();
		System.out.println(S1);
	}


}
