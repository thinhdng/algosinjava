
public class binarysearchrecur{
    public static int binarySearch(int target, int[] nums, int left, int right){
        //base condition 
        //no target found (search space is empty)
        if(left > right){
            return -1;
        }

        int mid = (left + right)/2;
        
        //base condition
        //if target found at the middle of the array
        if(target == nums[mid]){
            return mid;
        }
        //discard all elements from the right of mid and mid itself
        else if(target < nums[mid]){
            return binarySearch(target, nums, left, mid - 1);
        }
        //discard all elements from the left of mid and mid itself
        else{
            return binarySearch(target, nums, mid + 1, right);
        }
    }

    public static void main(String[] args){
        int[] nums = {2,5,6,8,9,10};
        int target = 5;

        int left = 0;
        int right = nums.length - 1;

        int index = binarySearch(target, nums, left, right);

        if(index !=-1){
            System.out.println("element found @ "+ index);
        }else{
            System.out.println("element not found");
        }
    }
}    
