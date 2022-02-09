package Common_Functions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_GetData {
	
	String sheetName;
	String TestCaseName;
	

	public static void main(String[] args) throws IOException {
		getExcelData("SeleniumEasy","TCID_04");		
		}		 
	
	public static void getExcelData(String sheetName, String TestCaseName) throws IOException {
	
		
		//FIS is class in java.. Create fis object that can access and read any file on machine
		FileInputStream fis 	 = new FileInputStream("C:\\Work\\BlueStone_TestData.xlsx");		
		XSSFWorkbook 	workBook = new XSSFWorkbook(fis);
		XSSFSheet 	 	sheet    = workBook.getSheet(sheetName);
		int 			rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		
		for(int i=0;i<rowCount;i++)
		{
			Row row = sheet.getRow(i);
			if(row.getCell(0).getStringCellValue().equalsIgnoreCase(TestCaseName))
			{
				for(int j=0;j<row.getLastCellNum();j++)
				{
					System.out.println(row.getCell(j).getStringCellValue());
				}
				
				
			}
				
		}
		
				
	}
		
		
		
		
}		
		

	


