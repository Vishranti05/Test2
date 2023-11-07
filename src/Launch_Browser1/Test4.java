package Launch_Browser1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 
{
	//Open Browser/Launch Browser
	public static void main(String[] args)
	{
		//Parameter I-Name of the browser
		//Parameter II-Path of the ChromeDriver.exe.file
		
System.setProperty("webdriver.chrome.driver","D:\\IMPORTANT\\SOFTWARE SETUP\\SELENIUM\\chromedriver.exe");

      //Create object of ChromeDriver class & provide reference of WebDriver interface

       WebDriver driver=new ChromeDriver();
       
     //To enter URL/Open an Application
		 driver.get("https://www.irctc.co.in/nget/train-search");
		 
		 
		 //To close Current Tab of the Browser
		 driver.close();

		
	}

}
