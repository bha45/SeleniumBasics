package datadrivenTest;

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

public class Datadriven 
{
	public WebDriver driver;
	@Test(dataProvider ="testdata")
	public void login(String username, String password){
    System.setProperty("webdriver.firefox.marionette","E:/ECLIPSE ENV//SELENIUM LIBS//geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("http://www.gcrit.com/build3/admin/");
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.id("tdb1")).click();
	Assert.assertEquals("http://www.gcrit.com/build3/admin/index.php", driver.getCurrentUrl());
	driver.close();
	}
		
	@DataProvider(name = "testdata")
	public Object [] [] readExcel() throws BiffException, IOException {
	File f = new File("E:/ECLIPSE ENV/SELENIUM LIBS/Input.xls");
	Workbook w = Workbook.getWorkbook(f);
	Sheet s = w.getSheet("Sheet1");
	int rows = s.getRows();
	int columns = s.getColumns();
	//System.out.println(rows);
	//System.out.println(columns);

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
