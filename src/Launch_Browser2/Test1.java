package Launch_Browser2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1
{
	public static void main(String[] args) 
	{
		//open browser
		ChromeOptions CO=new ChromeOptions();
		
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
		
		  //To enter URL
		 driver.get("https://www.facebook.com/");	

		//To close Current Tab of the Browser
		 driver.close();
		

	}

}
