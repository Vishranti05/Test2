package WebDriver_methods7_setPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class setPosition1 
{
	//setPosition() method
			public static void main(String[] args) throws InterruptedException
			{
				ChromeOptions  Co=new ChromeOptions();
				Co.addArguments("--remote-arguments-origins=*","ignore-certificate-errors");
				
				WebDriver driver=new ChromeDriver();
				
				//To enter URL
				driver.get("https://www.firstcry.com/");
				
				//wait
				Thread.sleep(2000);
				
				//create object of Points class
				Point P1=new Point(100,200);
				//To change position of the browser
				driver.manage().window().setPosition(P1);
				
			}

}
