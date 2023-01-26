import java.util.Arrays;

/**
 * productsofarray
 */
public class productsofarray {

    public static int[] productExceptSelf(int[] nums){
        int[] answer = new int[nums.length];
        for(int a = 0; a < answer.length; a++){
            answer[a] = 1;
        }
        
        //array where the elements can be edited
        int[] num = nums.clone();

        for(int i = 0; i < nums.length; i++){
            num[i] = 1;
            for(int j = 0; j < nums.length; j++){
                answer[i] *= num[j];
            }
            num[i] = nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.print(Arrays.toString(productExceptSelf(nums)));
        //System.out.println("a");
    }
}