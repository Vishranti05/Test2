package Launch_Browser2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test5 
{
	public static void main(String[] args)
	{
		//Open browser
		ChromeOptions Co=new ChromeOptions();
		Co.addArguments("remote-allows-origin","ignore-erros");
		
		WebDriver driver=new ChromeDriver();
		
		//To enter URL
		driver.get("https://mail.google.com/");
		
		//To close current tab
		driver.close();
				
		
	}

}
