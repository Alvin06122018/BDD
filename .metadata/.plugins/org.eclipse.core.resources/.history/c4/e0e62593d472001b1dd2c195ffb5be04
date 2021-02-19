package Page;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class BasePage {
	WebDriver driver;
	public BasePage(WebDriver driver) 
	{
	   this.driver = driver;
	}
	public static void TakeScreenshot(WebDriver driver)
	{
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		@SuppressWarnings("unused")
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	}

}
