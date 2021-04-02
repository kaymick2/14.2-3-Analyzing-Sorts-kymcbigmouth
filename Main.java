import java.util.Scanner;
import java.util.Arrays;

/**
   This program measures how long it takes to sort an
   array of a user-specified size with the selection
   sort algorithm.
*/
public class Main
{  
   public static void main(String[] args)
   {  
      Scanner in = new Scanner(System.in);
      System.out.print("Enter array size: ");
      int n = in.nextInt();

      // Construct random array
   
      int[] array = ArrayUtil.randomIntArray(n, 100);
      
      // Use stopwatch to time selection sort
      
      StopWatch timer = new StopWatch();
      
      timer.start();
    for (int i = 0; i <= (array.length) - 1; i++) {
      int element = array[i];
      int j = i;
      while (j > 0 && array[j - 1] > element) {
        array[j] = array[j - 1];
        j = j - 1;
      }
      array[j] = element;
    }
      timer.stop();
      
      System.out.println("Elapsed time: " 
            + timer.getElapsedTime() + " milliseconds");
   }
}

   
