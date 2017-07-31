/**
 * @author Jagatheshwaran
 * 
 */
// Package is created as datadrivenTest
package datadrivenTest;

// Importing the predefined class libraries
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


// The class is created with name : DatadrivenTestToReadFromExcel
public class DatadrivenTestToReadFromExcel
{
	
	// The global variable is declared
	public WebDriver driver;
	
	
	/** 
	 * Test method is used to run the login functionality
	 *
	 * dataProvider = testdata
	 */
	@Test(dataProvider ="testdata")
	/** 
	 * The method name is : login
	 * @param - username
	 * @param - password
	 */
	public void login(String username, String password){
		
	// Provide the path of driver location
	System.setProperty("webdriver.firefox.marionette", "./BrowserDrivers/geckodriver.exe");
	
	// Driver instance is created
	driver = new FirefoxDriver();
	
	// Launching the browser with the below url
	driver.get("http://www.gcrit.com/build3/admin/");
	
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.id("tdb1")).click();
	
	// Assert is used to verify expected value and actual value
	Assert.assertEquals("http://www.gcrit.com/build3/admin/index.php", driver.getCurrentUrl());
	
	// The below method will close the browser window
	driver.close();
	}
		
	// DataProvider annotation is used to perform the data driven test 
	// The readExcel method is used to read the data from the Excel sheet
	// The data read from the Excel sheet is stored in the method and pass on the login method
	@DataProvider(name = "testdata")
	public Object [] [] readExcel() throws BiffException, IOException {
		
	// The file object is created to store the Input excel file	
	File f = new File("./TestResources/Input.xls");
	
	// Workbook object is created by passing the file object
	Workbook w = Workbook.getWorkbook(f);
	
	// Sheet object is created to access the sheet of the workbook
	Sheet s = w.getSheet("Sheet1");
	
	// rows will return number of rows in the sheet
	int rows = s.getRows();
	
	// columns will return number of rows in the sheet
	int columns = s.getColumns();
	
	//System.out.println(rows);
	//System.out.println(columns);

	// Here the data in the sheet is extracted based on the number of rows and columns
	String inputData [] [] = new String [rows] [columns];
	for (int i=0; i<rows; i++){
		for (int j=0; j<columns; j++){
		Cell c = s.getCell(j, i);
		inputData [i][j] = c.getContents();
		System.out.println(inputData[i][j]);
	}
	}
	return inputData;
	}
}
