package numbers;

import junit.framework.TestCase;

public class numbersTest extends TestCase {

	//@Test
	public void testAdd() {
		int num1 = 5;
		int num2 = 4;
		
		Object o = NumbersComplete.sum(num1,  num2);
		assert(o instanceof Integer);
		assert(o.equals(9));	
		
	}
	//@Test
	public void testSubtract() {
		int num1 = 5;
		int num2 = 4;
		
		Object o = NumbersComplete.subtract(num1,  num2);
		assert(o instanceof Integer);
		assert(o.equals(1));	
	}
	
	//@Test
	public void testDivide() {
		int num1 = 20;
		int num2 = 5;
		
		Object o = NumbersComplete.divide(num1,  num2);
		assert(o instanceof Integer);
		assert(o.equals(4));	
	}
	
	//@Test
	public void testMultiply() {
		int num1 = 5;
		int num2 = 4;
		
		Object o = NumbersComplete.multiply(num1,  num2);
		assert(o instanceof Integer);
		assert(o.equals(20));	
	}

}
