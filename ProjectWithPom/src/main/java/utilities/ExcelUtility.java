package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	public static XSSFWorkbook workBook;
	public static XSSFSheet sh;
	public static FileInputStream file;
	public ExcelUtility() throws IOException{
		File path=new File(System.getProperty("user.dir")+"\\src\\main\\java\\Resourse\\testdata.xlsx");
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		sh = workbook.getSheet("RadioButtonPage");//SelectPage,TablePage,FormSubmitPage
	}
	public String ReadDataFromExcel(int i,int j) {
		Row row=sh.getRow(i);
		Cell cell=row.getCell(j);
		return cell.getStringCellValue();//to give string value
	}
	/*public static ArrayList<String> getString(String file_path, String sheet) throws IOException {
		file = new FileInputStream(System.getProperty("user.dir") + file_path);
		workBook = new XSSFWorkbook(file);
		sh = workBook.getSheet(sheet);
		ArrayList<String> ExcelRows = new ArrayList<String>();
		int rowCount = sh.getLastRowNum() - sh.getFirstRowNum();
		for (int i = 0; i <= rowCount; i++) {
		Row row = sh.getRow(i);
		int cellCount = row.getLastCellNum();
		for (int j = 0; j < cellCount; j++) {
		ExcelRows.add(row.getCell(j).getStringCellValue());
		}
		}

		// f.close();
		return ExcelRows;

		}

		public static ArrayList<String> getRow(String file_path, String sheet, int rownum) throws IOException {
		file = new FileInputStream(System.getProperty("user.dir") + file_path);
		workBook = new XSSFWorkbook(file);
		sh = workBook.getSheet(sheet);
		ArrayList<String> ExcelRows = new ArrayList<String>();
		// int rowCount = sh.getLastRowNum() - sh.getFirstRowNum();

		Row row = sh.getRow(rownum);
		int cellCount = row.getLastCellNum();
		for (int j = 0; j < cellCount; j++) {
		ExcelRows.add(row.getCell(j).getStringCellValue());

		}

		// f.close();
		return ExcelRows;

		}

		public static String getString(int i, int j, String file_path, String RadioButton) throws IOException {
		file = new FileInputStream(System.getProperty("user.dir") +"\\src\\main\\java\\Resourse\\Book1.xlsx" );
		workBook = new XSSFWorkbook(file);
		sh = workBook.getSheet(RadioButton);
		Row r = sh.getRow(i);
		Cell c = r.getCell(j);
		return c.getStringCellValue();

		}

		public static String getNumeric(int i, int j, String file_path, String sheet) throws IOException {
		file = new FileInputStream(System.getProperty("user.dir") + file_path);
		workBook = new XSSFWorkbook(file);
		sh = workBook.getSheet(sheet);
		Row r = sh.getRow(i);
		Cell c = r.getCell(j);
		int value = (int) c.getNumericCellValue();
		return String.valueOf(value);

		}
	*/



}
