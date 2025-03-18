package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GenericUtilities;

public class CalendarPage {

	// Declaration
	@FindBy(xpath = "//*[@id=\"mnuTab\"]/form/table/tbody/tr[2]/td[1]/table/tbody/tr/td/img")
	private WebElement addCalendar;

	@FindBy(linkText = "Meeting")
	private WebElement clickOnMeeting;

	@FindBy(name = "subject")
	private WebElement eventName;

	@FindBy(name = "description")
	private WebElement description;

	@FindBy(name = "location")
	private WebElement location;

	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveButton;

	@FindBy(xpath = "(//input[@title='Cancel [Alt+X]'])[1]")
	private WebElement cancelButton;

	// Initialization
	public CalendarPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Utilization

	public void addCalendarIcon(WebDriver driver) {
		GenericUtilities gu = new GenericUtilities();
		gu.mouseHoverOn(driver, addCalendar);
	}

	public void clickOnMeeting() {
		clickOnMeeting.click();

	}

	public void enterEventName(String text) {
		eventName.sendKeys(text);

	}

	public void enterDescription(String text) {
		description.sendKeys(text);

	}

	public void enterLocation(String text) {
		location.sendKeys(text);

	}

	public void clickSaveButton() {
		saveButton.click();
	}

	public void clickCancelButton() {
		cancelButton.click();
	}

}
