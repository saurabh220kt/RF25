package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JATE1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException {
		String path = "./data/Book.xlsx";
		Workbook wb=WorkbookFactory.create(new FileInputStream(path));
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.actitime.com/login.do");
		SATE s1=new SATE(driver);
		for(int i=0;i<5;i++) {
			String usn = wb.getSheet("Sheet1").getRow(0).getCell(i).toString();
			String pwd=wb.getSheet("Sheet1").getRow(1).getCell(i).toString();
			s1.setUsername(usn);
			Thread.sleep(1000);
			s1.setPassword(pwd);
			Thread.sleep(1000);
			s1.clickLoginBtn();
			Thread.sleep(1000);
		}		
		driver.close();
		
	}

}
