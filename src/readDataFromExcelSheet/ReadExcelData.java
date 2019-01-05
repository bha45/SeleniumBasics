/**
 * @author Jagatheshwaran
 * 
 */
package readDataFromExcelSheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String ar[]) throws IOException {

		// Providing the path of Excel file
		FileInputStream file = new FileInputStream(
				new File("E://ECLIPSE ENV//WorkSpace//JavaBasics//Files/Excel.xlsx"));

		// Creating Workbook with input Excel file
		XSSFWorkbook workbook = new XSSFWorkbook(file);

		// Creating Sheet From Workbook
		XSSFSheet sheet = workbook.getSheetAt(0);

		// Iterator invoked to iterate Rows in Sheet
		Iterator<Row> rowIterator = sheet.iterator();

		while (rowIterator.hasNext()) {

			Row row = rowIterator.next();

			// Iterator invoked to iterate Cells based on Rows in Sheet
			Iterator<Cell> cellIterator = row.iterator();

			while (cellIterator.hasNext()) {

				Cell cell = cellIterator.next();

				// Based on Cell Type reading Data from Excel Sheet
				switch (cell.getCellType()) {

				case Cell.CELL_TYPE_NUMERIC:
					System.out.print(cell.getNumericCellValue() + " ");
					break;

				case Cell.CELL_TYPE_STRING:
					System.out.print(cell.getStringCellValue() + " ");
					break;

				}
			}

			System.out.println(" ");
		}

		file.close();
	}

}
