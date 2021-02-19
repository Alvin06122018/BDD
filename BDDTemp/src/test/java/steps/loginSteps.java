package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import Page.HomePage;
import Page.LoginPage;
import Util.BrowserFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {
	WebDriver driver;
	LoginPage login;
	HomePage home;
	@Given("browser is open")
	public void browser_is_open() {
		driver = BrowserFactory.startBrowser();
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		driver.navigate().to("https://example.testproject.io/web/");

	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException  {
		login = PageFactory.initElements(driver, LoginPage.class);
		login.enterUsername(username);
		login.enterPassword(password);


	}
	@And("user click on login")
	public void user_click_on_login() throws InterruptedException {
		login.clickOnLogin();

	}


	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		home = PageFactory.initElements(driver, HomePage.class);;
		home.checkLogoutIsDisplayed();
		BrowserFactory.closeBrowser();

	}


}
