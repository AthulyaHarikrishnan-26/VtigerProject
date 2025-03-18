package utilities;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtilities {

	public WebDriver launchBrowser(String browser) {
		// Webdriver driver is not declared as global variable bcoz if declared as
		// global then its value will be null,so we need to get URL from main method
		WebDriver driver = null;

//		DataUtilities du = new DataUtilities();
//		String browser = du.getDataFromPropertyFile("browser");

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		} else {
			System.out.println("Invalid Browser");
		}

		return driver;
	}

	public void passURL(WebDriver driver) {// i am using webdriver driver bcoz driver contains address of browser

		String url = new DataUtilities().getDataFromPropertyFile("url");// creating object for data utilities bcoz
																		// datautilities is a non static method,in order
																		// to access a non static method i have to
																		// create object
		driver.get(url);
	}

	public void maximizeBrowser(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public void implicitwait(WebDriver driver, long time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}

	public void pageLoadingWait(WebDriver driver, long time) {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(time));
	}

	public void waitUntilElementClickable(WebDriver driver, long time, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public void titleContains(WebDriver driver, long time, String title) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));

		wait.until(ExpectedConditions.titleContains(title));

	}

	public void urlContains(WebDriver driver, long time, String url) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));

		wait.until(ExpectedConditions.urlContains(url));

	}

	public void waitUntilElementVisible(WebDriver driver, long time, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));

		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}

	public void closeBrowser(WebDriver driver) {
		driver.quit();
	}

	public void refreshPage(WebDriver driver) {
		driver.navigate().refresh();

	}
}
//all methods are having webdriver driver that is why it is known as webdriver utilities.
