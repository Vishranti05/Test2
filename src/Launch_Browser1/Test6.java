package Launch_Browser1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6
{
	public static void main(String[] args) 
	{
				
		System.setProperty("webdriver.chrome.driver","D:\\IMPORTANT\\SOFTWARE SETUP\\SELENIUM\\chromedriver.exe");

		      //Create object 

		       WebDriver driver=new ChromeDriver();
		       
		     //To enter URL/Open an Application
				 driver.get("https://meet.google.com");
				 
				 
			 //To close Current Tab of the Browser
				 driver.close();

				
		
	}

}
