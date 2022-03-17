package myPackage;

import java.util.Hashtable;

public class SortingAlgorithmsTester {
	
//Generating Random Array 
		static int [] randomArray ( int n){
			int [] a = new int [n ];
			for ( int i = 0; i < n ; i ++) {
			a [i] = ( int ) ( Math.random () * 100) ;
			}
			return a ;
			}
		
		
		// testing Bubble sort
	    public static double testBubbleSort(int[] a, int numberOfIterations) {
	        // store current time
	        long startTime = System.nanoTime();
	       
	        // run the test n times based on the value passed in the second parameter `numberOfIterations`
	        for(int i = 0; i < numberOfIterations; i ++) {
	        	SortingAlgorithms.bubbleSort(a);
	        }

	        // get the end time now after all tests have completed
	        long endTime = System.nanoTime();

	        // return the time passed
	        return endTime - startTime;
	    }
	    
	    
	 // testing Insertion sort
	    public static double testInsertionSort(int[] a, int numberOfIterations) {
	        // store current time
	        long startTime = System.nanoTime();
	       
	        // run the test n times based on the value passed in the second parameter `numberOfIterations`
	        for(int i = 0; i < numberOfIterations; i ++) {
	            SortingAlgorithms.insertionSort(a);
	        }

	        // get the end time now after all tests have completed
	        long endTime = System.nanoTime();

	        // return the time passed
	        return endTime - startTime;
	    }
	    
		
	 // testing Counting sort
	    public static double testCountingSort(int[] a, int numberOfIterations) {
	        // store current time
	        long startTime = System.nanoTime();
	       
	        // run the test n times based on the value passed in the second parameter `numberOfIterations`
	        for(int i = 0; i < numberOfIterations; i ++) {
	        	SortingAlgorithms.countingSort(a);
	        }

	        // get the end time now after all tests have completed
	        long endTime = System.nanoTime();

	        // return the time passed
	        return endTime - startTime;
	    }
	    
	    
	 // testing Heap sort
	    public static double testHeapSort(int[] a, int numberOfIterations) {
	        // store current time
	        long startTime = System.nanoTime();
	       
	        // run the test n times based on the value passed in the second parameter `numberOfIterations`
	        for(int i = 0; i < numberOfIterations; i ++) {
	        	SortingAlgorithms.heapSort(a);
	        }

	        // get the end time now after all tests have completed
	        long endTime = System.nanoTime();

	        // return the time passed
	        return endTime - startTime;
	    }
	    
	    
	 // testing Selection sort
	    public static double testSelectionSort(int[] a, int numberOfIterations) {
	        // store current time
	        long startTime = System.nanoTime();
	       
	        // run the test n times based on the value passed in the second parameter `numberOfIterations`
	        for(int i = 0; i < numberOfIterations; i ++) {
	        	SortingAlgorithms.selectionSort(a);
	        }

	        // get the end time now after all tests have completed
	        long endTime = System.nanoTime();

	        // return the time passed
	        return endTime - startTime;
	    }
	    
	    // convert total time to average in milliseconds
	    public static double getAverageMilliseconds(double totalTime, int runs) {
	        return (totalTime / runs) / 1000000;
	    }
	    
	    
	 // prints the result table header
	    public static void printTableHeader() {
	        System.out.format("%-20s%-9d%-9d%-9d%-9d%-9d%-9d%-9d%-9d%-9d%-9d%-9d%-9d%-9d\n", "size", 100, 250, 500, 750, 1000, 1250, 2500, 3750, 5000, 6250, 7500, 8750, 10000);
	    }
	    
	    
	 // prints the stored method values
	    public static void printTestResults(String method, Hashtable<String, String> values) {
	        System.out.format("%-20s%-9s%-9s%-9s%-9s%-9s%-9s%-9s%-9s%-9s%-9s%-9s%-9s%-9s\n",
	        method,
	        values.get("100"),
	        values.get("250"),
	        values.get("500"),
	        values.get("750"),
	        values.get("1000"),
	        values.get("1250"),
	        values.get("2500"),
	        values.get("3750"),
	        values.get("5000"),
	        values.get("6250"),
	        values.get("7500"),
	        values.get("8750"),
	        values.get("10000"));
	    }

}
