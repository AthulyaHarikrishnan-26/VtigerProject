package testPackage;

import java.util.ArrayList;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.DataUtilities;

public class DataSupply {

	@DataProvider(name = "userCredentials")
	public Object[][] userData() {

		return new Object[][] {

				{ "resbin@gmail.com", "resbin@123" }, { "siva@gmail.com", "siva@123" },
				{ "sreekanth@gmail.com", "sreekanth@123" }, { "athulya@gmail.com", "athulya@123" } };
	}

	@Test(dataProvider = "userCredentials")
	public void printData1(String username, String password) {
		System.out.println(username);
		System.out.println(password);
	}

	@DataProvider(name = "userCredentials1")
	public Object[][] userData1() {

		return new Object[][] {

				{ "helen@gmail.com", "helen@123" }, { "sneha@gmail.com", "sneha@123" },
				{ "alina@gmail.com", "alina@123" }, { "hari@gmail.com", "hari@123" } };
	}

	@Test(dataProvider = "userCredentials1")
	public void printData(String username, String password) {

		System.out.println(username);
		System.out.println(password);
	}

	@DataProvider(name = "dataBaseContactDetails")
	public Object[][] databaseContacts() {

		DataUtilities du = new DataUtilities();

		ArrayList<Object[]> result = du.getDataFromDatabase("select * from contacts");

		return result.toArray(new Object[0][]);

	}

	@Test(dataProvider = "dataBaseContactDetails")
	public void contactDetails(String salutation, String firstname, String lastname, String leadsrc, String title,
			String department, String email, String phno) {
	}
}
