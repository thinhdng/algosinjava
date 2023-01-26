import java.util.*;
public class groupanagrams {

    /*public static List<List<String>> groupAnagrams(String[] strs){
        
        List<char[]> listOfCharArray = new ArrayList<char[]>();

        for(int i = 0; i < strs.length; i++){
            listOfCharArray.add(strs[i].toCharArray());
            Arrays.sort(listOfCharArray.get(i));
        }



    }*/
    
    //not 100% completed, but got the gist down 

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<char[]> listOfCharArray = new ArrayList<char[]>();

        for(int i = 0; i < strs.length; i++){
            listOfCharArray.add(strs[i].toCharArray());
            Arrays.sort(listOfCharArray.get(i));
        }

        List<List<String>> listOfAnagramList = new ArrayList<List<String>>();

        while(!listOfCharArray.isEmpty()){
            for(int i = 0; i < listOfCharArray.size(); i++){
                List<String> listOfStrings = new ArrayList<>();
                listOfStrings.add(strs[i]);
                for(int j = i + 1; j < listOfCharArray.size(); j++){
                        if(Arrays.equals(listOfCharArray.get(i), listOfCharArray.get(j))){
                                listOfStrings.add(strs[j]);
                                listOfCharArray.remove(j);
                            }
                    }
                listOfCharArray.remove(i);
                listOfAnagramList.add(listOfStrings);
            }
        }


        System.out.println(Arrays.deepToString(listOfAnagramList .toArray()));
    }
}
