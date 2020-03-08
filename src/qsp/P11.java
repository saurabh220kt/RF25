package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P11 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Bhagyashri/Desktop/listbox.html");
		WebElement taj = driver.findElement(By.id("s1"));
		Select select1=new Select(taj);
		select1.selectByIndex(0);
		Thread.sleep(1000);
		select1.selectByVisibleText("Pasta");
		Thread.sleep(1000);
		select1.selectByValue("u");
		List<WebElement> myOptions = select1.getAllSelectedOptions();
		for(int j=0;j<myOptions.size();j++) {
			System.out.println(myOptions.get(j).getText());
		}
		Thread.sleep(1000);
		select1.deselectByIndex(3);
		Thread.sleep(1000);
		select1.deselectByValue("p");
		Thread.sleep(1000);
		select1.deselectByVisibleText("Dosa");
		List<WebElement> menu = select1.getOptions();
		for(int i=0;i<menu.size();i++) {
			System.out.println(menu.get(i).getText());
		}
		System.out.println(select1.isMultiple());
		WebElement JWM = driver.findElement(By.id("s2"));
		Select select2=new Select(JWM);
		System.out.println(select2.isMultiple());
		select2.deselectAll();
	}

}
