package Launch_Browser1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5
{
   public static void main(String[] args)
   {
	   //To open Browser
	 System.setProperty("wedriver.chrome", "D:\\IMPORTANT\\SOFTWARE SETUP\\SELENIUM\\chromedriver.exe");
	 
	 WebDriver driver=new ChromeDriver();
	 
	 //To enter URL
	 driver.get("https://www.youtube.com");
	 
	 //To close current tab
	 driver.close();
	 
	
   }

}
