package Page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	@FindBy(id="logout")
	WebElement btn_logout;
	
	static WebDriver driver;
	
	public HomePage(WebDriver driver) {
		
		HomePage.driver=driver;
		//PageFactory.initElements(driver, this);
		}
	
	public void checkLogoutIsDisplayed() {
		btn_logout.isDisplayed();
	}

}
