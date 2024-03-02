package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class HandlingExcel {

public static void main(String[] args) throws EncryptedDocumentException, IOException {
	

	FileInputStream fis=new FileInputStream("./data/TestScript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String data=wb.getSheet("CreateCustomer").getRow(0).getCell(0).getStringCellValue();
	System.out.println(data);
	
}
}
