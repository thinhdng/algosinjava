import java.util.Arrays;
public class binarysearchiter {
    public static int binarySearch(int[] numarray, int target){
        //init the bounds for the search
        int left = 0;
        int right = numarray.length -1;

        //go on forever until the target is found or 
        //there is no search space left
        while(left <= right){
        //mid point will be the first thing the target is compared to
        int mid = (left+right)/2;

        //compare the target to the value at the middle of the array
        //if so return the middle index
        if(target == numarray[mid])
            return mid;
        else if(target < numarray[mid])
            right = mid - 1;
        else
            left = mid + 1;
        }

        //if the target is not found in the array
        return -1;
    }
    public static void main(String[] args){
        int[] num = {3,5,6,7,4,13};
        //binary search only works with arrays already in order or sorted
        Arrays.sort(num);
        int index = binarySearch(num, 7);
        if (index != -1){
            System.out.println("Element found @ index " + index);
        }else{
            System.out.println("Element not found");
        }
    }
}
