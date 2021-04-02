import java.util.Arrays;

/**
 * This class sorts an array, using the selection sort algorithm
 */
public class SelectionSorter {
  private int[] a;

  /**
      Constructs a selection sorter.
      @param anArray the array to sort
   */
   public SelectionSorter(int[] anArray)
   {
      a = anArray;}

  for(int i = 0;i<=(array.length)-1;i++){
  {
      int element = array[i];
      int j = i;
      System.out.println("Progress: " + Arrays.toString(array));
      while (j > 0 && array[j - 1] > element) {
        array[j] = array[j - 1];
        j = j - 1;
      }
      array[j] = element;
  }
}

