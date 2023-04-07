package Practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.apache.poi.examples.hssf.usermodel.BigExample;


public class Test2 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException{

		FileInputStream file = new FileInputStream("C:\\Users\\Dell\\Documents\\FetchDataFromExcelSheet.xlsx");
		
		Sheet Sheet1 = WorkbookFactory.create(file).getSheet("FetchAllTable");
		
		for(int i=0; i<=Sheet1.getLastRowNum(); i++){
		
			for(int j=0; j<=Sheet1.getRow(i).getLastCellNum()-1; j++){
			
				Cell cellInfo = Sheet1.getRow(i).getCell(j);
				
				CellType CT = cellInfo.getCellType();
				
				if(CT == CellType.STRING){
					System.out.print(cellInfo.getStringCellValue() + "  ");
				}
				else if(CT == CellType.NUMERIC){
					System.out.print(cellInfo.getNumericCellValue() + "  ");
				}
				else if(CT == CellType.BOOLEAN){
					System.out.print(cellInfo.getBooleanCellValue() +  "  ");
				
				}
			}
			System.out.println();
		}
	}

}
