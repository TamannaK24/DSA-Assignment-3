# DSA-Assignment-3
Array Sorting Algorithms

1. Insertion Sort
- sorts each array by inserting in element into correct position relevant to element before
- good for small sorted arrays
- best case, (Already sorted) O(n)
- worst case, (Reverse order) O(n^2)

2. Merge Sort
- divide and conquer algorithm, divides arrays by halves, sorts half, then merges
- O(logn) time complexity because splitting occurs at O(logn) rate

3. Merge
- combines two sorted subarrays into one sort
- O(n) linar time complexity

4. Quick Sort
- sorts by picking pivot and parititioning array around its elements
- recursively sorts left and right sides
- best case O(logn)
- worst case (pivot ends up being smallest or largest repetedly in recursion calls) O(n^2)

5. Partition
- Rearranges array order accordingto pivot where smallest elements are on the left and bigger ones are on the right
- O(n) time

6. Quick sort with cut off
- Same as quick sort but swtiches to insertion sort at cutoff
- O(logn) like quick sort

7. Insertion Sort Segment
- part of the array is used for insertion sort
- O(n^2) where n is the size of the segment

8. Heap sort
- turns array into min heap and then extracts minimums one by one to build sorting array
- O(logn) time complexity because build heap takes O(n) and heapify takes O(logn)

9. Heapify 
- maintains max heap property ensuring the the parent node is larger tha children 
- O(logn) worse case bubbling down to leaf node
- O(1) heapify already satisfied 

Output:
Enter a number of elements in the array: 
100
Enter the largest number for the range of numbers present in the array: 
10
Original Array:
1 4 7 1 8 2 0 0 5 10 7 8 1 0 6 3 3 6 7 7 1 5 4 4 4 0 2 0 5 6 5 6 3 3 0 6 8 10 7 1 0 1 3 7 1 4 7 3 9 4 9 0 8 1 5 4 2 2 5 8 7 6 2 4 4 4 10 0 4 1 7 2 10 1 3 0 6 6 5 1 0 4 9 9 2 8 4 5 4 6 1 9 6 2 9 10 7 9 8 7  
---------------------------------------
Insertion Sort:
0 0 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1 1 1 1 2 2 2 2 2 2 2 2 3 3 3 3 3 3 3 4 4 4 4 4 4 4 4 4 4 4 4 4 4 5 5 5 5 5 5 5 5 6 6 6 6 6 6 6 6 6 6 7 7 7 7 7 7 7 7 7 7 7 8 8 8 8 8 8 8 9 9 9 9 9 9 9 10 10 10 10 10  
Time: 0.1474 milliseconds
Memory: 0.0 KB
---------------------------------------
Merge Sort:
0 0 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1 1 1 1 2 2 2 2 2 2 2 2 3 3 3 3 3 3 3 4 4 4 4 4 4 4 4 4 4 4 4 4 4 5 5 5 5 5 5 5 5 6 6 6 6 6 6 6 6 6 6 7 7 7 7 7 7 7 7 7 7 7 8 8 8 8 8 8 8 9 9 9 9 9 9 9 10 10 10 10 10
Time: 0.1483 milliseconds
Memory: 1290.4453125 KB
---------------------------------------
Heap Sort:
0 0 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1 1 1 1 2 2 2 2 2 2 2 2 3 3 3 3 3 3 3 4 4 4 4 4 4 4 4 4 4 4 4 4 4 5 5 5 5 5 5 5 5 6 6 6 6 6 6 6 6 6 6 7 7 7 7 7 7 7 7 7 7 7 8 8 8 8 8 8 8 9 9 9 9 9 9 9 10 10 10 10 10
Time: 0.2208 milliseconds
Memory: 0.0 KB
---------------------------------------
Quick Sort (No Cutoff):
0 0 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1 1 1 1 2 2 2 2 2 2 2 2 3 3 3 3 3 3 3 4 4 4 4 4 4 4 4 4 4 4 4 4 4 5 5 5 5 5 5 5 5 6 6 6 6 6 6 6 6 6 6 7 7 7 7 7 7 7 7 7 7 7 8 8 8 8 8 8 8 9 9 9 9 9 9 9 10 10 10 10 10
Time: 0.0496 milliseconds
Memory: 0.0 KB
---------------------------------------
Quick Sort (Cutoff = 10):
0 0 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1 1 1 1 2 2 2 2 2 2 2 2 3 3 3 3 3 3 3 4 4 4 4 4 4 4 4 4 4 4 4 4 4 5 5 5 5 5 5 5 5 6 6 6 6 6 6 6 6 6 6 7 7 7 7 7 7 7 7 7 7 7 8 8 8 8 8 8 8 9 9 9 9 9 9 9 10 10 10 10 10
Time: 0.1363 milliseconds
Memory: 0.0 KB
---------------------------------------
Quick Sort (Cutoff = 50):
0 0 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1 1 1 1 2 2 2 2 2 2 2 2 3 3 3 3 3 3 3 4 4 4 4 4 4 4 4 4 4 4 4 4 4 5 5 5 5 5 5 5 5 6 6 6 6 6 6 6 6 6 6 7 7 7 7 7 7 7 7 7 7 7 8 8 8 8 8 8 8 9 9 9 9 9 9 9 10 10 10 10 10
Time: 0.0762 milliseconds
Memory: 0.0 KB
---------------------------------------
Quick Sort (Cutoff = 200):
0 0 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1 1 1 1 2 2 2 2 2 2 2 2 3 3 3 3 3 3 3 4 4 4 4 4 4 4 4 4 4 4 4 4 4 5 5 5 5 5 5 5 5 6 6 6  3 3 3 3 3 3 4 4 4 4 4 4 4 4 4 4 4 4 4 4 5 5 5 5 5 5 5 5 6 6 6 6 6 6 6 6 6 6 7 7 7 7 7 7 7 7 7 7 7 8 8 8 8 8 8 8 9 9 9 9 9 9 9 10 10 10 10 10
Time: 0.0762 milliseconds
Memory: 0.0 KB
---------------------------------------
Quick Sort (Cutoff = 200):
0 0 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1 1 1 1 2 2 2 2 2 2 2 2 3 3 3 3 3 3 3 4 4 4 4 4 4 4 4 4 4 4 4 4 4 5 5 5 5 5 5 5 5 6 6 6  10 10 10 10 10
Time: 0.0762 milliseconds
Memory: 0.0 KB
---------------------------------------
Quick Sort (Cutoff = 200):
0 0 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1 1 1 1 2 2 2 2 2 2 2 2 3 3 3 3 3 3 3 4 4 4 4 4 4 4 4 4 4 4 4 4 4 5 5 5 5 5 5 5 5 6 6 6 ---------------------------------------
Quick Sort (Cutoff = 200):
0 0 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1 1 1 1 2 2 2 2 2 2 2 2 3 3 3 3 3 3 3 4 4 4 4 4 4 4 4 4 4 4 4 4 4 5 5 5 5 5 5 5 5 6 6 6 0 0 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1 1 1 1 2 2 2 2 2 2 2 2 3 3 3 3 3 3 3 4 4 4 4 4 4 4 4 4 4 4 4 4 4 5 5 5 5 5 5 5 5 6 6 6  3 3 3 3 3 3 4 4 4 4 4 4 4 4 4 4 4 4 4 4 5 5 5 5 5 5 5 5 6 6 6 6 6 6 6 6 6 6 7 7 7 7 7 7 7 7 7 7 7 8 8 8 8 8 8 8 9 9 9 9 9 9 9 10 10 10 10 10
Time: 0.168 milliseconds
Memory: 0.0 KB
PS C:\Class\DSA-Assignment-3>



Merge sort used up the largest memory as it creates quite alot of left and right arrays to be merged together. 
Quick sort was the fastest becuase it sorts arrays within the array insteado of making new arrays but is very depenent on the pivot. 
Heap sort was a bit slower because of all the bubbling needed to heapify the tree after each step.
Insertion sort is efficient for small arrays but would not be practical for large arrays. 










