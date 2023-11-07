package WebDriver_methods7_setPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class setPosition5 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions Co=new ChromeOptions();
		Co.addArguments( "--remote-allow-Origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver(Co);
		
		//Enter URL/open an app
		driver.get( "https://www.zomato.com/india");
		//wait
		Thread.sleep(2000);
		//set position of the browser
		Point P1=new Point(400,200);
		driver.manage().window().setPosition(P1);
		
	}

}
