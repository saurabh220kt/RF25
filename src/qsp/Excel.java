package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		String path = "./data/Book.xlsx";
		Workbook wb=WorkbookFactory.create(new FileInputStream(path));
		String v=wb.getSheet("Sheet1").getRow(0).getCell(0).toString();
		System.out.println(v);
		String w=wb.getSheet("Sheet1").getRow(1).getCell(0).toString();
		System.out.println(w);
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys(v);
		driver.findElement(By.name("pwd")).sendKeys(w);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		wb.write(new FileOutputStream(path));
		wb.close();
	}
}
