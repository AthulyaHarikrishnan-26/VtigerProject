package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenericUtilities;

public class LeadsPage {

	// Declaration
	@FindBy(xpath = "//img[@title='Create Lead...']")
	private WebElement createNewLeads;

	@FindBy(name = "salutationtype")
	private WebElement salutationDropdown;

	@FindBy(name = "firstname")
	private WebElement firstnameTextfield;

	@FindBy(name = "lastname")
	private WebElement lastnameTextfield;

	@FindBy(id = "designation")
	private WebElement titleTextfield;

	@FindBy(name = "leadsource")
	private WebElement leadSrcDropdown;

	@FindBy(name = "industry")
	private WebElement industryDropdown;

	@FindBy(id = "mobile")
	private WebElement mobileTextfield;

	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveButton;

	@FindBy(xpath = "(//input[@title='Cancel [Alt+X]'])[1]")
	private WebElement cancelButton;

	// Initialization
	public LeadsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Utilization
	public void createNewLead() {
		createNewLeads.click();
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

	public void enterTitle(String text) {
		titleTextfield.sendKeys(text);

	}

	public void selectLeadSrc(String text) {
		GenericUtilities gu = new GenericUtilities();
		gu.selectOptionByVisibleText(leadSrcDropdown, text);
	}

	public void selectIndustry(String text) {
		GenericUtilities gu = new GenericUtilities();
		gu.selectOptionByVisibleText(industryDropdown, text);
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
