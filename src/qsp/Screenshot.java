package qsp;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Screenshot {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src1=ts.getScreenshotAs(OutputType.FILE);
		File des1=new File("./photo/a1.png");
		FileUtils.copyFile(src1, des1);
		driver.findElement(By.id("email")).sendKeys("8660281165");
		driver.findElement(By.id("pass")).sendKeys("Nikki@123");
		driver.findElement(By.id("loginbutton")).click();
		File src2=ts.getScreenshotAs(OutputType.FILE);
		File des2=new File("./photo/a2.png");
		FileUtils.copyFile(src2, des2);
		driver.findElement(By.xpath("//div[@id='userNavigationLabel']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[.='Log Out'])[2]")).click();
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleContains("log -in or sign up"));
		File src3=ts.getScreenshotAs(OutputType.FILE);
		File des3=new File("./photo/a3.png");
		FileUtils.copyFile(src3, des3);
		driver.close();
	}

}
