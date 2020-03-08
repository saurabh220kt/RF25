package testng1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class P2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	WebDriver driver;
	
	@Test
	public void t1() {
		SoftAssert s=new SoftAssert();
		Reporter.log("t1 starts",true);
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
		s.assertEquals("Google", "boooogle");//failed
		Reporter.log("t1 ends",true);//this stmt is not executed
		s.assertAll();
	}
	@Test
	public void t2() {
		Reporter.log("t2 starts",true);
		Reporter.log("t2 ends",true);
	}
}
