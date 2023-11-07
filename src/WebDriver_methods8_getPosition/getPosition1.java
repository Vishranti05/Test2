package WebDriver_methods8_getPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class getPosition1
{

	//getPosition()
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions  Co=new ChromeOptions();
		Co.addArguments("--remote-arguments-origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver();
		
		//To enter URL
		driver.get("https://www.skyscanner.co.in/");
		
		//wait
		Thread.sleep(2000);
		
		
		//To get position of the browser
		Point S2=driver.manage().window().getPosition();
		System.out.println(S2);
		
	}

}
