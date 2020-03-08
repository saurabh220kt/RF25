package testng;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class P1 {
	
	@Test
	public void banana() {
		Reporter.log("from P1 class banana()");//prints only in report
	}
	
	@Test
	public void a() {
		System.out.println("from P1 class a()");//prints only in console
	}
	@Test
	public void orange() {
		Reporter.log("from P1 class orange()",true);//prints both in report and console
	}
	
	
}
