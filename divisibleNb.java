//Create a function that checks if a number n is divisible by two numbers x AND y. All inputs are positive, non-zero digits.

public class DivisibleNb {
    public static Boolean isDivisible(long n, long x, long y) {
        return (n%x ==0) && (n%y ==0);
    }
  }
