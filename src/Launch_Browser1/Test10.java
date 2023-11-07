package Launch_Browser1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","D:\\IMPORTANT\\SOFTWARE SETUP\\SELENIUM\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//To enter URL
		driver.get("https://www.google.co.in/maps");
		//To close current tab
		driver.close();
		
	}

}
