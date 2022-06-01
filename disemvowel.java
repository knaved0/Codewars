//Your task is to write a function that takes a string and return a new string with all vowels removed.

public class Troll {
    public static String disemvowel(String str) {
      String strRes, vowels;
      char ch;
      int i, count, k;
      strRes="";
      vowels = "aeiouAEIOU";
      for(i=0; i<str.length(); i++)
      {
         count=0;
         ch = str.charAt(i);
         for(k=0; k<vowels.length(); k++)
         {
            if(ch==vowels.charAt(k))
               count++;
         }
         if(count==0)
            strRes = strRes + ch;
      }
      return strRes;
    }