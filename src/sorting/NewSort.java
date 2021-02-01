package sorting;
import java.util.Arrays;
import java.util.Scanner;

public class NewSort {

	
		public static void main(String[] args) 
    {
      
     int n, sum = 0;
        Scanner s = new Scanner(System.in);
        
        n = s.nextInt();
        int array[] = new int[n];
     
        for(int i = 0; i < n; i++)
        {
            array[i] = s.nextInt();
            sum = sum + array[i];
        }
       
        quickSort( array, 0, array.length - 1 );
 
        System.out.println(Arrays.toString(array));
    }
 
    public static void quickSort(Integer[] arr, int low, int high) 
    {
        //check for empty or null array
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

		
}
