import java.util.ArrayList;
public class sumofp6numbers {
    public static void main(String[] args){
        ArrayList<Integer> numlist = new ArrayList<Integer>();
        for (int i = 1; i <= 6; i++){
            numlist.add(i);
        }
        int sum = 0;

        for(int i = 0; i < numlist.size(); i++){
            sum += Math.pow(numlist.get(i), 6); 
        }

        System.out.println(sum);
    }
}
