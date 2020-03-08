package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrwsr2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.actitime.com/login.do");
		String firstwh = driver.getWindowHandle();
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allWhs = driver.getWindowHandles();
		System.out.println(allWhs.size());
		for(String wh:allWhs) {
			if(firstwh.equals(wh)) {
				
			}
			else {
				driver.switchTo().window(wh);
				String secondpagetitle = driver.getTitle();
				System.out.println(secondpagetitle);	
			}
		}
		driver.quit();
	}
}
