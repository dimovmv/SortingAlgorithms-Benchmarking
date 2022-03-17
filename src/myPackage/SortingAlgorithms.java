package myPackage;

public class SortingAlgorithms {
	
	//BUBBLE SORT
			public static void bubbleSort(int[] a) {        //method takes as input an array of integers
				int outer, inner;                             //declaring variables
				for (outer = a.length -1; outer > 0; outer--) { //decrements the outer value
					for (inner = 0; inner < outer; inner++) { //moving inner to the right (bubbling up)
						if (a[inner] > a[inner + 1]) { //comparing two adjacent elements 
							int temp = a[inner];  //  declaring temporarily variable, used to swapping them if they are not in correct order
							a[inner] = a[inner + 1];
							a[inner + 1] = temp;
						}
					}
				}
			}	
				
			//INSERTION SORT
			public static void insertionSort(int a[]) { //method takes as input an array of integers
				for (int i=1; i<a.length; i++) {       //increasing the value of the index  
					int key = a[i]; //determining the value of key   
					int j = i-1;  //index that check all of the element that are on the left of the key
					//move all elements to the right with one position
					while (j>=0 && a[j] > key) {
						a[j+1] = a[j];
						j = j-1;  //decrementing j by 1
					}
					a[j+1] = key; //inserting the key in its new position
				}
			}
			
			// COUNTING SORT
			public static void countingSort(int[] a) { //method takes as input an array of integers
		        int arrayLength = a.length;
		        if (arrayLength == 0)
		            return;
		        // find maximum and minimum values 
		        int max = a[0], min = a[0];  //declaring variables
		        for (int i = 1; i < arrayLength; i++) {  //increasing value of the index
		            if (a[i] > max)
		                max = a[i];
		            if (a[i] < min)
		                min = a[i];
		        }
		        int range = max - min + 1;

		        int[] count = new int[range];
		        // initialize the occurrence of each element in the count array 
		        for (int i = 0; i < arrayLength; i++)
		            count[a[i] - min]++;
		        // calculating the sum of indexes 
		        for (int i = 1; i < range; i++)
		            count[i] += count[i - 1];
		        // modify original array according to the sum count 
		        int j = 0;
		        for (int i = 0; i < range; i++)
		            while (j < count[i])
		                a[j++] = i + min;
			} 
				    
		    //HEAP SORT
		    public static void heapSort(int [] a) //method takes as input an array of integers
		    {
		        int n = a.length;
		  
		        // Build Max heap and rearrange the array
		        for (int i = n / 2 - 1; i >= 0; i--) //Defining the starting point
		            heapify(a, n, i);
		  
		        // Removing the element from heap one by one
		        for (int i=n-1; i>=0; i--)
		        {
		            // Move current root to end of the array
		            int temp = a[0];
		            a[0] = a[i];
		            a[i] = temp;
		  
		            // call max heapify on the reduced heap
		            heapify(a, i, 0);
		        }
		    }
		  
		    // To heapify a subtree rooted with node i which is an index in a[]. n is size of the heap
		   static void heapify(int [] a, int n, int i)
		    {
		        int largest = i;  // Initialize largest as root
		        int l = 2*i + 1;  // left = 2*i + 1
		        int r = 2*i + 2;  // right = 2*i + 2
		  
		        // If left child is larger than root
		        if (l < n && a[l] > a[largest])
		            largest = l;
		  
		        // If right child is larger than largest so far
		        if (r < n && a[r] > a[largest])
		            largest = r;
		  
		        // If largest is not root
		        if (largest != i)
		        {
		            int swap = a[i];
		            a[i] = a[largest];
		            a[largest] = swap;
		  
		            // Recursively heapify the affected sub-tree
		            heapify(a, n, largest);
		        }    
		    }    
		  
		    //SELECTION SORT
		    public static void selectionSort(int [] a) { //method takes as input an array of integers
		    	int outer = 0, inner = 0, min = 0 ;  //declaring variables
		    	for (outer = 0; outer < a.length - 1; outer++) { //outer value incrementing
		    		min = outer;
		    		for (inner = outer +1; inner <a.length; inner++) {  //inner value incrementing
		    			if (a[inner] < a[min]) { //comparing inner to min to find the smallest value
		    				min = inner;
		    			}
		    		}
		    		//declaring temporarily variable, which is used to swap  a[min] with a[outer]
		    		int temp = a[outer];
		    		a[outer] = a[min];
		    		a[min] = temp;
		    	}
		    }	

}
