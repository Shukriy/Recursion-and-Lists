import static org.junit.Assert.*;

import org.junit.Test;

/** @author 
 *  <PUT YOUR NAME HERE>
 * This class contains the test cases for Worksheet1 solutions.
 *  <WRITE YOUR TEST CASES BELOW>
 */

public class Worksheet1Test {

	//public test
	@Test
	public void ex1Test1() {

		int m = 2;
		int n = 5;

		int expected = 32;
		int actual = Worksheet1.power(m,n);

		assertEquals(expected, actual);

	}
	@Test 
	public void ex1Test2() {

		int m = 2;
		int n = 5;

		int expected = 32;
		int actual = Worksheet1.fastPower(m,n);

		assertEquals(expected, actual);

	}
	@Test 
	public void ex1Test3() {

		int m = 4;
		int n = 4;

		int expected = 256;
		int actual = Worksheet1.power(m,n);

		assertEquals(expected, actual);

	}
	@Test 
	public void ex1Test4() {

		int m = 4;
		int n = 4;

		int expected = 256;
		int actual = Worksheet1.fastPower(m,n);

		assertEquals(expected, actual);

	}
	@Test 
	public void ex1Test5() {

		int m = 2;
		int n = 0;

		int expected = 1;
		int actual = Worksheet1.power(m,n);

		assertEquals(expected, actual);

	}
	@Test 
	public void ex1Test6() {

		int m = 2;
		int n = 0;

		int expected = 1;
		int actual = Worksheet1.fastPower(m,n);

		assertEquals(expected, actual);

	}

	@Test 
	public void ex1Test7() {

		int m = 0;
		int n = 2;

		int expected = 0;
		int actual = Worksheet1.power(m,n);

		assertEquals(expected, actual);

	}

	@Test 
	public void ex1Test8() {

		int m = 0;
		int n = 2;

		int expected = 0;
		int actual = Worksheet1.fastPower(m,n);

		assertEquals(expected, actual);

	}
	@Test (expected = IllegalArgumentException.class)
	public void ex1Test9() {

		int m = 0;
		int n = 0;
		Worksheet1.power(m,n);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void ex1Test10() {

		int m = 0;
		int n = 0;
		Worksheet1.fastPower(m,n);
	}


	@Test 
	public void ex2Test1() {

		List<Integer> L = new List<Integer>();
		L = new List<Integer>(8, L);
		L = new List<Integer>(3, L);
		L = new List<Integer>(-2, L);
		L = new List<Integer>(-1, L);

		List<Integer> expected = new List<Integer>();
		expected = new List<Integer>(-8, expected);
		expected = new List<Integer>(-3, expected);
		expected = new List<Integer>(2, expected);
		expected = new List<Integer>(1, expected);
		List<Integer> actual = Worksheet1.negateAll(L);

		assertEquals(actual, expected);
	}

	@Test 
	public void ex2Test2() {

		List<Integer> L = new List<Integer>();

		List<Integer> expected = new List<Integer>();

		List<Integer> actual = Worksheet1.negateAll(L);

		assertEquals(actual, expected);

	}

	@Test 
	public void ex2Test3() {

		List<Integer> L = new List<Integer>();
		L = new List<Integer>(0, L);

		List<Integer> expected = new List<Integer>();
		expected = new List<Integer>(0, expected);

		List<Integer> actual = Worksheet1.negateAll(L);

		assertEquals(actual, expected);

	}

	@Test 
	public void ex3Test1() {

		List<Integer> L = new List<Integer>();
		L = new List<Integer>(8, L);
		L = new List<Integer>(6, L);
		L = new List<Integer>(4, L);
		L = new List<Integer>(1, L);

		int x = 6;

		int expected = 2;
		int actual = Worksheet1.find(x,L);

		assertEquals(expected, actual);

	}

	@Test (expected = IllegalArgumentException.class)
	public void ex3Test2() {

		List<Integer> L = new List<Integer>();
		L = new List<Integer>(8, L);
		L = new List<Integer>(6, L);
		L = new List<Integer>(4, L);
		L = new List<Integer>(1, L);

		int x = 9;

		Worksheet1.find(x,L);
	}

	@Test (expected = IllegalArgumentException.class)
	public void ex3Test3() {

		List<Integer> L = new List<Integer>();

		int x = 6;

		Worksheet1.find(x,L);
	}
	@Test 
	public void ex3Test4() {

		List<Integer> L = new List<Integer>();
		L = new List<Integer>(1, L);
		L = new List<Integer>(1, L);
		L = new List<Integer>(1, L);
		L = new List<Integer>(1, L);

		int x = 1;

		int expected = 0;
		int actual = Worksheet1.find(x,L);

		assertEquals(expected, actual);

	}
	@Test 
	public void ex4Test1() {

		List<Integer> L = new List<Integer>();
		L = new List<Integer>(8, L);
		L = new List<Integer>(6, L);
		L = new List<Integer>(-4, L);
		L = new List<Integer>(1, L);

		boolean expected = false;
		boolean actual = Worksheet1.allPositive(L);

		assertEquals(expected, actual);
	}
	@Test 
	public void ex4Test2() {

		List<Integer> L = new List<Integer>();
		L = new List<Integer>(0, L);

		boolean expected = true;
		boolean actual = Worksheet1.allPositive(L);

		assertEquals(expected, actual);

	}

	@Test 
	public void ex4Test3() {

		List<Integer> L = new List<Integer>();


		boolean expected = true;
		boolean actual = Worksheet1.allPositive(L);

		assertEquals(expected, actual);
	}
	@Test 
	public void ex4Test4() {

		List<Integer> L = new List<Integer>();

		L = new List<Integer>(4, L);
		L = new List<Integer>(1, L);

		boolean expected = true;
		boolean actual = Worksheet1.allPositive(L);

		assertEquals(expected, actual);
	}

	@Test 
	public void ex5Test1() {

		List<Integer> L = new List<Integer>();
		L = new List<Integer>(8, L);
		L = new List<Integer>(-3, L);
		L = new List<Integer>(2, L);
		L = new List<Integer>(-1, L);

		List<Integer> expected = new List<Integer>();
		expected = new List<Integer>(8, expected);
		expected = new List<Integer>(2, expected);
		List<Integer> actual = Worksheet1.positives(L);

		assertEquals(actual, expected);
	}

	@Test 
	public void ex5Test2() {

		List<Integer> L = new List<Integer>();
		L = new List<Integer>(0, L);
		L = new List<Integer>(0, L);

		List<Integer> expected = new List<Integer>();
		expected = new List<Integer>(0, expected);
		expected = new List<Integer>(0, expected);
		List<Integer> actual = Worksheet1.positives(L);

		assertEquals(actual, expected);
	}

	@Test 
	public void ex5Test3() {

		List<Integer> L = new List<Integer>();
		L = new List<Integer>(-5, L);
		L = new List<Integer>(-3, L);

		List<Integer> expected = new List<Integer>();

		List<Integer> actual = Worksheet1.positives(L);

		assertEquals(actual, expected);

	}

	@Test 
	public void ex6Test1() {

		List<Integer> L = new List<Integer>();
		L = new List<Integer>(-4, L);
		L = new List<Integer>(1, L);
		L = new List<Integer>(-3, L);
		L = new List<Integer>(8, L);

		boolean expected = false;
		boolean actual = Worksheet1.sorted(L);

		assertEquals(expected, actual);

	}
	@Test 
	public void ex6Test2() {

		List<Integer> L = new List<Integer>();


		boolean expected = true;
		boolean actual = Worksheet1.sorted(L);

		assertEquals(expected, actual);

	}

	@Test 
	public void ex6Test3() {

		List<Integer> L = new List<Integer>();
		L = new List<Integer>(4, L);

		boolean expected = true;
		boolean actual = Worksheet1.sorted(L);

		assertEquals(expected, actual);

	}

	@Test 
	public void ex6Test4() {

		List<Integer> L = new List<Integer>();
		L = new List<Integer>(-4, L);
		L = new List<Integer>(-3, L);
		L = new List<Integer>(-2, L);
		L = new List<Integer>(-1, L);

		boolean expected = false;
		boolean actual = Worksheet1.sorted(L);

		assertEquals(expected, actual);
	}

	@Test 
	public void ex7Test1() {

		List<Integer> L = new List<Integer>();
		L = new List<Integer>(8, L);
		L = new List<Integer>(3, L);

		List<Integer> A = new List<Integer>();
		A = new List<Integer>(2, A);
		A = new List<Integer>(1, A);

		List<Integer> expected = new List<Integer>();
		expected = new List<Integer>(8, expected);
		expected = new List<Integer>(3, expected);
		expected = new List<Integer>(2, expected);
		expected = new List<Integer>(1, expected);
		List<Integer> actual = Worksheet1.merge(L, A);

		assertEquals(actual, expected);
	}

	@Test 
	public void ex7Test2() {

		List<Integer> L = new List<Integer>();

		List<Integer> A = new List<Integer>();
		A = new List<Integer>(2, A);
		A = new List<Integer>(1, A);

		List<Integer> expected = new List<Integer>();
		expected = new List<Integer>(2, expected);
		expected = new List<Integer>(1, expected);
		List<Integer> actual = Worksheet1.merge(L, A);

		assertEquals(actual, expected);
	}
	@Test 
	public void ex7Test3() {

		List<Integer> L = new List<Integer>();
		L = new List<Integer>(2, L);
		L = new List<Integer>(1, L);

		List<Integer> A = new List<Integer>();
		A = new List<Integer>(2, A);
		A = new List<Integer>(1, A);

		List<Integer> expected = new List<Integer>();
		expected = new List<Integer>(2, expected);
		expected = new List<Integer>(2, expected);
		expected = new List<Integer>(1, expected);
		expected = new List<Integer>(1, expected);
		List<Integer> actual = Worksheet1.merge(L, A);

		assertEquals(actual, expected);
	}

	@Test 
	public void ex7Test4() {

		List<Integer> L = new List<Integer>();

		List<Integer> A = new List<Integer>();

		List<Integer> expected = new List<Integer>();
		List<Integer> actual = Worksheet1.merge(L, A);

		assertEquals(actual, expected);
	}
	@Test 
	public void ex7Test5() {

		List<Integer> L = new List<Integer>();
		L = new List<Integer>(2, L);
		L = new List<Integer>(1, L);

		List<Integer> A = new List<Integer>();
		A = new List<Integer>(4, A);
		A = new List<Integer>(3, A);

		List<Integer> expected = new List<Integer>();
		expected = new List<Integer>(4, expected);
		expected = new List<Integer>(3, expected);
		expected = new List<Integer>(2, expected);
		expected = new List<Integer>(1, expected);
		List<Integer> actual = Worksheet1.merge(L, A);

		assertEquals(actual, expected);
	}
	@Test 
	public void ex8Test1() {

		List<Integer> L = new List<Integer>();
		L = new List<Integer>(4, L);
		L = new List<Integer>(4, L);
		L = new List<Integer>(2, L);
		L = new List<Integer>(2, L);
		L = new List<Integer>(1, L);

		List<Integer> expected = new List<Integer>();
		expected = new List<Integer>(4, expected);
		expected = new List<Integer>(2, expected);
		expected = new List<Integer>(1, expected);
		List<Integer> actual = Worksheet1.removeDuplicates(L);

		assertEquals(actual, expected);
	}
	@Test 
	public void ex8Test2() {

		List<Integer> L = new List<Integer>();
		L = new List<Integer>(4, L);

		List<Integer> expected = new List<Integer>();
		expected = new List<Integer>(4, expected);
		List<Integer> actual = Worksheet1.removeDuplicates(L);

		assertEquals(actual, expected);
	}
	@Test 
	public void ex8Test3() {

		List<Integer> L = new List<Integer>();
		L = new List<Integer>(0, L);
		L = new List<Integer>(0, L);
		L = new List<Integer>(0, L);

		List<Integer> expected = new List<Integer>();
		expected = new List<Integer>(0, expected);
		List<Integer> actual = Worksheet1.removeDuplicates(L);

		assertEquals(actual, expected);
	}
	@Test 
	public void ex8Test4() {

		List<Integer> L = new List<Integer>();

		List<Integer> expected = new List<Integer>();
		
		List<Integer> actual = Worksheet1.removeDuplicates(L);

		assertEquals(actual, expected);
	}
}
