package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://stagenget.irctc.co.in/eticketing/pageUnderConstruction.jsf");
		driver.findElement(By.className("loginUserId")).sendKeys("qwerty");
		driver.findElement(By.className("loginPassword")).sendKeys("abcdefgh");
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
