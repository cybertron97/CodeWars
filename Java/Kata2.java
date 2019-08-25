/*

You get an array of numbers, return the sum of all of the positives ones.

Example [1,-4,7,12] => 1 + 7 + 12 = 20

Note: if there is nothing to sum, the sum is default to 0.

*/
public class Positive{

  public static int sum(int[] arr){
      int sum1 =0; 
        for (int i =0; i<arr.length; i++) 
          {
            if (arr[i]>0) 
            {
              sum1 +=arr[i];
            }
          }
    return sum1;
  }

}

/*

Other way : 
*/
import java.util.stream.IntStream;

public class Positive{ 
  public static int sum(int[] arr) 
  {
    return IntStream.of(arr).filter(x -> x > 0).sum();
   }

}

