//selection sort

public class Q5 {
   public static void main(String args[]){
      int array[] = {19, 43, 15, 73, 96, 57};
      

      for (int i = 0 ;i<array.length-1; i++){
         int min = i;

         for (int j = i+1; j<array.length; j++){
            if (array[j] < array[min]){
            min = j;
            }
         }
         int temp = array[min];
         array[min] = array[i];
         array[i] = temp;
      }

      for (int i = 0 ;i<array.length; i++){
         System.out.print(array[i]+ " ");
      }
   }  
}

