/*Complete the function so that it finds the average of the three scores passed to it and returns the letter value associated with that grade. */


public class GrassHopper {

    public static char getGrade(int s1, int s2, int s3) {
        int avg = (s1 + s2 + s3) / 3;
        return avg > 89 ? 'A' : avg > 79 ? 'B' : avg > 69 ? 'C' : avg > 59 ? 'D' : 'F';
    }
}