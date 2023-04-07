package PARAMETERIEATION;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class VerifyCell {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Dell\\Documents\\FetchDataFromExcelSheet.xlsx");
		
	    CellType CT = WorkbookFactory.create(file).getSheet("FetchAllTable").getRow(0).getCell(1).getCellType();
	    
	    System.out.println(CT);
	}

}
