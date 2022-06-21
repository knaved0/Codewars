//Replace all vowel to exclamation mark in the sentence. aeiouAEIOU is vowel.

public class Solution {
    public static String replace(final String s) {
     return s.replaceAll("[aeiouAEIOU]", "!"); 
     
    }
}