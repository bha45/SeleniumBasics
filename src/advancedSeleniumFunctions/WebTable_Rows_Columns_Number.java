package advancedSeleniumFunctions;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Rows_Columns_Number {

	static WebDriver driver;

	public static void main(String ar[]) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("file:///E:/ECLIPSE%20ENV/WorkSpace/From_Old_WorkSpace/SeleniumBasics/TestResources/WebTable.html");

		WebElement table = driver.findElement(By.xpath("//table"));

		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		List<WebElement> allColumns = table.findElements(By.tagName("td"));
		int totalRows = allRows.size() - 1;
		int totalColumns = allColumns.size();

		System.out.println("Total rows " + totalRows);
		System.out.println("Total columns " + totalColumns);

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

		driver.close();

	}

}
