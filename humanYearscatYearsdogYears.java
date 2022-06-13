/*I have a cat and a dog.

I got them at the same time as kitten/puppy. That was humanYears years ago.

Return their respective ages now as [humanYears,catYears,dogYears]

NOTES:

humanYears >= 1
humanYears are whole numbers only
Cat Years
15 cat years for first year
+9 cat years for second year
+4 cat years for each year after that
Dog Years
15 dog years for first year
+9 dog years for second year
+5 dog years for each year after that
 */

public class Dinglemouse {

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
     
      int dogYears = 0;
      int catYears = 0;
      
      if(1 == humanYears ){
        dogYears = 15;
        catYears = 15;
      }
      if (2 == humanYears ){
        dogYears = 24;
        catYears = 24;
      }
      if ( humanYears > 2) {
        dogYears = (24 + (5 * (humanYears - 2)));
        catYears = (24 + ( 4 * (humanYears - 2)));
      }
      return new int[]{humanYears,catYears,dogYears};
    }
