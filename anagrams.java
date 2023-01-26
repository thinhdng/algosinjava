import java.util.Arrays;
public class anagrams {

    public static boolean checkAnagrams(String str1, String str2){
        //if their lengths are not the same, automatically not anagrams
        if(str1.length() != str2.length())
            return false;

        //if they're the same, convert both to char arrays and sort them 
        //compare if the arrays are the same
        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();

        Arrays.sort(str1Array);
        Arrays.sort(str2Array);

        return Arrays.equals(str1Array, str2Array);
    }
    public static void main(String[] args) {
        //anagrams if 2 words have the same length, and the same sets of characters. 
        String str1 = "a gentleman";
        String str2 = "elegant man";
        
        System.out.println(str1 + " and " + str2 + " are anagrams: " + checkAnagrams(str1, str2));
    }
}
