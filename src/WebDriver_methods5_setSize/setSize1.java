package WebDriver_methods5_setSize;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class setSize1
{
	//setSize() method
		public static void main(String[] args) throws InterruptedException
		{
			ChromeOptions  Co=new ChromeOptions();
			Co.addArguments("--remote-arguments-origins=*","ignore-certificate-errors");
			
			WebDriver driver=new ChromeDriver();
			
			//To enter URL
			driver.get("https://www.nykaa.com/");
			
			//wait
			Thread.sleep(2000);
			
			//create object of Dimension class
			Dimension D1=new Dimension(400,700);
			//To set size of the browser
			driver.manage().window().setSize(D1);
			
		}

}
