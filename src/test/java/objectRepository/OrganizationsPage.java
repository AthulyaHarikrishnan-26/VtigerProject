package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GenericUtilities;

public class OrganizationsPage {

	// Declaration-------org name,empl,type,email,phone

	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement createNewOrganization;

	@FindBy(name = "accountname")
	private WebElement organizationNameTextfield;

	@FindBy(id = "employees")
	private WebElement employeesTextfield;

	@FindBy(name = "industry")
	private WebElement industryDropdown;

	@FindBy(name = "accounttype")
	private WebElement typeDropdown;

	@FindBy(id = "email1")
	private WebElement emailTextfield;

	@FindBy(id = "phone")
	private WebElement phoneTextfield;

	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveButton;

	@FindBy(xpath = "(//input[@title='Cancel [Alt+X]'])[1]")
	private WebElement cancelButton;

	// Initialization
	public OrganizationsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Utilization

	public void clickOrganizationsIcon() {
		createNewOrganization.click();
	}

	public void enterOrganizationName(String text) {
		organizationNameTextfield.sendKeys(text);
	}

	public void enterEmployees(String text) {
		employeesTextfield.sendKeys(text);
	}

	public void selectIndustry(String text) {
		GenericUtilities gu = new GenericUtilities();
		gu.selectOptionByVisibleText(industryDropdown, text);
	}

	public void selectType(String text) {
		GenericUtilities gu = new GenericUtilities();
		gu.selectOptionByVisibleText(typeDropdown, text);
	}

	public void enterEmail(String text) {
		emailTextfield.sendKeys(text);
	}

	public void enterPhone(String text) {
		phoneTextfield.sendKeys(text);
	}

	public void clickSaveButton() {
		saveButton.click();
	}

	public void clickCancelButton() {
		cancelButton.click();
	}

}
