package Launch_Browser2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test9 
{
	public static void main(String[] args) 
	{
		ChromeOptions Co=new ChromeOptions();
		Co.addArguments("--remote-allows-origins=*","ignore-certificate-errors");
		
		ChromeDriver driver=new ChromeDriver(Co);
		
		driver.get("https://www.icicibank.com/");
		
		driver.close();
		
		
	}

}
