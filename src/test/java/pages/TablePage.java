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
	
	private WebElement value;

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
	
	public WebElement getValue(int raw, int col)
	{
		value = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+(raw+1)+"]/td["+col+"]"));
		
		//*[@id="customers"]/tbody/tr[2]/td[3]
		
		return value;
	}
	
	public void printValue(int raw, int col)
	{
		value = getValue(raw, col);
		
		System.out.println(value.getText());
	}
	
	public List<WebElement> getRaws()
	{
		return raws;
	}
		
	public String getTableCellText(List<WebElement> table, int searchColumn,
			String searchText, int returnColumntext) {
		
		for(int i=1; i<table.size(); i++)
		{
			value = getValue(i, searchColumn);
			
			if (value.getText().equalsIgnoreCase(searchText))
			{
				value = getValue(i, returnColumntext);
				break;
			}
		}		
		
		return value.getText();
	}
	
/*	public boolean verifyTableCellText(WebElement table, int searchColumn,
			String searchText, int returnColumnText, String expectedText) {
		
	}
	
	public String getTableCellTextByXpath(WebElement table, int searchColumn,
			String searchText, int returnColumnText) throws Exception {
		
	}
*/
}
