package Launch_Browser1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9
{
	public static void main(String[] args) 
	{
		//Open browser
		System.setProperty("webdriver.chrome.driver","D:\\IMPORTANT\\SOFTWARE SETUP\\SELENIUM\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//To enter URL
		driver.get("https://www.instagram.com");
		
		//to close current tab
		driver.close();
		
		
		
	}

}
