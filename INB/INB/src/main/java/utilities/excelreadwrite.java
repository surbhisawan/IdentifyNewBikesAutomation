package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelreadwrite {
	public static String exfilepath = System.getProperty("user.dir") + "\\src\\main\\resources\\testdata.xlsx";
	public static FileInputStream fileip;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static String incorrect_email;
	public static String correct_email;

	public static void readexcel() {
		try {
			fileip = new FileInputStream(exfilepath);
			workbook = new XSSFWorkbook(fileip);
			sheet = workbook.getSheetAt(0);

			incorrect_email = (sheet.getRow(1).getCell(0)).getStringCellValue();
			correct_email = (sheet.getRow(2).getCell(0)).getStringCellValue();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
