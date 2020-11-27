package pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TablePage {

	WebDriver driver;

	public TablePage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy (xpath = "//*[@id=\"customers\"]/tbody/tr") List<WebElement> raws;
	
	@FindBy (xpath = "//*[@id=\"customers\"]/tbody/tr[1]/th") List<WebElement> cols;
	
	public void numOfRaws()
	{
		System.out.println("Number of raws are : " +raws.size());
	}
	
	public void numOfCals()
	{
		System.out.println("Number of cols are : " +cols.size());
	}
	
/*	public String getTableCellText(WebElement table, int searchColumn,
			String searchText, int returnColumntext) {
		
	}
	
	public boolean verifyTableCellText(WebElement table, int searchColumn,
			String searchText, int returnColumnText, String expectedText) {
		
	}
	
	public String getTableCellTextByXpath(WebElement table, int searchColumn,
			String searchText, int returnColumnText) throws Exception {
		
	}
*/
}
