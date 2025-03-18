package testPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;

public class VerificationClass extends BaseClass{
	@Test
	public void verify() {

		Assert.assertEquals(true, true);
		Assert.assertEquals(17, 17);
		Assert.assertEquals("Athulya", "Athulya");

		Assert.assertNotEquals(true, false);
		Assert.assertNotEquals(5, 7);

		Assert.assertSame("Mihika", "Mihika");
		Assert.assertNotSame("Mihika", "Afthab");

		Assert.assertNull(null);
		Assert.assertNotNull("Mihika");

		Assert.assertTrue(true);
		Assert.assertFalse(false);

	
	}

}
//all these methods are coming from assert class.also they are static
