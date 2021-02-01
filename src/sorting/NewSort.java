package sorting;
import java.util.Arrays;
import java.util.Scanner;

public class NewSort {

	
		

		class Main {

		
		  int partition(int array[], int low, int high) {

		 
		    int pivot = array[high];

		    int i = (low - 1);

		  
		    for (int j = low; j < high; j++) {

		     
		      if (array[j] <= pivot) {

		        i++;
		        int temp = array[i];
		        array[i] = array[j];
		        array[j] = temp;
		      }
		    }

		    int temp = array[i + 1];
		    array[i + 1] = array[high];
		    array[high] = temp;
		    return (i + 1);
		  }

		  void quickSort(int array[], int low, int high) {
		    if (low < high) {

		    
		      int pi = partition(array, low, high);

		     
		      quickSort(array, low, pi - 1);

		    
		      quickSort(array, pi + 1, high);
		    }
		  }

		
		  public void main(String args[]) {

		  
			  int n, sum = 0;
		        Scanner s = new Scanner(System.in);
		        System.out.print("Enter no. of elements you want in array:");
		        n = s.nextInt();
		        int data[] = new int[n];
		        
		        for(int i = 0; i < n; i++)
		        {
		            data[i] = s.nextInt();
		            sum = sum + data[i];
		        }
		    int size = data.length;

		   
		    Main qs = new Main();

		
		    qs.quickSort(data, 0, size - 1);
		    System.out.println("Sorted Array: ");
		    System.out.println(Arrays.toString(data));
		  }
		}
	}


