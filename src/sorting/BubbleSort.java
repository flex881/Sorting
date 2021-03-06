package sorting;

import java.util.Scanner;

public class BubbleSort {

    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
 
  
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    // Driver method to test above
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int n, sum = 0;
        Scanner s = new Scanner(System.in);
    
        n = s.nextInt();
        int arr[] = new int[n];
      
        for(int i = 0; i < n; i++)
        {
            arr[i] = s.nextInt();
            sum = sum + arr[i];
        }
        
        
        
        
      
        ob.bubbleSort(arr);
        System.out.println("Sorted arry");
        ob.printArray(arr);
    }
}
