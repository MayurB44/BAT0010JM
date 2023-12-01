package javapackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG2 {
	
	@Test
	public void h() {
		System.out.println("This is h test case Method");
	}
	
	@Test
	public void x() {
		System.out.println("This is x test case Method");

}
	//@BeforeMethod - it will execute before test case method
	
	@BeforeMethod
	public void f() {
		System.out.println(" f will execute before each test case method");

}
	@AfterMethod
	public void s() {
		System.out.println("s will execute After each test case method");
}
}
