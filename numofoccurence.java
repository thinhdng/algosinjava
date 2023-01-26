public class numofoccurence {
    public static void main(String[] args) {
        String str = "Hi, my name is Thinh";
        int count = 0;
        char match = 'i';
        
        //loop thru the string, if a letter matches
        //increase count by 1
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == match)
                count++;
        }

        System.out.print(count);
    }
}
