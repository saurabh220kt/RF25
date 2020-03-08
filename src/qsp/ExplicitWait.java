package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.actitime.com/login.do");
		System.out.println(driver.getTitle());//1st page title
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		WebDriverWait wait=new WebDriverWait(driver,0);
		wait.until(ExpectedConditions.titleContains("Enter"));
		System.out.println(driver.getTitle());//2nd page title
		driver.findElement(By.id("logoutLink")).click();
		wait.until(ExpectedConditions.titleIs("actiTIME - Login"));
		System.out.println(driver.getTitle());
		driver.findElement(By.id("username")).sendKeys("abcd");

		driver.close();

	}

}
