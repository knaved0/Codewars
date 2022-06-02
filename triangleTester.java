/*Implement a function that accepts 3 integer values a, b, c. The function should return true if a triangle can be built with the sides of given length and false in any other case. */

public class triangleTester{
    public static boolean isTriangle(int a, int b, int c){
    
        if (((a+b)>c)&&((b+c)>a)&&((c+a)>b)) return true;
        else return false;
    }
  }