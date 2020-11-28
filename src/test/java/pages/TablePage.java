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

	private WebElement value; //For getting the value inside the cell and for other methods

	public TablePage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	@FindBy(id = "customers")
	WebElement table;

	@FindBy(xpath = "//*[@id=\"customers\"]/tbody/tr")
	List<WebElement> raws;

	@FindBy(xpath = "//*[@id=\"customers\"]/tbody/tr[1]/th")
	List<WebElement> cols;

	//Prints the number of raws
	public void numOfRaws() {
		System.out.println("Number of raws are : " + raws.size());
	}

	//Prints the number of columns
	public void numOfCals() {
		System.out.println("Number of cols are : " + cols.size());
	}

	//Returns the value as a WebElemnt using xpath, adds 1 to raw to avoid the table headers
	public WebElement getValue(int raw, int col) {
		value = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[" + (raw + 1) + "]/td[" + col + "]"));
		return value;
	}

	//Prints the text content of the value
	public void printValue(int raw, int col) {
		value = getValue(raw, col);

		System.out.println(value.getText());
	}

	//Returns raws a List<WebElement>
	public List<WebElement> getRaws() {
		return raws;
	}

	//Returns table as a WebElement
	public WebElement getTable() {
		return table;
	}

	//Searches for text in the table by column number and returns the parallel text from another column
	public String getTableCellText(WebElement table, int searchColumn, String searchText, int returnColumntext) {

		String answer = "Could not find the value: " + searchText;//In case of failure

		List<WebElement> tableRaws = table.findElements(By.tagName("tr"));//Use the table to get the raws

		for (int i = 1; i < tableRaws.size(); i++) {
			value = getValue(i, searchColumn);//For comparison

			if (value.getText().equalsIgnoreCase(searchText)) {
				answer = getValue(i, returnColumntext).getText();
				break;
			}
		}
		return answer;
	}

	//Uses getTableCellText() for comparison of an expected text to the real value text
	public boolean verifyTableCellText(WebElement table, int searchColumn, String searchText, int returnColumnText,
			String expectedText) {
		
		String answer = getTableCellText(table, searchColumn, searchText, returnColumnText);
		
		if(answer.equalsIgnoreCase(expectedText))
			return true;
		else
			return false;
		

	}

	/*
	 * public String getTableCellTextByXpath(WebElement table, int searchColumn,
	 * String searchText, int returnColumnText) throws Exception {
	 * 
	 * }
	 */
}
