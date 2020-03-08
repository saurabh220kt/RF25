package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P10 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");	
		List<WebElement> e = driver.findElements(By.xpath("//a"));
		System.out.println(e.size());
		for(int i=0;i<e.size();i++) {
			System.out.println(e.get(i).getText());
		}
		driver.close();
	}

}
