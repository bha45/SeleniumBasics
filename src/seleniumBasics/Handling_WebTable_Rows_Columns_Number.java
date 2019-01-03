/**
 * @author Jagatheshwaran
 * 
 */
package seleniumBasics;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_WebTable_Rows_Columns_Number {

	public static void main(String ar[]) throws IOException, InterruptedException {

		// Provide the path of driver location
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");

		// Driver instance is created
		WebDriver driver = new ChromeDriver();

		// To maximize Browser Window
		driver.manage().window().maximize();

		// Launching Browser with below URL
		driver.get("file:///E:/ECLIPSE%20ENV/WorkSpace/From_Old_WorkSpace/SeleniumBasics/TestResources/WebTable.html");

		WebElement table = driver.findElement(By.xpath("//table"));

		// It gives total Rows count
		List<WebElement> allRows = table.findElements(By.tagName("tr"));

		// It gives total Columns count
		List<WebElement> allColumns = table.findElements(By.tagName("td"));

		int totalRows = allRows.size() - 1;
		int totalColumns = allColumns.size();

		System.out.println("Total rows " + totalRows);
		System.out.println("Total columns " + totalColumns);

		// The below lines will print the row number and column number with cell value
		for (int row = 0; row < totalRows; row++) {

			List<WebElement> row_columns = allRows.get(row).findElements(By.tagName("td"));

			int rowColumns = row_columns.size();

			for (int column = 0; column < rowColumns; column++) {

				String cellText = row_columns.get(column).getText();

				if (cellText.contains("UK")) {
					System.out.println(
							"Cell Value of row number " + row + " and column number " + column + " Is " + cellText);
				}

			}
		}

		// It will close the Browser window
		driver.close();

	}

}
