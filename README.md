# Recursion-and-Lists
List computation done through recursion

Exercise 1: Powers of integers 

Code the two recursive algorithms discussed in class for raising integer m to the power of integer n (both nonnegative).
You can test them by checking to see if both the algorithms produce the same results.

Exercise 2: Negate a list 

Given a list of integers a, write a method that returns a new list with all the elements of a with sign negated, i.e.,
positive integers become negatives and negative integers become positives. Example:
      [2, -5, 8, 0] ==> [-2, 5, -8, 0]
      
Exercise 3: Searching for an element 

Given an integer x which is assumed to be in the list a, write a method that returns the position of the first
occurrence of x in a. Positions are counted as 0; 1; 2; : : :. If x does not appear in the list, you should throw an
IllegalArgumentException. Examples:
    x: 3 a: [7, 5, 3, 8] ==> 2
    x: 2 a: [7, 5, 3, 8] ==> IllegalArgumentException

Exercise 4: Check for positive

Given a list of integers a, return a boolean value indicating whether all its elements are positive, i.e.,  0.
Think: What should be returned if the list is empty?

Exercise 5: Find the positives

Given a list of integers a, return a new list which contains all the positive elements of a. The elements should
appear in the result in the same relative order as in a. Example:
    [2, 3, -5, 8, -2] ==> [2, 3, 8]
    
Exercise 6: Sortedness

Given a list of integers a, this method must return a boolean value indicating whether a is sorted in increasing
order. (There can be duplicate copies of elements. But, sortedness would require that all the duplicate copies
would appear together.)

Exercise 7: Merging

Given two sorted lists a and b, your method must return a new sorted list that contains all the elements of a and all
the elements of b. Any duplicate copies of elements in a or b or their combination are retained. Examples:
    a: [2, 5, 5, 8] b:[5, 7, 8, 9] ==> [2, 5, 5, 5, 7, 8, 8, 9]
    a: [2, 5, 5, 8] b:[9] ==> [2, 5, 5, 8, 9]
    
Exercise 8: Remove duplicates

Given a sorted list a, this method must return a copy of the list a with all duplicate copies removed. Example:
  [2, 5, 5, 5, 7, 8, 8, 9] ==> [2, 5, 7, 8, 9]
