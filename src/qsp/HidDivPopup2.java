package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HidDivPopup2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.religarehealthinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123456erg");
		driver.findElement(By.id("dob")).click();
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
		Select s1=new Select(month);
		s1.selectByVisibleText("Aug");
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
		Select s2=new Select(year);
		s2.selectByVisibleText("1975");
		Thread.sleep(2000);
		driver.findElement(By.linkText("26")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'alternative')]")).sendKeys("9876543210");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Lets Renew']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
