package Launch_Browser1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 
{
	public static void main(String[] args) 
	{
	
System.setProperty("wedriver.chrome.driver","D:\\IMPORTANT\\SOFTWARE SETUP\\SELENIUM\\chromedriver.exe");
		
      WebDriver driver=new ChromeDriver();
      
      //To enter URL
      driver.get("https://www.swiggy.com/");
      
      //To close tab
      driver.close();
	}

}
