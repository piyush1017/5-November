package PARAMETERIEATION;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterieation {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Dell\\Documents\\FetchDataFromExcelSheet.xlsx");
		
//		String data = WorkbookFactory.create(file).getSheet("Jignesh")
//		.getRow(1).getCell(2).getStringCellValue();
//		System.out.println(data);
		
//		double name = WorkbookFactory.create(file).getSheet("Jignesh")
//				.getRow(2).getCell(3).getNumericCellValue();
//		
//		System.out.println(name);
		
//		 boolean value = WorkbookFactory.create(file).getSheet("Jignesh")
//				.getRow(3).getCell(5).getBooleanCellValue();
//	
//		System.out.println(value);
		
//		int lastRowNumber = WorkbookFactory.create(file).getSheet("Jignesh").getLastRowNum();
////				
//		System.out.println(lastRowNumber+1);
		
//		int lastCellNumber = WorkbookFactory.create(file).getSheet("Jignesh").getRow(2).getLastCellNum();
//		
//		System.out.println(lastCellNumber);
		
		
		// Conver numeric value into string
		String data1 = WorkbookFactory.create(file).getSheet("Jignesh")
				.getRow(2).getCell(3).getStringCellValue();
				System.out.println(data1);
		
		
	}

}
