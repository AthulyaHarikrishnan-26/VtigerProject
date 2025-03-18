package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GenericUtilities;

public class ContactsPage {

	@FindBy(xpath = "//img[@title='Create Contact...']")
	private WebElement createContactIcon;

	@FindBy(name = "salutationtype")
	private WebElement salutationDropdown;

	@FindBy(name = "firstname")
	private WebElement firstnameTextfield;

	@FindBy(name = "lastname")
	private WebElement lastnameTextfield;

	@FindBy(name = "leadsource")
	private WebElement leadSrcDropdown;

	@FindBy(id = "title")
	private WebElement titleTextfield;

	@FindBy(id = "department")
	private WebElement departmentTextfield;

	@FindBy(name = "email")
	private WebElement emailTextfield;

	@FindBy(id = "mobile")
	private WebElement mobileTextfield;

	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveButton;

	@FindBy(xpath = "(//input[@title='Cancel [Alt+X]'])[1]")
	private WebElement cancelButton;

	// Initialization
	public ContactsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Utilization

	public void clickCreateContactIcon() {
		createContactIcon.click();
	}

	public void selectSalutation(String text) {
		GenericUtilities gu = new GenericUtilities();
		gu.selectOptionByVisibleText(salutationDropdown, text);
	}

	public void enterFirstName(String text) {
		firstnameTextfield.sendKeys(text);
	}

	public void enterLastName(String text) {
		lastnameTextfield.sendKeys(text);
	}

	public void selectLeadSrc(String text) {
		GenericUtilities gu = new GenericUtilities();
		gu.selectOptionByVisibleText(leadSrcDropdown, text);
	}

	public void enterTitle(String text) {
		titleTextfield.sendKeys(text);
	}

	public void enterDepartment(String text) {
		departmentTextfield.sendKeys(text);
	}

	public void enterEmail(String text) {
		emailTextfield.sendKeys(text);
	}

	public void enterMobile(String text) {
		mobileTextfield.sendKeys(text);
	}

	public void clickSaveButton() {
		saveButton.click();
	}

	public void clickCancelButton() {
		cancelButton.click();
	}

}
