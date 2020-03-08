package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class P20 {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException, InterruptedException {
		String path = "./data/qsp.xlsx";
		Workbook wb=WorkbookFactory.create(new FileInputStream(path));
		String usn;
		String pwd;
		for(int i=0;i<5;i++) {
			 usn = wb.getSheet("confidential").getRow(i).getCell(0).toString();
			 System.out.println(usn);
			 Thread.sleep(500);
			 pwd = wb.getSheet("confidential").getRow(i).getCell(1).toString();
			 System.out.println(pwd);
		}
	}

}
