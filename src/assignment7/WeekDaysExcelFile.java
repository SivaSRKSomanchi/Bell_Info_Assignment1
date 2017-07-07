package assignment7;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WeekDaysExcelFile {
	private static final String filename = "weekDays.xlsx";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XSSFWorkbook xssfsWorkbook = new XSSFWorkbook();
		XSSFSheet xssfSheet = xssfsWorkbook.createSheet();
		Object[][] weekdays = { { "SUNDAY", "1." }, { "MONDAY", "2." },
				{ "TUESDAY", "3." }, { "WEDNESDAY", "4." },
				{ "THURSDAY", "5." }, { "FRIDAY", "6." }, { "SATURDAY", "7." } };
		int rowNo = 0;
		System.out.println("Creating Excel");
		for (Object[] o : weekdays) {
			//System.out.println(o);
			Row row = xssfSheet.createRow(rowNo++);
			int  colNo = 0;
			for (Object field : o) {
				Cell cell = row.createCell(colNo++);
				if (field instanceof String) {
					cell.setCellValue((String) field);
				} else if (field instanceof Integer) {
					cell.setCellValue((Integer) field);
				}
			}
		}
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(filename);
			xssfsWorkbook.write(fos);
			xssfsWorkbook.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done");
	}

}
