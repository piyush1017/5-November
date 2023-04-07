package PARAMETERIEATION;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintSingleCell {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Dell\\Documents\\FetchDataFromExcelSheet.xlsx");
		
	    Sheet sheet1 = WorkbookFactory.create(file).getSheet("Jignesh");
	    short cellsize = sheet1.getRow(2).getLastCellNum(); // range 128
	    
		System.out.println(cellsize);
		
		for(int i = 0; i<cellsize-1; i++) {
			
			String data = sheet1.getRow(i).getCell(0).getStringCellValue();
			
			System.out.println(" " + data);
		}
	}

}
