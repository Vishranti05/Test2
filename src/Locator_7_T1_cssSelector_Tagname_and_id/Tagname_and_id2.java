package Locator_7_T1_cssSelector_Tagname_and_id;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Tagname_and_id2
{
	//Tagname And ID-2
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions Co=new ChromeOptions();
		Co.addArguments( "--remote-allow-Origin","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver(Co);
		
		//Enter URL/open an Application
		driver.get( "https://www.dishtv.in/pages/sociallogin.aspx");
		
		//wait
		Thread.sleep(2000);
		//Enter UN
		//driver.findElement(By.cssSelector( "input#ucHeader_ucLogin_txtVCNumber")).sendKeys( "7890");
		
		//Enter UN
		driver.findElement(By.cssSelector( "#ucHeader_ucLogin_txtVCNumber")).sendKeys( "7890");
				
		
		
		
	}

}
