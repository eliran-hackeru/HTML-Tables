package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utility.Helper;

public class TablePage {

	WebDriver driver;

	private WebElement cell; // For getting the cell and for other methods

	public TablePage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	@FindBy(id = "customers")
	WebElement table;

	@FindBy(xpath = "//*[@id=\"customers\"]/tbody/tr")
	List<WebElement> rows;

	@FindBy(xpath = "//*[@id=\"customers\"]/tbody/tr[1]/th")
	List<WebElement> cols;

	// Prints the number of rows
	public void printNumOfRows() {
		System.out.println("Number of rows are : " + rows.size());
	}

	// Prints the number of columns
	public void printNumOfCals() {
		System.out.println("Number of cols are : " + cols.size());
	}

	// Returns the cell as a WebElemnt using xpath, adds 1 to row to avoid the table
	// headers
	public WebElement getCell(int row, int col) {
		cell = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[" + (row + 1) + "]/td[" + col + "]"));
		return cell;
	}

	// Prints the text content of the cell
	public void printCell(int row, int col) {
		cell = getCell(row, col);

		System.out.println(cell.getText());
	}

	// Returns rows a List<WebElement>
	public List<WebElement> getRows() {
		return rows;
	}

	// Returns table as a WebElement
	public WebElement getTable() {
		return table;
	}

	// Gets the text inside the cell
	public String getCellText(int row, int col) {
		cell = getCell(row, col);

		return cell.getText();
	}

	// Searches for text in the table by column number and returns the parallel text
	// from another column
	public String getTableCellText(WebElement table, int searchColumn, String searchText, int returnColumntext) {

		String answer = "Could not find the value: " + searchText + " at column " + searchColumn;// In case of a failure

		List<WebElement> tableRows = table.findElements(By.tagName("tr"));// Use the table to get the rows

		for (int i = 1; i < tableRows.size(); i++) {
			cell = getCell(i, searchColumn);// For comparison

			if (cell.getText().equalsIgnoreCase(searchText)) {
				answer = getCell(i, returnColumntext).getText();
				break;
			}
		}
		return answer;
	}

	// Uses getTableCellText() for comparison of an expected text to the real text
	// in the cell
	public boolean verifyTableCellText(WebElement table, int searchColumn, String searchText, int returnColumnText,
			String expectedText) {

		String answer = getTableCellText(table, searchColumn, searchText, returnColumnText);

		if (answer.equalsIgnoreCase(expectedText))
			return true;
		else
			return false;
	}

	// Uses getCellText(), which uses getCell, which uses the xpath to get the text
	// value of the cell
	// Doesn't work with switch-case though
	public String getTableCellTextByXpath(WebElement table, int searchColumn, String searchText, int returnColumnText)
			throws Exception {

		String answer = "Could not find the value: " + searchText + " at column " + searchColumn;// In case of a failure
		
		String xpath = "//td[contains(text(),'" + searchText +"')]";
		
		boolean exists = driver.getPageSource().contains(searchText);
		
		if (exists)
		{
			cell = table.findElement(By.xpath(xpath));
			
			WebElement cellRow = cell.findElement(By.xpath("ancestor::tr[1]"));
			
			int rowNum = rows.indexOf(cellRow);
			
			answer = getCellText(rowNum, returnColumnText);
			
			return answer;
		}
				
		else
		{
			return answer;
		}
		
	}

	// To assert the title "HTML Tables"
	public void assertTitle() {
		Assert.assertTrue(driver.getTitle().contains("HTML Tables"));
		System.out.println("Assert Title passed");
	}
}
