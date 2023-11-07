package Launch_Browser2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test8
{
	public static void main(String[] args)
	{
		//Open browser
		ChromeOptions Co=new ChromeOptions();
		Co.addArguments("--remote-allows-origins=*","ignore-certificate-erros");
		
		WebDriver driver=new ChromeDriver();
		
		//To enter URL
		driver.get("https://in.bookmyshow.com/");
		
		//To close current tab
		driver.close();
	}
}
