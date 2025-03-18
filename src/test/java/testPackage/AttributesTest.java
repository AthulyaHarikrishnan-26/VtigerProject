package testPackage;
import org.testng.annotations.Test;

import utilities.BaseClass;

public class AttributesTest extends BaseClass {

	@Test(groups = "smoke")
	public void moveToCalendarPage() {
		hp.clickCalendarLink();
		System.out.println("smoke 1");
		
	}

	@Test(groups = "integration")
	public void moveToLeadsPage() throws InterruptedException {
	//	Thread.sleep(7000);
		hp.clickLeadsLink();
		System.out.println("integration 1");
	}

	@Test(groups = "integration")
	public void moveToOrganizationsPage() {
		hp.clickOrganizationsLink();
		System.out.println("integration 2");
	}

	@Test(groups = "smoke")
	public void moveToContactsPage() {
		hp.clickContactsLink();
		System.out.println("smoke 2");
	}
	@Test(groups = "smoke")
	public void moveToContactsPage1() {
		hp.clickContactsLink();
		System.out.println("smoke 2");
	}

}

//PRIORITY,INVOCATION COUNT,DESCRIPTION,ENABLED,ALWAYS RUN
//enabled =false is used to disable.
