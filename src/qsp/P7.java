package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P7 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		 List<WebElement> e = driver.findElements(By.xpath("//a"));
		 System.out.println(e.size());
		 for(int i=0;i<e.size();i++) {
			 System.out.println(e.get(i).getText());
		 }
		 Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("8660281165");
		driver.findElement(By.id("pass")).sendKeys("Nikki@321");
		driver.findElement(By.id("loginbutton")).click();
		 Thread.sleep(10000);
		 List<WebElement> z = driver.findElements(By.xpath("//a"));
		 System.out.println(z.size());
		 for(int j=0;j<z.size();j++) {
			 System.out.println(z.get(j).getText());
		 }
		 driver.close();
	}

}
