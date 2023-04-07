package PARAMETERIEATION;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintSingleRow {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Dell\\Documents\\FetchDataFromExcelSheet.xlsx");
		
	    Sheet sheet1 = WorkbookFactory.create(file).getSheet("Jignesh");
	    short cellsize = sheet1.getRow(0).getLastCellNum(); // range 128
	    // getLastCell liya kyoki usme kitne cell present he vo vaha tak jayega
	    
		System.out.println(cellsize);
		
		for(int i = 0; i<cellsize; i++) {
			
			String data = sheet1.getRow(0).getCell(i).getStringCellValue();
			
			// getRow always 0 and getCell(i) 1 to 7 tak iterate hoga.
			
			System.out.println(" " + data);
		}
	}

}
