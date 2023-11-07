package Launch_Browser1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7
{
	public static void main(String[] args) 
	{
				
		System.setProperty("webdriver.chrome.driver","D:\\IMPORTANT\\SOFTWARE SETUP\\SELENIUM\\chromedriver.exe");

		      //Create object 

		       WebDriver driver=new ChromeDriver();
		       
		     //To enter URL
				 driver.get("https://www.atlassian.com/software/jira");
				 
				 
			 //To close Current Tab 
				 driver.close();

				
		
	}


}
