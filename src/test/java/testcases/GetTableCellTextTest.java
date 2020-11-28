package testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import testcases.TestBaseClass;
import pages.TablePage;
import utility.Helper;

public class GetTableCellTextTest extends TestBaseClass {
	
	@Test(priority = 0)
	public void GetTableCellTextApp() throws Exception {
				
			String testName = new Throwable().getStackTrace()[0].getMethodName();

			extentTest = extent.createTest(testName);
			
			TablePage tablePage = PageFactory.initElements(driver, TablePage.class);
			
			tablePage.assertTitle();
			
			Helper.captureScreenshot(driver, testName, "01_Browser_Started");
			
			String answer = tablePage.getTableCellText(tablePage.getTable(), 1, "Laughing Bacchus Winecellars", 3);
			
			extentTest.createNode(answer);
			
			System.out.println(answer);
			
			Helper.captureScreenshot(driver, testName, "02_Test_Completed");
	}

}
