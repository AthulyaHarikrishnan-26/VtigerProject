package utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import objectRepository.ContactsPage;
import objectRepository.HomePage;
import objectRepository.LoginPage;
import objectRepository.OrganizationsPage;

@Listeners(ListenersClass.class)
public class BaseClass {

	public WebDriver driver;

	public static WebDriver sdriver;

	public WebDriverUtilities wu;
	public LoginPage lp;
	public HomePage hp;
	public ContactsPage cp;
	public OrganizationsPage op;

	@Parameters("browser")
	@BeforeMethod(alwaysRun = true)
	public void login(String browser) {
		wu = new WebDriverUtilities();

		driver = wu.launchBrowser(browser);
		// after this the browser addresss will be stored in driver,else it will be
		// null.
		sdriver = driver;

		hp = new HomePage(driver);
		lp = new LoginPage(driver);
		cp = new ContactsPage(driver);
		op = new OrganizationsPage(driver);

		wu.maximizeBrowser(driver);
		wu.implicitwait(driver, 10);
		wu.pageLoadingWait(driver, 30);

		wu.passURL(driver);

		lp.enterUsername();
		lp.enterPassword();
		lp.clickLoginButton();

	}

	@AfterMethod(alwaysRun = true)
	public void logout() {

		hp.signout(driver);
		wu.closeBrowser(driver);
	}

}
