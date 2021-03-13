package TestNGSession;

import org.testng.annotations.Test;

public class TestNGAnnotation {
	
	String name="Hello";
	
	@Test(expectedExceptions = {ArithmeticException.class,NullPointerException.class})
	public void add()
	{
		System.out.println(name);
		
	
	}
}
