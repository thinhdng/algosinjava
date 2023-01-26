public class palindrome {
    public static void main(String[] args) {
        String str = "My name is Thinh";
        String reversestr = "";

        //a word is a palindrome if the reverse of it is itself. 
        //reverse the word then compare the 2
        //true if palindrome, false if not palindrome
        for(int i = 0; i < str.length(); i++){
            reversestr = str.charAt(i) + reversestr;
        }

        System.out.println(str.equals(reversestr));
    }
}
