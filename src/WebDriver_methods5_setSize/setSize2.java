package WebDriver_methods5_setSize;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class setSize2
{
	//setSize
	
	public static void main(String[] args) 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-Origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver(co);
		
		//Enter URL
		driver.get("http://facebook.com");
		
		//SetSize
		Dimension d1=new Dimension(500,600);
	
		driver.manage().window().setSize(d1);

	}
}
