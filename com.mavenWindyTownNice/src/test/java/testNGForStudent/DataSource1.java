package testNGForStudent;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataSource1 {

	
	//(dataProvider="RiverData") to call
	
	
	@Test(dataProvider="RiverData")
	public static void use(String river, String type) {
		System.out.println(river);
		System.out.println(type);
		
	}
	
	
	// To create
	@DataProvider(name = "RiverData")
	public static Object[][] vaat() {

		Object[][] acb = new Object[2][2];
		acb[0][0] = "Padma";
		acb[0][1] = "River";
		acb[1][0] = "Meghna";
		acb[1][1] = "River";
	
		return null;
		
		
	}
	
	
	@DataProvider(name = "DatafromWindyDay")
	public static Object[][] WindyDay() {

		Object[][] obj = new Object[2][2];

		obj[0][0] = "Padma";
		obj[0][1] = "River";
		obj[1][0] = "Meghna";
		obj[1][1] = "River";

		return obj;

	}

}
