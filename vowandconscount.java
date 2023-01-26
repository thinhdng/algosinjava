public class vowandconscount {
    public static void main(String[] args) {
        //count numbers of vowels and consonants
        String str = "Hello my name is Thinh";
        char[] strArray = str.toCharArray(); 
        int vowelCount = 0;
        int consonantsCount = 0;


        
        for(int i = 0; i < strArray.length; i++){
            if(str.charAt(i) == 'i' || str.charAt(i) =='o' || str.charAt(i) =='u' || str.charAt(i) == 'a' || str.charAt(i) == 'e')
                vowelCount++;
            else if(str.charAt(i) != ' ')
                consonantsCount++;
            else
                ; 
        }

        //consonantsCount = str.length() - vowelCount;

        System.out.println("Consonants = " + consonantsCount + ", vowelCount = " + vowelCount);
    } 
}
