package WebDriver_methods7_setPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class setPosition2 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions  Co=new ChromeOptions();
		Co.addArguments("--remote-arguments-origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver();
		
		//To enter URL
		driver.get("https://www.instagram.com/accounts/login/");
		
		//wait
		Thread.sleep(2000);
		
		//set size of the browser
		Point P1=new Point(400,300);
		driver.manage().window().setPosition(P1);
	}

}
