package testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import testcases.TestBaseClass;
import pages.TablePage;
import utility.Helper;

public class PrintTest extends TestBaseClass {

	@Test(priority = 0)
	public void PrintApp() {
		
		String testName = new Throwable().getStackTrace()[0].getMethodName();

		extentTest = extent.createTest(testName);
		
		TablePage tablePage = PageFactory.initElements(driver, TablePage.class);
		
		tablePage.numOfRaws();
		
		tablePage.numOfCals();
	}

}
