package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrwsrPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.naukri.com");
		String parent = driver.getWindowHandle();
		Set<String> allBrowsers = driver.getWindowHandles();
		for(String wh:allBrowsers) {
				driver.switchTo().window(wh);
				System.out.println(driver.getTitle());
				Thread.sleep(1000);
				driver.close();
				
		}	
	}
}
