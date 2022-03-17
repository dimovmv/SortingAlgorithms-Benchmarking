package myPackage;

import java.util.Hashtable;

public class PrintResults {
	
	public static void printResults() {
	
	// define how many times we want to run each functions
    int numberOfIterationsToTest = 10;
    
 // define all of the sizes for the test array
    int[] arraySizes = {100, 250, 500, 750, 1000, 1250, 2500, 3750, 5000, 6250, 7500, 8750, 10000};
    
 // create hashtables to store the values of your test runs
    Hashtable<String, String> bubleSortResults = new Hashtable<String, String>();
    Hashtable<String, String> insertionSortResults = new Hashtable<String, String>();
    Hashtable<String, String> countingSortResults = new Hashtable<String, String>();
    Hashtable<String, String> heapSortResults = new Hashtable<String, String>();
    Hashtable<String, String> selectionSortResults = new Hashtable<String, String>();
    
 // loop through the sizes and run the tests
    for(int i = 0; i < arraySizes.length; i ++) {
        // get the array size
        int currentArraySize = arraySizes[i];
        // create a test array using the array size value
        int [] testArray = SortingAlgorithmsTester.randomArray(currentArraySize);
        
  // run the bubbleSort test
    double totalTimeBubbleSort = SortingAlgorithmsTester.testBubbleSort(testArray, numberOfIterationsToTest);
    double averageTimeBubleSort = SortingAlgorithmsTester.getAverageMilliseconds(totalTimeBubbleSort, numberOfIterationsToTest);
        // store the result in bubleSortResults
    bubleSortResults.put(String.format("%s", currentArraySize), String.format("%1$,.3f", averageTimeBubleSort));     
    
 // run the insertion sort test
    double totalTimeInsertionSort = SortingAlgorithmsTester.testInsertionSort(testArray, numberOfIterationsToTest);
    double averageTimeInsertionSort = SortingAlgorithmsTester.getAverageMilliseconds(totalTimeInsertionSort, numberOfIterationsToTest);
    // store the result in insertionSortResults
    insertionSortResults.put(String.format("%s", currentArraySize), String.format("%1$.3f", averageTimeInsertionSort));

 // run the counting sort test
    double totalTimeCountingSort = SortingAlgorithmsTester.testCountingSort(testArray, numberOfIterationsToTest);
    double averageTimeCountingSort = SortingAlgorithmsTester.getAverageMilliseconds(totalTimeCountingSort, numberOfIterationsToTest);
    // store the result in countingSortResults
    countingSortResults.put(String.format("%s", currentArraySize), String.format("%1$.3f", averageTimeCountingSort));	
	
 // run the heap sort test
    double totalTimeHeapSort = SortingAlgorithmsTester.testHeapSort(testArray, numberOfIterationsToTest);
    double averageTimeHeapSort = SortingAlgorithmsTester.getAverageMilliseconds(totalTimeHeapSort, numberOfIterationsToTest);
    // store the result in heapSortResults
    heapSortResults.put(String.format("%s", currentArraySize), String.format("%1$.3f", averageTimeHeapSort));	
	
 // run the selection sort test
    double totalTimeSelectionSort = SortingAlgorithmsTester.testSelectionSort(testArray, numberOfIterationsToTest);
    double averageTimeSelectionSort = SortingAlgorithmsTester.getAverageMilliseconds(totalTimeSelectionSort, numberOfIterationsToTest);
    // store the result in selectionSortResults
    selectionSortResults.put(String.format("%s", currentArraySize), String.format("%1$.3f", averageTimeSelectionSort));
    }

 // print table header
    SortingAlgorithmsTester.printTableHeader();
    // print each of the stored test results
    SortingAlgorithmsTester.printTestResults("bubbleSort", bubleSortResults);
    SortingAlgorithmsTester.printTestResults("insertionSort", insertionSortResults);
    SortingAlgorithmsTester.printTestResults("countingSort", countingSortResults);
    SortingAlgorithmsTester.printTestResults("heapSort", heapSortResults);
    SortingAlgorithmsTester.printTestResults("selectionSort", selectionSortResults);

	}
}
