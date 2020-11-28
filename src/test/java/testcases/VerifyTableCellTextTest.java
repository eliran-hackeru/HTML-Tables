package testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import testcases.TestBaseClass;
import pages.TablePage;
import utility.ExcelDataProvider;
import utility.Helper;

public class VerifyTableCellTextTest extends TestBaseClass {
	
	@Test(priority = 0)
	public void VerifyCompanyGetContactApp() throws Exception {
				
			String testName = new Throwable().getStackTrace()[0].getMethodName();

			extentTest = extent.createTest(testName);
			
			TablePage tablePage = PageFactory.initElements(driver, TablePage.class);
			
			tablePage.assertTitle();
			
			Helper.captureScreenshot(driver, testName, "01_Browser_Started");
			
			int totalRows = ExcelDataProvider.rowCounter("Company");
			
			for (int i=0; i<totalRows; i++)
			{
				String data[] = Helper.getArrayData(excel, "Company", (i+1), 1); // TestData/Data.xlsx
				
				String expectedData[] = Helper.getArrayData(excel, "Contact", (i+1), 1);
				
				boolean answer = tablePage.verifyTableCellText(tablePage.getTable(), 1, data[0], 2, expectedData[0]);
				
				if (answer == false)
				{
					extentTest.createNode("Verification failed, could not found "+data[0]);
					
					System.out.println("Verification failed, could not found "+data[0]);
				}
				else
				{
					extentTest.createNode("Verification confirmed for "+data[0]+", the Contact is: "+expectedData[0]);
					
					System.out.println("Verification confirmed for "+data[0]+", the Contact is: "+expectedData[0]);
				}
			}
			
			Helper.captureScreenshot(driver, testName, "02_Test_Completed");
	}
	
	@Test(priority = 1)
	public void VerifyCompanyGetCountryApp() throws Exception {
				
			String testName = new Throwable().getStackTrace()[0].getMethodName();

			extentTest = extent.createTest(testName);
			
			TablePage tablePage = PageFactory.initElements(driver, TablePage.class);
			
			tablePage.assertTitle();
			
			Helper.captureScreenshot(driver, testName, "01_Browser_Started");
			
			int totalRows = ExcelDataProvider.rowCounter("Company");
			
			for (int i=0; i<totalRows; i++)
			{
				String data[] = Helper.getArrayData(excel, "Company", (i+1), 1); // TestData/Data.xlsx
				
				String expectedData[] = Helper.getArrayData(excel, "Country", (i+1), 1);
				
				boolean answer = tablePage.verifyTableCellText(tablePage.getTable(), 1, data[0], 3, expectedData[0]);
				
				if (answer == false)
				{
					extentTest.createNode("Verification failed, could not found "+data[0]);
					
					System.out.println("Verification failed, could not found "+data[0]);
				}
				else
				{
					extentTest.createNode("Verification confirmed for "+data[0]+", the Country is: "+expectedData[0]);
					
					System.out.println("Verification confirmed for "+data[0]+", the Country is: "+expectedData[0]);
				}
			}
			
			Helper.captureScreenshot(driver, testName, "02_Test_Completed");
	}
	
	@Test(priority = 2)
	public void VerifyContactGetCompanyApp() throws Exception {
				
			String testName = new Throwable().getStackTrace()[0].getMethodName();

			extentTest = extent.createTest(testName);
			
			TablePage tablePage = PageFactory.initElements(driver, TablePage.class);
			
			tablePage.assertTitle();
			
			Helper.captureScreenshot(driver, testName, "01_Browser_Started");
			
			int totalRows = ExcelDataProvider.rowCounter("Contact");
			
			for (int i=0; i<totalRows; i++)
			{
				String data[] = Helper.getArrayData(excel, "Contact", (i+1), 1); // TestData/Data.xlsx
				
				String expectedData[] = Helper.getArrayData(excel, "Company", (i+1), 1);
				
				boolean answer = tablePage.verifyTableCellText(tablePage.getTable(), 2, data[0], 1, expectedData[0]);
				
				if (answer == false)
				{
					extentTest.createNode("Verification failed, could not found "+data[0]);
					
					System.out.println("Verification failed, could not found "+data[0]);
				}
				else
				{
					extentTest.createNode("Verification confirmed for "+data[0]+", the Company is: "+expectedData[0]);
					
					System.out.println("Verification confirmed for "+data[0]+", the Company is: "+expectedData[0]);
				}
			}
			
			Helper.captureScreenshot(driver, testName, "02_Test_Completed");
	}
	
	@Test(priority = 3)
	public void VerifyContactGetCountryApp() throws Exception {
				
			String testName = new Throwable().getStackTrace()[0].getMethodName();

			extentTest = extent.createTest(testName);
			
			TablePage tablePage = PageFactory.initElements(driver, TablePage.class);
			
			tablePage.assertTitle();
			
			Helper.captureScreenshot(driver, testName, "01_Browser_Started");
			
			int totalRows = ExcelDataProvider.rowCounter("Contact");
			
			for (int i=0; i<totalRows; i++)
			{
				String data[] = Helper.getArrayData(excel, "Contact", (i+1), 1); // TestData/Data.xlsx
				
				String expectedData[] = Helper.getArrayData(excel, "Country", (i+1), 1);
				
				boolean answer = tablePage.verifyTableCellText(tablePage.getTable(), 2, data[0], 3, expectedData[0]);
				
				if (answer == false)
				{
					extentTest.createNode("Verification failed, could not found "+data[0]);
					
					System.out.println("Verification failed, could not found "+data[0]);
				}
				else
				{
					extentTest.createNode("Verification confirmed for "+data[0]+", the Country is: "+expectedData[0]);
					
					System.out.println("Verification confirmed for "+data[0]+", the Country is: "+expectedData[0]);
				}
			}
			
			Helper.captureScreenshot(driver, testName, "02_Test_Completed");
	}
	
	@Test(priority = 4)
	public void VerifyCountryGetCompanyApp() throws Exception {
			
			String testName = new Throwable().getStackTrace()[0].getMethodName();

			extentTest = extent.createTest(testName);
		
			TablePage tablePage = PageFactory.initElements(driver, TablePage.class);
		
			tablePage.assertTitle();
		
			Helper.captureScreenshot(driver, testName, "01_Browser_Started");
		
			int totalRows = ExcelDataProvider.rowCounter("Country");
		
			for (int i=0; i<totalRows; i++)
			{
				String data[] = Helper.getArrayData(excel, "Country", (i+1), 1); // TestData/Data.xlsx
				
				String expectedData[] = Helper.getArrayData(excel, "Company", (i+1), 1);
				
				boolean answer = tablePage.verifyTableCellText(tablePage.getTable(), 3, data[0], 1, expectedData[0]);
				
				if (answer == false)
				{
					extentTest.createNode("Verification failed, could not found "+data[0]);
				
					System.out.println("Verification failed, could not found "+data[0]);
				}
				else
				{
					extentTest.createNode("Verification confirmed for "+data[0]+", the Company is: "+expectedData[0]);
				
					System.out.println("Verification confirmed for "+data[0]+", the Comapny is: "+expectedData[0]);
				}
			}
		
			Helper.captureScreenshot(driver, testName, "02_Test_Completed");
	}
	
	@Test(priority = 5)
	public void VerifyCountryGetContactApp() throws Exception {
			
			String testName = new Throwable().getStackTrace()[0].getMethodName();

			extentTest = extent.createTest(testName);
		
			TablePage tablePage = PageFactory.initElements(driver, TablePage.class);
		
			tablePage.assertTitle();
		
			Helper.captureScreenshot(driver, testName, "01_Browser_Started");
		
			int totalRows = ExcelDataProvider.rowCounter("Country");
		
			for (int i=0; i<totalRows; i++)
			{
				String data[] = Helper.getArrayData(excel, "Country", (i+1), 1); // TestData/Data.xlsx
				
				String expectedData[] = Helper.getArrayData(excel, "Contact", (i+1), 1);
				
				boolean answer = tablePage.verifyTableCellText(tablePage.getTable(), 3, data[0], 2, expectedData[0]);
				
				if (answer == false)
				{
					extentTest.createNode("Verification failed, could not found "+data[0]);
				
					System.out.println("Verification failed, could not found "+data[0]);
				}
				else
				{
					extentTest.createNode("Verification confirmed for "+data[0]+", the Contact is: "+expectedData[0]);
				
					System.out.println("Verification confirmed for "+data[0]+", the Contact is: "+expectedData[0]);
				}
			}
		
			Helper.captureScreenshot(driver, testName, "02_Test_Completed");
	}

}
