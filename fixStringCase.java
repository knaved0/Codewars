/*In this Kata, you will be given a string that may have mixed uppercase and lowercase letters and your task is to convert that string to either lowercase only or uppercase only based on:

make as few changes as possible.
if the string contains equal number of uppercase and lowercase letters, convert the string to lowercase. */

public class fixStringCase {
    public static String solve(final String str) {
        int uppercase = 0, lowercase = 0;
        for (int i = 0; i < str.length(); i++) {

            if (Character.isLowerCase(str.charAt(i))) {
                lowercase++;
            } else if (Character.isUpperCase(str.charAt(i))) {
                uppercase++;
            }
        }
        if (lowercase >= uppercase)
            return str.toLowerCase();
        else
            return str.toUpperCase();
    }
}