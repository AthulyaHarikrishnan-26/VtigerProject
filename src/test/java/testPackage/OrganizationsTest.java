package testPackage;

import org.testng.annotations.Test;

import utilities.BaseClass;

public class OrganizationsTest extends BaseClass{
	
	@Test
	public void createOrganization() {
		
		hp.clickOrganizationsLink();
		op.clickOrganizationsIcon();
		op.enterOrganizationName("Aatmanah");
		op.enterEmployees("7");
		op.selectIndustry("Recreation");
		op.selectType("Investor");
		op.enterPhone("9876543210");
		op.enterEmail("aatmanah@gmail.com");
		op.clickSaveButton();
	}
	
	

}
