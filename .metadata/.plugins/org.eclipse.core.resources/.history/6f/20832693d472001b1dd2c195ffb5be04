package Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	static WebDriver driver;
	public static WebDriver startBrowser()
	{
	  System.setProperty("webdriver.chrome.driver","C:/Users/sufya/BDDFramework/BDDTemp/driver/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  return driver;
	}
	
   public static void closeBrowser()
   {	
	   driver.close();
 	   driver.quit();
   }
	

}
