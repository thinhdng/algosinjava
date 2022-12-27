import java.util.ArrayList;
import java.util.function.Consumer;

//a custom Interface to return a string
interface StringFunction{
    String run(String str);
}

public class lambdajava {
    public static void main(String[] args){
        //Lambda passed as parameters to functions
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        //lambda expression to print numbers from numbers
        numbers.forEach((n) -> { System.out.println(n); });

        //Lambda expression can be stored in a variable using the Consumer's interface
        Consumer<Integer> method = (n) -> { System.out.println(n); };
        numbers.forEach(method);

        //Create a method which takes a lambda expression as a parameter
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }
    //this function take in StringFunction interface as parameter
    //take the returned string and store it in result
    //print out the result. 
    public static void printFormatted(String str, StringFunction format){
        String result = format.run(str);
        System.out.println(result);
    }

    //lambda is a void type method so it should be used to do things that doesn't return a value
}
