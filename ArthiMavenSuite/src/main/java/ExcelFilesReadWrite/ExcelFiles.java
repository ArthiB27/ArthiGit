package ExcelFilesReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelFiles {
//Excel File Read	
	//apache poi,apache poi ooxml,apache poi ooxml schema
	
	@Test
	public void re() throws IOException
	{
		File f=new File("C:\\Users\\hp\\Documents\\Heathcare sample1.xlsx");
		FileInputStream fis=new FileInputStream(f);
		//xlsx:XSSF
		//Xls:HSSF   
		
		//workbook
		XSSFWorkbook x= new XSSFWorkbook(fis);
		//sheet
		XSSFSheet sheet=x.getSheetAt(0);
		
		//number of rows
		System.out.println(sheet.getLastRowNum());
		//number of columns - specific about the row index
		short col=sheet.getRow(1).getLastCellNum();
		System.out.println("Number of columns in second row is"+col);
		
		//particular: know the row index and column index
		XSSFCell data = sheet.getRow(3).getCell(2);
		System.out.println(data);
		
		//4th row
		sheet.getRow(3).createCell(0).setCellValue("hii");
		FileOutputStream fos=new FileOutputStream(f);
		x.write(fos);
	}

}
