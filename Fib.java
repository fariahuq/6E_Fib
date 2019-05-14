/**
  Calculate Fibonacci number n
  3 implementations
  @precondition: n >= 1

  Use type "long" instead of "int", because rabbits.
 */

public class Fib {
    /**
      @return the nth Fibonacci number
              by implementing the recurrence relation
     */
    public static long fib_recurrence( int n) {
      if (n==1 || n==2) { //decision btwn base case + recursive case
        return 1; // solution to base case
      }
      else{
        return fib_recurrence(n-1) + fib_recurrence(n-2); // solution to recursive case
        // no leftovers
    }

     /* These are class methods because you do not need to store any instance variables.
    */


    /**
      @return the nth Fibonacci number
              calculated via the 8th-grade algorithm
     */
    public static long fib_grade8( int n) {
        long first = 1;
        long second = 1;
        long index = 3;
        if (n==1 || n==2) {
          return 1;
    }
      else {
        while (index <= n) {
          long sum = first + second;
          first = second;
          second = sum;
          index++
        }
        return second;
      }
    }
    /* Time complexity:
       Consider the size of the problem to be LINEAR.

       As the proxy for the time required, count n.

       Then cost of the the recurrence algorithm
       grows linearly
       as the size of the problem increases,
       because as n increases by 1, time is increased by a constant.
     */


    /**
      @return the nth Fibonacci number
              calculated via Binet's formula.
              Type is double so that this exercise can
              ignore rounding issues.
     */
    public static double fib_Binet( int n) {
        return (Math.pow(1 + Math.sqrt(5))/2, n) - Math.pow(1-(1 + Math.sqrt(5))/2, n)/Math.sqrt(5);
    }
    /* Time complexity:
       Consider the size of the problem to be constant.

       As the proxy for the time required, count 1.

       Then cost of the the recurrence algorithm
       does not grow
       as the size of the problem increases,
       because the value of n does not matter for this calculation.
     */
}
