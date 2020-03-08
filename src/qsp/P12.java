package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P12 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		WebElement day = driver.findElement(By.id("day"));
		Select s1=new Select(day);
		s1.selectByIndex(11);
		Thread.sleep(1000);
		WebElement month = driver.findElement(By.id("month"));
		Select s2=new Select(month);
		s2.selectByVisibleText("Aug");
		Thread.sleep(1000);
		WebElement year = driver.findElement(By.id("year"));
		Select s3=new Select(year);
		s3.selectByValue("1987");
		Thread.sleep(1000);
		driver.close();
	}

}
