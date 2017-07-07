package assignment7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class StudentDetailsExcelFile {
	private static final String fileName = "StudentDetails.xlsx";
	private static final String as = "Sva";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XSSFWorkbook workBook = new XSSFWorkbook();
		XSSFSheet sheet = workBook.createSheet();
		Object[][] string = { { "ID", "Name", "Marks", "Fee" } };
		Student[][] s = { { new Student(1, "Siva", 98, 12345) } };
		int rowNo = 1;
		System.out.println("Creating");
		for (Student[] a : s) {
			// sheet.addMergedRegion(new CellRangeAddress(0,0,0,3));
			// Cell cell = row1.
			Row row = sheet.createRow(rowNo++);
			int colNo = 0;
			// Cell cell4 = row.createCell(0);
			// cell4.setCellValue(as);;
			for (Student field : a) {

				Cell cell = row.createCell(0);
				cell.setCellValue(field.getId());
				Cell cell1 = row.createCell(1);
				cell1.setCellValue(field.getName());
				Cell cell2 = row.createCell(2);
				cell2.setCellValue(field.getMarks());
				Cell cell3 = row.createCell(3);
				cell3.setCellValue(field.getFee());
			}
		}

		int rowNo1 = 0;
		System.out.println("Creating");
		for (Object[] str : string) {
			Row row1 = sheet.createRow(rowNo1++);
			int colNo1 = 0;
			for (Object field : str) {
				Cell cell = row1.createCell(colNo1++);
				if (field instanceof String) {
					cell.setCellValue((String) field);
				}
	}
}

				FileOutputStream fos = null;
				try {
					fos = new FileOutputStream(fileName);
					workBook.write(fos);
					workBook.close();
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

class Student {
	private int id;
	private String name;
	private int marks;
	private int fee;

	public Student(int id, String name, int marks, int fee) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.fee = fee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks
				+ ", fee=" + fee + "]";
	}

}