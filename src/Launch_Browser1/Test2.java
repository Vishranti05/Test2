package Launch_Browser1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 
{
	public static void main(String[] args)
	{
		//Parameter-I: Name of the browser
		//Parameter-II:Path of the ChromeDriver.exe file
		
System.setProperty("webdriver.chrome.driver","D:\\IMPORTANT\\SOFTWARE SETUP\\SELENIUM\\chromedriver.exe");
		
        //Create object of ChromeDriver Class and provide Reference of WebDriver Interface

             WebDriver  driver=new ChromeDriver();         
	}

}
