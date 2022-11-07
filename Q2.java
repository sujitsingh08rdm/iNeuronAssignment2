
import java.util.*;
//quick sort
public class Q2 
{
  public static void main(String[] args) 
  {
    
    Integer[] array = new Integer[] { 15, 23, 29, 6, 8, 7, 50, 30 };
 
    quickSort( array, 0, array.length - 1 );
 
    System.out.println(Arrays.toString(array));
  }
 
  public static void quickSort(Integer[] arr, int low, int high) 
  {
   
    if (arr == null || arr.length == 0){
      return;
    }
     
    if (low >= high){
      return;
    }
 
    
    int middle = low + (high - low) / 2;
    int pivot = arr[middle];
 
    int i = low, j = high;
    while (i <= j) 
    {
      
      while (arr[i] < pivot) 
      {
        i++;
      }
     
      while (arr[j] > pivot) 
      {
        j--;
      }
     
      if (i <= j) 
      {
        swap (arr, i, j);
        i++;
        j--;
      }
    }
   
    if (low < j){
      quickSort(arr, low, j);
    }
    if (high > i){
      quickSort(arr, i, high);
    }
  }
   
  public static void swap (Integer array[], int x, int y)
    {
    int temp = array[x];
    array[x] = array[y];
    array[y] = temp;
    }
}