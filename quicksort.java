/*a divide and conquer algo, divide an array into subarrays
and recursively sort the subarrays

steps:
-pivot selection: pick an element called a pivot from the array (mostly the left or rightmost element of the array)
-partitioning: reorder the array such that all elements smaller than the pivots come before the pivot, 
and bigger than the pivot come after the pivot, if it's equal, goes either way
-recur: recursively applying the above steps to the subarray of elements with smaller value than the pivot
and separately to the subarray of elements with greater values than the pivot 
*/
import java.util.Arrays;
public class quicksort {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //partition using lomuto partition scheme
    public static int partition(int[] a, int start, int end){
        //pick the rightmost element as a pivot from the array
        int pivot = a[end];

        //elements less than the pivot will be pushed to the left of pIndex
        //elements more than the pivot will be pushed to the right of pIndex
        //equals go either way
        int pIndex = start;

        //each time we find an element less than or equal to the pivot,
        //pIndex is incremented, and that element would be placed before the pivot
        for(int i = start; i < end; i++){
            if(a[i] <= pivot){
                swap(a, i, pIndex);
                pIndex++;
            }
        }

        //swap pIndex with pivot
        swap(a, end, pIndex);
        
        //return pIndex (index of the pivot element)
        return pIndex;
    }

    //quicksort routine
    public static void quicksort(int[] a, int start, int end){
        //base condition
        if(start >= end){
            return;
        }

        //rearrange elements across pivot
        int pivot = partition(a, start, end);

        //recur on subarray containing elements less than the pivot
        quicksort(a, start, pivot-1);

        //recur on subarray containing elements bigger than the pivot
        quicksort(a, pivot + 1, end);
    }

    //implementing the sort
    public static void main(String[] args){
        int[] a = {9, -3, 5, 2, 6, 8, -6, 1, 3};
        quicksort(a, 0, a.length-1);
        //print the sorted array
        System.out.println(Arrays.toString(a));
    }
}
