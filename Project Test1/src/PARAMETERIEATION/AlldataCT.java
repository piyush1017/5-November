package PARAMETERIEATION;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AlldataCT {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Dell\\Documents\\FetchDataFromExcelSheet.xlsx");
		
	    Sheet sheet1 = WorkbookFactory.create(file).getSheet("FetchAllTable");
	    
	    for(int i =0; i<=sheet1.getLastRowNum(); i++) { // for last row
	    	
	    	for(int j =0; j<=sheet1.getRow(i).getLastCellNum()-1; j++) { // for last cell
	    		
	    		Cell cellinfo = sheet1.getRow(i).getCell(j); // fetch every single cell
	    		
	    		CellType CT = cellinfo.getCellType(); // return celltype means data datatype
	    		
	    		if(CT == CellType.STRING) {
	   	    	 System.out.print(cellinfo.getStringCellValue() + "  ");
	   	     	}
	   	     	else if(CT == CellType.NUMERIC) {
	   	    	 System.out.print(cellinfo.getNumericCellValue()+ "  ");
	   	     	}
	   	     	else if(CT == CellType.BOOLEAN) {
	   	    	 System.out.print(cellinfo.getBooleanCellValue()+ "  ");
	   	     	}
	    		
	    	}	
	    	System.out.println();
	    }
	}

}
