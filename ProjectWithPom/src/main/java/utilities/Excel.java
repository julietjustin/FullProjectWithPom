package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	XSSFSheet sheet;
	public Excel() throws IOException {
		File path=new File("");
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook workBook=new XSSFWorkbook(file);
		sheet=workBook.getSheet("Sheet1");
	}
	public String read(int i,int j) {
		Row row=sheet.getRow(i);
		Cell cell=row.getCell(j);
		return cell.getStringCellValue();
	}
	

}
