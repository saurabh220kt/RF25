package testng1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class P1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	WebDriver driver;
	@Test
	public void test1() {
		String expected = "booooooogle";
		String actual=driver.getTitle();
		if(actual.equals(expected)) {
			Reporter.log("test is passed",true);		
		}
		else {
			Reporter.log("test is failed",true);
			Assert.fail();
		}
 	}
	@Test
	public void test2() {
		System.out.println("from test2");
	}
	
	@BeforeMethod
	public void start() {
		 driver=new ChromeDriver();
		driver.get("http://www.google.com");
	}
	@AfterMethod
	public void close() {
		driver.close();
	}
}
