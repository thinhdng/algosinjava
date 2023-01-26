/*merge sort is a divide and conquer algorithm ( like binary search )
divide a large array into 2 smaller ones and then recursively sort the subarrays
- divide the unsorted array into n subarrays, each of size 1
- repeatedly merge subarrays to produce new sorted subarrays until only 1 subarray is left,
which is the sorted array
time complexity = O(n*log(n)), n is the size of the input.
this algo is good for sorting linked list
bad for sorting small dataset, since it's slower (due to the process)
even with an already sorted array, it will still go through the whole process. 
takes up more spaces to store the auxiliary array.
*/
import java.util.Arrays;
public class mergesort {

    //merge two sorted subarrays 'arr[low...mid]' and 'arr[mid+1...high]'
    //actual array, aux: sorted subarrays, low point, mid point and high point of the array  
    public static void merge(int[] arr, int[] aux, int low, int mid, int high){
        
        //init
        int k = low, i = low, j = mid + 1;


        //whilst there are elements in the 'arr[low...mid]' and 'arr[mid+1...high]'
        //lows and highs refer to the positions
        //low from actual goes to low from aux
        //and high from actual goes to high from aux
        while(i <= mid && j <= high){
            if(arr[i] <= arr[j]){
                aux[k++] = arr[i++]; 
            }else{
                aux[k++] = arr[j++];
            }
        }

        //copy the remaining elements
        while(i <= mid){
            aux[k++] = arr[i++];
        }

        //no need to copy the second half (since the remaining items are 
        //already in the correct positions in the auxiliary)

        //copy back to the OG array to reflect the sorted order
        //this i is not the same i above
        for(i = low; i <= high; i++){
            arr[i] = aux[i];
        }

    }

    //sort array 'arr[low...high]' using auxiliary array 'aux'
    //lows and highs refer to the actual content 
    public static void mergesortt(int[] arr, int[] aux, int low, int high){
        //base case
        if(high <= low){
            return;
        }

        //find midpoint
        int mid = (low + ((high - low) >> 1));

        //recursively split subarrays into 2 halves until subarrays' size <= 1,
        //then merge them and return up the call chain

        mergesortt(arr, aux, low, mid); //split and merge the lower half
        mergesortt(arr , aux, mid + 1, high); //split and merge the higher half
        merge(arr, aux, low, mid, high); //merge the 2 halves runs
    }

    //function to check if arr is sorted in ascending order
    public static boolean isSorted(int[] arr){
        int prev = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(prev > arr[i]){
                System.out.println("sort failed");
                return false;
            }
            prev = arr[i];
        }
        return true;
    }

    //run the merge sort algo in java
    public static void main(String[] args){
        int[] arr = {12, 3, 18, 24, 0, 5, -2};
        int[] aux = Arrays.copyOf(arr, arr.length);

        //sort array 'arr' using the aux array 'aux'
        mergesortt(arr, aux, 0, arr.length-1);

        if(isSorted(arr)){
            System.out.println(Arrays.toString(arr));
        }
    }
}
