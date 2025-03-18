package testPackage;

import org.testng.annotations.Test;

public class dataSupplyTest {
	
	@Test(dataProvider = "userCredentials1",dataProviderClass = DataSupply.class)
	public void printData(String username,String password) {
		
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test(dataProvider = "userCredentials",dataProviderClass = DataSupply.class)
	public void printData17(String username,String password) {
		
		System.out.println(username);
		System.out.println(password);
	}


}
