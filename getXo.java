//Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.

public class XO {

    public static boolean getXO(String str) {
        str = str.toLowerCase();
        return str.replace("o", "").length() == str.replace("x", "").length();

    }
}
