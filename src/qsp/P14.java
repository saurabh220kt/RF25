package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P14 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().deleteAllCookies();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("8660281165");
		driver.findElement(By.id("pass")).sendKeys("Nikki@123");
		driver.findElement(By.id("loginbutton")).click();
		WebDriverWait wait=new WebDriverWait(driver,0);
		wait.until(ExpectedConditions.titleContains("Facebook"));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//div[@id='userNavigationLabel']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[.='Log Out'])[2]")).click();
	}

}
