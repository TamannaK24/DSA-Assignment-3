import java.util.Random;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in); 
        System.out.println("Enter a number of elements in the array: "); 
        int numElements = obj.nextInt();
        System.out.println("Enter the largest number for the range of numbers present in the array: "); 
        int numRange = obj.nextInt();

        int [] elements = new int[numElements]; 
        Random rand = new Random(); 
        for (int i = 0; i < numElements; i++) {
            elements[i] = rand.nextInt(numRange + 1); 
        }

        printArray(elements); 
        InsertionSort(elements); 

        obj.close(); 
    }     

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " "); 
        }
        System.out.println(" "); 
    }

    public static void InsertionSort(int[] arr) {
        int key; 
        for (int i = 1; i < arr.length; i++) {
            key = arr[i]; 
            for (int j = i-1; j >= 0; j--) { 
                if (key < arr[j]) {
                    arr[j+1] = arr[j]; 
                } 
                else {
                    break;   
                }
                arr[j] = key; 
            }
        }
        System.out.println("Insertion Sort:");
        printArray(arr); 
    }
}