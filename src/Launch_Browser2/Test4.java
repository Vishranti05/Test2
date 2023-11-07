package Launch_Browser2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test4
{
	public static void main(String[] args)
	{
		//To open Browser
		ChromeOptions Co=new ChromeOptions();
		Co.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver();
		
		//To enter URL
		driver.get("https://www.amazon.in/");
		
		//To close current tab
		driver.close();
		
	}

}
