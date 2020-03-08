package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Bhagyashri/Desktop/A1.html");
		driver.findElement(By.tagName("input")).sendKeys("abcd");
		driver.findElement(By.id("t2")).sendKeys("xyz");
		Thread.sleep(1000);
		driver.findElement(By.className("h1")).sendKeys("123");
		Thread.sleep(1000);
		driver.findElement(By.name("n1")).sendKeys(" mnopqrst");
		driver.findElement(By.linkText("FACEBOOK")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("asha")).click();
		driver.navigate().back();
		driver.close();
		
	}

}
