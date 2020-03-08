package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class P2 {
	@BeforeClass
	public void orange() {
		System.out.println("before class");
	}
	@AfterClass
	public void chickoo() {
		System.out.println("After class");
	}
	@BeforeMethod
	public void abc() {
		System.out.println("before method");
	}
	@BeforeTest
	public void papple() {
		System.out.println("before Test2");
	}
	@AfterTest
	public void capple() {
		System.out.println("after Test2");
	}
	@AfterMethod
	public void xyz() {
		System.out.println("after method");
	}
	
	@Test
	public void test1() {
		System.out.println("from test1 of P2 class");
	}
	@Test
	public void test2() {
		System.out.println("from test2 of P2 class");
	}

}
