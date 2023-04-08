package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class stringCellValue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\praju\\OneDrive\\Documents\\Book3.xlsx");
		Sheet sheet3 = WorkbookFactory.create(file).getSheet("Sheet1");
		
		for(int j = 0; j<= sheet3.getLastRowNum();j++) {
			for(int i = 0; i<=sheet3.getRow(j).getLastCellNum()-1;i++) {
				Cell cellinfo = sheet3.getRow(j).getCell(i);
				CellType CT = cellinfo.getCellType();
				if(CT==CellType.STRING) {
					System.out.print(cellinfo.getStringCellValue()+" ");
				}
				else if (CT==CellType.NUMERIC) {
					System.out.print(cellinfo.getNumericCellValue()+" ");
				}
				else if (CT==CellType.BOOLEAN) {
					System.out.print(cellinfo.getBooleanCellValue()+" ");
					
				}
				//System.out.println();
			}
			System.out.println();
		}

	}

}
