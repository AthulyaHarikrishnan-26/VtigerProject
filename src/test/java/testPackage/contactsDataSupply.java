package testPackage;

import org.testng.annotations.DataProvider;

public class contactsDataSupply {
	
	@DataProvider(name = "ContactDetails")
	public Object[][] contactData(){
		
		return new Object[][] {
			{"Ms.","Chethana","Prakash","Employee","Health Inspector","Health","chethana@gmail.com","9988776655"},
			{"Mr.","Afthab","Mohammed","Self Generated","Journalist","ALL india Radio","afthab@gmail.com","1122334455"},
			{"Ms.","Mihika","Kumar","Employee","Student","Grade Seven","mihika@gmail.com","9917110126"}
		};
	}
	

}
