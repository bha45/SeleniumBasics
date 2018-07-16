/**
 * @author Jagatheshwaran
 * 
 */
// Package is created as datadrivenTest
package datadrivenTest;

// Importing the predefined class libraries
import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

// The class is created with name : DatadrivenTestToReadExcel
public class DatadrivenTestToReadExcel {

	/** 
	 * Test method is used to run the add functionality
	 *
	 * dataProvider = testdata
	 */
	@Test(dataProvider="testdata")
	/** 
	 * The method name is : login
	 * @param - val1
	 * @param - val2
	 * @param - val3
	 */
	public void add(String val1, String val2, String val3){
		
	int a = Integer.parseInt(val1);
	int b = Integer.parseInt(val2);
	int c = Integer.parseInt(val3);
	int result = a + b + c;
	System.out.println(result);
	
	}
	
	// DataProvider annotation is used to perform the data driven test 
	// The readExcel method is used to read the data from the Excel sheet
	// The data read from the Excel sheet is stored in the method and pass on the add method	
	@DataProvider(name="testdata")	
	public Object [] [] readExcel() throws BiffException, IOException {
		
	// The file object is created to store the Input excel file	
	File f = new File("./TestResources/Input2.xls");
	
	// Workbook object is created by passing the file object
	Workbook w = Workbook.getWorkbook(f);
	
	// Sheet object is created to access the sheet of the workbook
	Sheet s = w.getSheet("Sheet1");
	
	// rows will return number of rows in the sheet
	int rows = s.getRows();
	
	// columns will return number of columns in the sheet
	int columns = s.getColumns();
	//System.out.println(rows);
	//System.out.println(columns);

	// Here the data in the sheet is extracted based on the number of rows and columns
	String inputData [] [] = new String [rows][columns];
	for (int i=0; i<rows; i++){
		for (int j=0; j<columns; j++){
			Cell c = s.getCell(j, i);
			inputData[i][j] = c.getContents();
			System.out.println(inputData[i][j]);
			}
	}
	return inputData;	
	}

}
