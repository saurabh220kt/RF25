package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P30 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("abcdefghijk");
		driver.findElement(By.xpath("//span[.='Next']")).click();
	}

}
