package WebDriver_methods7_setPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class setPosition4
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions  Co=new ChromeOptions();
		Co.addArguments("--remote-arguments-origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver();
		
		//To enter URL
		driver.get("https://lk.bookmyshow.com/secure/user-login");
		
		//wait
		Thread.sleep(2000);
		
		//Set position of the browser
		Point P1=new Point(100,60);
		driver.manage().window().setPosition(P1);
	}
}
