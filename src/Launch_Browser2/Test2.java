package Launch_Browser2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test2 
{
	public static void main(String[] args)
	{
		//open browser
		
		ChromeOptions Co=new ChromeOptions();
		Co.addArguments("--remote-allows-origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver();
		
		//To enter URL
		driver.get("https://www.facebook.com/login/");
		
		
		
	}

}
