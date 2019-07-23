/** @author 
 * <Shukri ALi>
 * This class contains the solution for Worksheet1
 */

public class Worksheet1 {

	// Exercise 1
	/**
	 * power is a method that computes the value of 
	 * a number when raised by n exponent using a recursive method
	 * @param m is the base number as a non negative integer
	 * @param n is the exponent as a non negative integer
	 * @throws IllegalArgumentException if 0 is raised by zero as it is undefined
	 * @return returns 1 if the exponent is zero, else return zero if
	 * the base number is zero, else returns m raised by n
	 */
	public static int power(int m, int n) {
		
		if (n==0 && m==0)
			throw new IllegalArgumentException("0^0 is undefined");
		else if (n==0 && m>0)
			return 1;
		else if (n>0 && m==0)
			return 0; 
		else 
			return m*power(m, n-1);
	}
	/**
	 * fastPower is a method that computes the value of 
	 * a number when raised by n exponent using a recursive method
	 * it does this by dividing exponent by 2 and multiply the result by itself 
	 * @param m is the base number as a non negative integer
	 * @param n is the exponent as a non negative integer
	 * @throws IllegalArgumentException if 0 is raised by zero as it is undefined
	 * @return returns 1 if only the exponent is zero, else return zero if
	 * only the base number is zero, else returns
	 * if n is even number then n is divided by 2 and raises m recursively by it and 
	 * the result of that is multiplied by itself.
	 * else if n is not even the recursive method is applied to n-1 and that is then 
	 * multiplied by m.
	 */
	public static int fastPower(int m, int n) {
	
		if (n==0 && m==0)
			throw new IllegalArgumentException("0^0 is undefined");
		else if (n==0 && m>0)
			return 1; 
		else if (n>0 && m==0)
			return 0; 
		else if (n%2==0) {
			
			return fastPower(m*m, n/2);
		}
		else
			return fastPower(m,n-1)*m;
	}

	// Exercise 2
	/**
	 * negateAll is a method that converts the positives elements of a list to negative
	 * and negative elements to positive. 
	 * @param a is a list of integer elements
	 * @return returns an empty list if the list has no elements 
	 * else it returns a new list converting positive elements of the list into negatives and 
	 * negatives to positives
	 */
	public static List<Integer> negateAll(List<Integer> a) {

		if (a.isEmpty())
			return a;
		else 
			return new List<Integer>(a.getHead()*-1, negateAll(a.getTail())); //replace this by your code
	}

	// Exercise 3
	/**
	 * find is a method that finds the position of the first occurrence 
	 * of a number in a list. 
	 * @param x is the integer number that the method is trying to find
	 * @param a is the list of integer numbers
	 * @throws IllegalArgumentException if x is not in the list
	 * @return returns the position of the element if its in the list 
	 * on the first occurrence with the first element being in position 0
	 */
	public static int find(int x, List<Integer> a) {

		if (a.isEmpty())
			throw new IllegalArgumentException ("integer is not in the list");

		else if (x==a.getHead())
			return 0;

		else
			return 1+ find(x, a.getTail()); //replace this by your code
	}

	// Exercise 4
	/**
	 * allPositives is boolean method that checks whether all the elements
	 * of a list are positives
	 * @param a is a list with integer elements
	 * @return returns true if the list is empty or if all elements are 
	 * positives (greater or equal to zero), else it returns false if 
	 * any element of the list is a negative integer 
	 */
	public static boolean allPositive(List<Integer> a) {

		if (a.isEmpty())
			return true;

		else if (a.getHead()>=0)

			return allPositive(a.getTail());
		else 
			return false;
	}

	// Exercise 5
	/**
	 * positives is a method that returns all the positive elements
	 * of a list
	 * @param a is a list with integer elements
	 * @return returns an empty list if the list is empty or there are 
	 * no positive elements in the list, else it returns
	 * a new list with all the positive elements only
	 */
	public static List<Integer> positives(List<Integer> a) {

		if (a.isEmpty())
			return a;
		else if (a.getHead()>=0)
			return new List<Integer>(a.getHead(), positives(a.getTail()));
		else
			return positives(a.getTail());
	}

	// Exercise 6
	/**
	 * sorted is a boolean method that tests whether all the elements
	 * in a list are in an ascending order
	 * @param a is the list with integer elements
	 * @return returns true if the list is empty or contains only 
	 * 1 element or if all the elements are in an ascending order
	 * else it will return false.
	 */
	public static boolean sorted(List<Integer> a) {

		if (a.isEmpty())
			return true;
		else if (a.getTail().isEmpty())
			return true;
		else  if (a.getHead() <= a.getTail().getHead()) //replace this by your code
			return sorted(a.getTail());
		else
			return false;

	}

	// Exercise 7
	/**
	 * merge is a method that merges two lists in an ascending order
	 * @param a is a sorted list with an integer elements
	 * @param b is an another sorted list with an integer elements
	 * @return returns list b if list a is empty. returns list a if 
	 * list b is empty. if the first element of a is greater than the 
	 * first element of b then it returns 1 new list with list a elements followed 
	 * by list b elements and if not it will return elements of b followed by 
	 * elements of a
	 */
	public static List<Integer> merge(List<Integer> a, List<Integer> b) {
		if (a.isEmpty())
			return b;
		if (b.isEmpty())
			return a;
		else if (a.getHead() <= b.getHead())
			return new List<Integer>(a.getHead(), merge(a.getTail(), b)); //replace this by your code
		else 
			return new List<Integer>(b.getHead(), merge( b.getTail(), a));
	}

	// Exercise 8
	/**
	 * removeDuplicates is a method that removes all duplicates
	 * in a sorted list
	 * @param a is a list with integer elements
	 * @return returns an empty list if the list is empty, else if the list has
	 * only one element it returns a list with only that element
	 * else it returns a new list with all duplicates removed
	 */
	static List<Integer> removeDuplicates(List<Integer> a) {

		if (a.isEmpty() || a.getTail().isEmpty())
			return a;
		else if (a.getHead()==a.getTail().getHead())
			return removeDuplicates(a.getTail()); 
		else
			return new List<Integer>(a.getHead(), removeDuplicates(a.getTail()));
	}
}
