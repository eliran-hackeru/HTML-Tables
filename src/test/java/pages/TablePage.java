package pages;

import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TablePage {

	WebDriver driver;

	private WebElement cell; // For getting the cell and for other methods

	public TablePage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	@FindBy(id = "customers")
	WebElement table;

	@FindBy(xpath = "//*[@id=\"customers\"]/tbody/tr")
	List<WebElement> raws;

	@FindBy(xpath = "//*[@id=\"customers\"]/tbody/tr[1]/th")
	List<WebElement> cols;

	// Prints the number of raws
	public void numOfRaws() {
		System.out.println("Number of raws are : " + raws.size());
	}

	// Prints the number of columns
	public void numOfCals() {
		System.out.println("Number of cols are : " + cols.size());
	}

	// Returns the cell as a WebElemnt using xpath, adds 1 to raw to avoid the table
	// headers
	public WebElement getCell(int raw, int col) {
		cell = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[" + (raw + 1) + "]/td[" + col + "]"));
		return cell;
	}

	// Prints the text content of the cell
	public void printCell(int raw, int col) {
		cell = getCell(raw, col);

		System.out.println(cell.getText());
	}

	// Returns raws a List<WebElement>
	public List<WebElement> getRaws() {
		return raws;
	}

	// Returns table as a WebElement
	public WebElement getTable() {
		return table;
	}

	// Gets the text inside the cell
	public String getCellText(int raw, int col) {
		cell = getCell(raw, col);

		return cell.getText();
	}

	// Searches for text in the table by column number and returns the parallel text
	// from another column
	public String getTableCellText(WebElement table, int searchColumn, String searchText, int returnColumntext) {

		String answer = "Could not find the value: " + searchText + " at column " + searchColumn;// In case of a failure

		List<WebElement> tableRaws = table.findElements(By.tagName("tr"));// Use the table to get the raws

		for (int i = 1; i < tableRaws.size(); i++) {
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

	public String getTableCellTextByXpath(WebElement table, int searchColumn, String searchText, int returnColumnText)
			throws Exception {

		String answer = "Could not find the value: " + searchText + " at column " + searchColumn;// In case of a failure

		if (getCellText(1, searchColumn).equalsIgnoreCase(searchText)) {
			answer = getCellText(1, returnColumnText);
			
		} else if (getCellText(2, searchColumn).equalsIgnoreCase(searchText)) {
			answer = getCellText(2, returnColumnText);
		}

		else if (getCellText(3, searchColumn).equalsIgnoreCase(searchText)) {
			answer = getCellText(3, returnColumnText);
		}

		else if (getCellText(4, searchColumn).equalsIgnoreCase(searchText)) {
			answer = getCellText(4, returnColumnText);
		}

		else if (getCellText(5, searchColumn).equalsIgnoreCase(searchText)) {
			answer = getCellText(5, returnColumnText);
		}

		else if (getCellText(6, searchColumn).equalsIgnoreCase(searchText)) {
			answer = getCellText(6, returnColumnText);
		}

		return answer;
	}
}
