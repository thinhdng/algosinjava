import java.util.HashMap;
public class hashmapjava {
    
    public static void main(String[] args){
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    //add an item into a hashmap using the "put" keyword
    //key, value
    capitalCities.put("Vietnam","Hanoi");
    capitalCities.put("US", "DC");
    capitalCities.put("France", "Paris");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    System.out.println(capitalCities);

    //retrieve a value from the map using the "get" keyword and a key
    System.out.println(capitalCities.get("Vietnam"));

    //get the size of the hashmap using the "size" keyword
    System.out.println(capitalCities.size());

    //remove an item from the hashmap using the "remove" keyword and a key
    capitalCities.remove("Germany");
    System.out.println(capitalCities);

    //to loop through a hashmap, we could use the for-each loop
    
    //if we want to report the keys
    for(String i: capitalCities.keySet()){
            System.out.println(i);
        }
    
    //if we want to report the values instead
    for(String i: capitalCities.values()){
        System.out.println(i);
    }

    //if we want to report both the keys and values
    for(String i: capitalCities.keySet()){
        System.out.println(i + "," + capitalCities.get(i));
    }
 
    //loop through the hashmap using the foreach method and lambda
    capitalCities.forEach((country, capital) -> {
        System.out.println(country + "," + capital);
    });

    //to remove all pairs in the hashmap using the "clear" keyword
    capitalCities.clear();
    System.out.println(capitalCities);

    //keys and values in hashmaps, just like in List/ArrayList
    //are objects. int -> Integer, double -> Double, boolean -> Boolean
    //char -> Character, etc. 
    
    //create another hashmaps with a <String, Integer>
    //hashmap of people with their names and ages
    HashMap<String, Integer> people = new HashMap<String, Integer>();
    people.put("John", 61);
    people.put("Lai", 55);
    people.put("Thinh", 21);
    people.put("Maddy", 20);

    System.out.println(people);

    }
}
