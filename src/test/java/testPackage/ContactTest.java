package testPackage;

import org.testng.annotations.Test;

import utilities.BaseClass;

public class ContactTest  extends BaseClass{
	
	@Test(dataProvider = "dataBaseContactDetails", dataProviderClass = DataSupply.class)
	public void createContact(String salutation,String firstName,String lastName,String leadSrc,String title,String department,String email,String mobileno) {
		hp.clickContactsLink();
		cp.clickCreateContactIcon();
		cp.selectSalutation(salutation);
		cp.enterFirstName(firstName);
		cp.enterLastName(lastName);
		cp.selectLeadSrc(leadSrc);
		cp.enterTitle(title);
		cp.enterDepartment(department);
		cp.enterEmail(email);
		cp.enterMobile(mobileno);
		cp.clickSaveButton();
	}

}
