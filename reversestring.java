/**
 * reversestring
 */
public class reversestring {
    public static void main(String[] args) {
        String str = "My name is Thinh";
        String reversestr = "";

        //loop through each character in the string, then add them in reverse order
        for(int i = 0; i < str.length(); i++){
            reversestr = str.charAt(i) + reversestr; 
        }

        System.out.println(reversestr);
    }
} 