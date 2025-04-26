import java.util.Random;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        //opens scanner and creates object for memory collection
        Scanner obj = new Scanner(System.in);
        Runtime runtime = Runtime.getRuntime();  

        //prompts user
        System.out.println("Enter a number of elements in the array: ");
        int numElements = obj.nextInt();
        System.out.println("Enter the largest number for the range of numbers present in the array: ");
        int numRange = obj.nextInt();

        //creates array depending on data entered by user
        int[] elements = new int[numElements];
        Random rand = new Random();
        for (int i = 0; i < numElements; i++) {
            elements[i] = rand.nextInt(numRange + 1);
        }

        //prints out original array
        System.out.println("Original Array:");
        printArray(elements);

        //clones arrays to be modified by each sort
        int[] elementsForInsertion = elements.clone();
        int[] elementsForMerge = elements.clone();
        int[] elementsForHeap = elements.clone();
        int[] elementsForQuick = elements.clone();
        int[] elementsForQuick10 = elements.clone();
        int[] elementsForQuick50 = elements.clone();
        int[] elementsForQuick200 = elements.clone();

        System.out.println("---------------------------------------");

        //insertion sort
        //collects time and memory before and after sort and calculations for time and memory used
        runtime.gc();
        long memoryBeforeInsertion = runtime.totalMemory() - runtime.freeMemory();
        long startInsertion = System.nanoTime();
        insertionSort(elementsForInsertion, elementsForInsertion.length);
        long endInsertion = System.nanoTime();
        long memoryAfterInsertion = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Insertion Sort:");
        printArray(elementsForInsertion);
        System.out.println("Time: " + ((endInsertion - startInsertion) / 1_000_000.0) + " milliseconds");
        System.out.println("Memory: " + ((memoryAfterInsertion - memoryBeforeInsertion) / 1024.0) + " KB");

        System.out.println("---------------------------------------");

        //merge sort
        //collects time and memory before and after sort and calculations for time and memory used
        runtime.gc();
        long memoryBeforeMerge = runtime.totalMemory() - runtime.freeMemory();
        long startMerge = System.nanoTime();
        mergeSort(elementsForMerge, elementsForMerge.length);
        long endMerge = System.nanoTime();
        long memoryAfterMerge = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Merge Sort:");
        printArray(elementsForMerge);
        System.out.println("Time: " + ((endMerge - startMerge) / 1_000_000.0) + " milliseconds");
        System.out.println("Memory: " + ((memoryAfterMerge - memoryBeforeMerge) / 1024.0) + " KB");

        System.out.println("---------------------------------------");

        ///heap sort
        //collects time and memory before and after sort and calculations for time and memory used
        runtime.gc();
        long memoryBeforeHeap = runtime.totalMemory() - runtime.freeMemory();
        long startHeap = System.nanoTime();
        heapSort(elementsForHeap);
        long endHeap = System.nanoTime();
        long memoryAfterHeap = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Heap Sort:");
        printArray(elementsForHeap);
        System.out.println("Time: " + ((endHeap - startHeap) / 1_000_000.0) + " milliseconds");
        System.out.println("Memory: " + ((memoryAfterHeap - memoryBeforeHeap) / 1024.0) + " KB");

        System.out.println("---------------------------------------");

        //quick sort with no cutoff
        //collects time and memory before and after sort and calculations for time and memory used
        runtime.gc();
        long memoryBeforeQuick = runtime.totalMemory() - runtime.freeMemory();
        long startQuick = System.nanoTime();
        quickSort(elementsForQuick, 0, elementsForQuick.length - 1);
        long endQuick = System.nanoTime();
        long memoryAfterQuick = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Quick Sort (No Cutoff):");
        printArray(elementsForQuick);
        System.out.println("Time: " + ((endQuick - startQuick) / 1_000_000.0) + " milliseconds");
        System.out.println("Memory: " + ((memoryAfterQuick - memoryBeforeQuick) / 1024.0) + " KB");

        System.out.println("---------------------------------------");

        //quick sort with cutoff = 10
        //collects time and memory before and after sort and calculations for time and memory used
        runtime.gc();
        long memoryBeforeQuick10 = runtime.totalMemory() - runtime.freeMemory();
        long startQuick10 = System.nanoTime();
        quickSortWithCutoff(elementsForQuick10, 0, elementsForQuick10.length - 1, 10);
        long endQuick10 = System.nanoTime();
        long memoryAfterQuick10 = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Quick Sort (Cutoff = 10):");
        printArray(elementsForQuick10);
        System.out.println("Time: " + ((endQuick10 - startQuick10) / 1_000_000.0) + " milliseconds");
        System.out.println("Memory: " + ((memoryAfterQuick10 - memoryBeforeQuick10) / 1024.0) + " KB");

        System.out.println("---------------------------------------");

        //quick sort with cutoff = 50
        //collects time and memory before and after sort and calculations for time and memory used
        runtime.gc();
        long memoryBeforeQuick50 = runtime.totalMemory() - runtime.freeMemory();
        long startQuick50 = System.nanoTime();
        quickSortWithCutoff(elementsForQuick50, 0, elementsForQuick50.length - 1, 50);
        long endQuick50 = System.nanoTime();
        long memoryAfterQuick50 = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Quick Sort (Cutoff = 50):");
        printArray(elementsForQuick50);
        System.out.println("Time: " + ((endQuick50 - startQuick50) / 1_000_000.0) + " milliseconds");
        System.out.println("Memory: " + ((memoryAfterQuick50 - memoryBeforeQuick50) / 1024.0) + " KB");

        System.out.println("---------------------------------------");

        //quick sort with cutoff = 200
        //collects time and memory before and after sort and calculations for time and memory used
        runtime.gc();
        long memoryBeforeQuick200 = runtime.totalMemory() - runtime.freeMemory();
        long startQuick200 = System.nanoTime();
        quickSortWithCutoff(elementsForQuick200, 0, elementsForQuick200.length - 1, 200);
        long endQuick200 = System.nanoTime();
        long memoryAfterQuick200 = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Quick Sort (Cutoff = 200):");
        printArray(elementsForQuick200);
        System.out.println("Time: " + ((endQuick200 - startQuick200) / 1_000_000.0) + " milliseconds");
        System.out.println("Memory: " + ((memoryAfterQuick200 - memoryBeforeQuick200) / 1024.0) + " KB");

        obj.close();
    }

    //prints out the array
    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " "); 
        }
        System.out.println(" "); 
    }

    public static void insertionSort(int[] arr, int length) {
        //declares value to be used for sorting
        int key; 
        //cycles through array starting at the second element
        for (int i = 1; i < arr.length; i++) {
            //sets key to the current element
            key = arr[i]; 
            //cycles through the array backwards from the current element
            for (int j = i-1; j >= 0; j--) { 
                //if the current element is greater than the key, it shifts the current element to the right
                if (key < arr[j]) {
                    arr[j+1] = arr[j]; 
                } 
                //if the current element is less than or equal to the key, it places the key in the correct position
                else {
                    break;   
                }
                arr[j] = key; 
            }
        }
    }

    //merges two arrays together
    public static void merge(int[] arr, int[] left, int[] right, int l, int r) {
        int i = 0;
        int j = 0; 
        int k = 0; 

        //as long as neither arrays is finished, compare from both sides
        while(i < l && j < r) {
            //if the left side is less than or equal to the right side, place the left side in the array
            if (left[i] <= right[j])  {
                arr[k++] = left[i++]; 
            }
            //if the right side is less than the left side, place the right side in the array
            else {
                arr[k++] = right[j++];  
            }
        }

        //if there are left over elements in the left side, place them in the array
        while(i < l) {
            arr[k++] = left[i++]; 
        }

        //if there are left over elements in the right side, place them in the array
        while(j < r) {
            arr[k++] = right[j++]; 
        }
    }

    public static void mergeSort(int[] arr, int length) {
        //base case, if the array is less than or equal to 1, return
        if (length <= 1) {
            return; 
        } 

        //mid index of the array and then split into left and right half
        int mid = length/2; 
        int[] left = new int[mid];
        int[] right = new int[length - mid];
        
        //copy ekements from arr into left array
        for(int i = 0; i < mid; i++) {
            left[i] = arr[i]; 
        }

        //copy elements from arr into right array
        for (int i = mid; i < length; i++) {
            right[i - mid] = arr[i]; 
        }

        //recursively call mergeSort on the left and right arrays
        mergeSort(left, mid); 
        mergeSort(right, arr.length - mid); 

        //merge the two arrays together
        merge(arr, left, right, mid, length-mid); 
    }


    public static void quickSort(int[] arr, int low, int high) {
        //base cae, if the array is less than or equal to 1, return
        if (low < high) {
            //call partition to get the pivot index
            int pivotIndex = partition(arr, low, high);
            //recursively call quickSort on the left and right side of the pivot index
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }
    
    public static int partition(int[] arr, int low, int high) {
        //last element as pivot
        int pivot = arr[high]; 
        //boundary for the left side of the array
        int i = low - 1; 
    
        //checks every element beofre the pivot
        for (int j = low; j < high; j++) {
            //if current element is less than or equal to the pivot
            //then it should be moved to the left side of the array
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    
        //swap the pivot with the element right after the last small element
        //puts pivot in the correct position where left is smaller and right is greater
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
    
        //returns index of pivot
        return i + 1;
    }
    
    public static void quickSortWithCutoff(int[] arr, int low, int high, int cutoff) {
        //check if the size of the subarray if less than equal to cut off 
        //if so, use insertion sort instead of quick sort
        if (high - low + 1 <= cutoff) {
            insertionSortSegment(arr, low, high);
            return;
        }
    
        //normal quick sort process recursion
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSortWithCutoff(arr, low, pivotIndex - 1, cutoff);
            quickSortWithCutoff(arr, pivotIndex + 1, high, cutoff);
        }
    }

    
    public static void insertionSortSegment(int[] arr, int low, int high) {
        //insertion sort algorithm for a segment of the array
        for (int i = low + 1; i <= high; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= low && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void heapSort(int[] arr) {
        //number of elements in the array
        int n = arr.length;
    
        //build max heap
        //start from last nonleaf node and heapify each node
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    
        //extract elements from heap one by one
        //starting from the last element and swap it with the root
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
    
            //heapify the root element
            heapify(arr, i, 0);
        }
    }
    
    // To heapify a subtree rooted with node i which is an index in arr[], and n is size of heap
    public static void heapify(int[] arr, int n, int i) {
        //assume current node is largest
        int largest = i; 
        //left child index
        int left = 2 * i + 1; 
        //right child index
        int right = 2 * i + 2;
    
        //if left child exists and is greater than the root
        //then largesti s now left child
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
    
        //if right child exists and is greater than the root
        //then largest is now right child
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
    
        //if largest is not the root, swap parent with the largest child
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
    
            //fix the heap recursively
            heapify(arr, n, largest);
        }
    }    
}