//Complete the solution so that it reverses the string passed into it.

public class Kata {

    public static String solution(String str) {
      StringBuilder sb = new StringBuilder(str);
      sb.reverse();
      return sb.toString();
    }
  
  }
