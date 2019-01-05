/**
 * @author Jagatheshwaran
 * 
 */
package readDataFromExcelSheet;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelData {

	public static void main(String ar[]) {

		// WorkBook is created
		XSSFWorkbook workbook = new XSSFWorkbook();

		// A sheet with below name is created
		XSSFSheet sheet = workbook.createSheet("TestData");

		// A Map is created to store Key and values
		Map<String, Object[]> dataMap = new TreeMap<String, Object[]>();

		// Adding data to map
		dataMap.put("1", new Object[] { "Name", "Position" });
		dataMap.put("2", new Object[] { "Jaga", "Tester" });
		dataMap.put("3", new Object[] { "Arul", "Developer" });

		// Getting Keys from Map Data
		Set<String> keyVal = dataMap.keySet();

		int rownum = 0;

		for (String key : keyVal) {

			// A Row is created to write data
			Row row = sheet.createRow(rownum++);

			// Getting Values based on Keys
			Object[] dataArray = dataMap.get(key);

			int cellnum = 0;

			for (Object data : dataArray) {

				// A Cell is created to write data
				Cell cell = row.createCell(cellnum++);

				if (data instanceof String) {
					cell.setCellValue((String) data);
				}
				if (data instanceof Integer) {
					cell.setCellValue((Integer) data);
				}

			}
		}

		try {

			// Writing Data to Excel sheet
			FileOutputStream file = new FileOutputStream(
					new File("E://ECLIPSE ENV//WorkSpace//JavaBasics//Files/Excel.xlsx"));
			workbook.write(file);

			// Closing File
			file.close();

			System.out.println("Data written into Excel");

		} catch (IOException ex) {

			ex.printStackTrace();
		}
	}
}
