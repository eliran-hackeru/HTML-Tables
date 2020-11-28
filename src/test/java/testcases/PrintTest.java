package testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import testcases.TestBaseClass;
import pages.TablePage;
import utility.Helper;

/*
 * This class is for testing the results of the methods by printing them to the console 
 */

public class PrintTest extends TestBaseClass {

	@Test(priority = 0)
	public void PrintApp() throws Exception {
		
		String testName = new Throwable().getStackTrace()[0].getMethodName();

		extentTest = extent.createTest(testName);
		
		TablePage tablePage = PageFactory.initElements(driver, TablePage.class);
		
/*		tablePage.assertTitle();
		
		Helper.captureScreenshot(driver, testName, "01_Browser_Started");
		
*/		tablePage.printNumOfRaws();
		
		tablePage.printNumOfCals();
		
		tablePage.printCell(1, 1);
		
		System.out.println(tablePage.getTableCellText(tablePage.getTable(), 1, "Alfreds Futterkiste", 2));
		
		System.out.println(tablePage.verifyTableCellText(tablePage.getTable(), 1, "Alfreds Futterkiste", 2, "Maria Anders"));

		System.out.println(tablePage.getTableCellTextByXpath(tablePage.getTable(), 1, "Alfreds Futterkiste", 2));
	}
}
