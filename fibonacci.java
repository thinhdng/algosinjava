public class fibonacci {
    public static int fib(int n){
        if(n <= 1)
            return n;
        
            //next number = the previous 2 numbers added 
            return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        int n = 15;
        System.out.println(fib(n));
    }
}
