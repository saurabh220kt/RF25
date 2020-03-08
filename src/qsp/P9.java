package qsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P9 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		WebElement a = driver.findElement(By.name("q"));
		a.sendKeys("java");
		Thread.sleep(1000);//very important
		List<WebElement> allAutoSuggestions = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		System.out.println(allAutoSuggestions.size());
		for(WebElement e:allAutoSuggestions) {
			System.out.println(e.getText());
		}
		allAutoSuggestions.get(1).click();
		driver.close();
		

	}

}
