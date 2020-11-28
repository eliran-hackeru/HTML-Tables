package testcases;

import org.testng.annotations.Test;

/*
 * This test is similar to GetTableCellTextTest,
 * but it uses getTableCellTextByXpath() instead of getTableCellText()
 */

import org.openqa.selenium.support.PageFactory;
import testcases.TestBaseClass;
import pages.TablePage;
import utility.ExcelDataProvider;
import utility.Helper;

public class GetTableCellTextByXpathTest extends TestBaseClass {
	
	@Test(priority = 0)
	public void InsertCompanyGetContactApp() throws Exception {
				
			String testName = new Throwable().getStackTrace()[0].getMethodName();

			extentTest = extent.createTest(testName);
			
			TablePage tablePage = PageFactory.initElements(driver, TablePage.class);
			
			System.out.println("Starting: "+testName);
			
			tablePage.assertTitle();
			
			Helper.captureScreenshot(driver, testName, "01_Browser_Started");
			
			int totalRows = ExcelDataProvider.rowCounter("Company");
			
			for (int i=0; i<totalRows; i++)
			{
				String data[] = Helper.getArrayData(excel, "Company", (i+1), 1); // TestData/Data.xlsx
				
				String answer = tablePage.getTableCellTextByXpath(tablePage.getTable(), 1, data[0], 2);
				
				if (answer.contains("Could not find the value"))
				{
					extentTest.createNode(answer);
					
					System.out.println(answer);
				}
				else
				{
					extentTest.createNode("The Contact of "+data[0]+" is: "+answer);
					
					System.out.println("The Contact of "+data[0]+" is: "+answer);
				}
			}
			
			Helper.captureScreenshot(driver, testName, "02_Test_Completed");
			
			System.out.println("Ending: "+testName +"\n");
	}
	
	@Test(priority = 1)
	public void InsertCompanyGetCountryApp() throws Exception {
				
			String testName = new Throwable().getStackTrace()[0].getMethodName();

			extentTest = extent.createTest(testName);
			
			TablePage tablePage = PageFactory.initElements(driver, TablePage.class);
			
			System.out.println("Starting: "+testName);
			
			tablePage.assertTitle();
			
			Helper.captureScreenshot(driver, testName, "01_Browser_Started");
			
			int totalRows = ExcelDataProvider.rowCounter("Company");
			
			for (int i=0; i<totalRows; i++)
			{
				String data[] = Helper.getArrayData(excel, "Company", (i+1), 1); // TestData/Data.xlsx
				
				String answer = tablePage.getTableCellTextByXpath(tablePage.getTable(), 1, data[0], 3);
				
				if (answer.contains("Could not find the value"))
				{
					extentTest.createNode(answer);
					
					System.out.println(answer);
				}
				else
				{
					extentTest.createNode("The Country of "+data[0]+" is: "+answer);
					
					System.out.println("The Country of "+data[0]+" is: "+answer);
				}
			}
			
			Helper.captureScreenshot(driver, testName, "02_Test_Completed");
			
			System.out.println("Ending: "+testName +"\n");
	}
	
	@Test(priority = 2)
	public void InsertContactGetCompanyApp() throws Exception {
				
			String testName = new Throwable().getStackTrace()[0].getMethodName();

			extentTest = extent.createTest(testName);
			
			TablePage tablePage = PageFactory.initElements(driver, TablePage.class);
			
			System.out.println("Starting: "+testName);
			
			tablePage.assertTitle();
			
			Helper.captureScreenshot(driver, testName, "01_Browser_Started");
			
			int totalRows = ExcelDataProvider.rowCounter("Contact");
			
			for (int i=0; i<totalRows; i++)
			{
				String data[] = Helper.getArrayData(excel, "Contact", (i+1), 1); // TestData/Data.xlsx
				
				String answer = tablePage.getTableCellTextByXpath(tablePage.getTable(), 2, data[0], 1);
				
				if (answer.contains("Could not find the value"))
				{
					extentTest.createNode(answer);
					
					System.out.println(answer);
				}
				else
				{
					extentTest.createNode("The Company of "+data[0]+" is: "+answer);
					
					System.out.println("The Company of "+data[0]+" is: "+answer);
				}
			}
			
			Helper.captureScreenshot(driver, testName, "02_Test_Completed");
			
			System.out.println("Ending: "+testName +"\n");
	}
	
	@Test(priority = 3)
	public void InsertContactGetCountryApp() throws Exception {
				
			String testName = new Throwable().getStackTrace()[0].getMethodName();

			extentTest = extent.createTest(testName);
			
			TablePage tablePage = PageFactory.initElements(driver, TablePage.class);
			
			System.out.println("Starting: "+testName);
			
			tablePage.assertTitle();
			
			Helper.captureScreenshot(driver, testName, "01_Browser_Started");
			
			int totalRows = ExcelDataProvider.rowCounter("Contact");
			
			for (int i=0; i<totalRows; i++)
			{
				String data[] = Helper.getArrayData(excel, "Contact", (i+1), 1); // TestData/Data.xlsx
				
				String answer = tablePage.getTableCellTextByXpath(tablePage.getTable(), 2, data[0], 3);
				
				if (answer.contains("Could not find the value"))
				{
					extentTest.createNode(answer);
					
					System.out.println(answer);
				}
				else
				{
					extentTest.createNode("The Country of "+data[0]+" is: "+answer);
					
					System.out.println("The Country of "+data[0]+" is: "+answer);
				}
			}
			
			Helper.captureScreenshot(driver, testName, "02_Test_Completed");
			
			System.out.println("Ending: "+testName +"\n");
	}
	
	@Test(priority = 4)
	public void InsertCountryGetCompanyApp() throws Exception {
			
			String testName = new Throwable().getStackTrace()[0].getMethodName();

			extentTest = extent.createTest(testName);
		
			TablePage tablePage = PageFactory.initElements(driver, TablePage.class);
			
			System.out.println("Starting: "+testName);
		
			tablePage.assertTitle();
		
			Helper.captureScreenshot(driver, testName, "01_Browser_Started");
		
			int totalRows = ExcelDataProvider.rowCounter("Country");
		
			for (int i=0; i<totalRows; i++)
			{
				String data[] = Helper.getArrayData(excel, "Country", (i+1), 1); // TestData/Data.xlsx
			
				String answer = tablePage.getTableCellTextByXpath(tablePage.getTable(), 3, data[0], 1);
			
				if (answer.contains("Could not find the value"))
				{
					extentTest.createNode(answer);
				
					System.out.println(answer);
				}
				else
				{
					extentTest.createNode("The Company of "+data[0]+" is: "+answer);
				
					System.out.println("The Company of "+data[0]+" is: "+answer);
				}
			}
	
			Helper.captureScreenshot(driver, testName, "02_Test_Completed");
			
			System.out.println("Ending: "+testName +"\n");
	}
	
	@Test(priority = 5)
	public void InsertCountryGetContactApp() throws Exception {
				
			String testName = new Throwable().getStackTrace()[0].getMethodName();

			extentTest = extent.createTest(testName);
			
			TablePage tablePage = PageFactory.initElements(driver, TablePage.class);
			
			System.out.println("Starting: "+testName);
			
			tablePage.assertTitle();
			
			Helper.captureScreenshot(driver, testName, "01_Browser_Started");
			
			int totalRows = ExcelDataProvider.rowCounter("Country");
			
			for (int i=0; i<totalRows; i++)
			{
				String data[] = Helper.getArrayData(excel, "Country", (i+1), 1); // TestData/Data.xlsx
				
				String answer = tablePage.getTableCellTextByXpath(tablePage.getTable(), 3, data[0], 2);
				
				if (answer.contains("Could not find the value"))
				{
					extentTest.createNode(answer);
					
					System.out.println(answer);
				}
				else
				{
					extentTest.createNode("The Contact of "+data[0]+" is: "+answer);
					
					System.out.println("The Contact of "+data[0]+" is: "+answer);
				}
			}
			
			Helper.captureScreenshot(driver, testName, "02_Test_Completed");
			
			System.out.println("Ending: "+testName +"\n");
		}
}
