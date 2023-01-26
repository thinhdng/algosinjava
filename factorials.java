public class factorials {

    //recursive
    public static int fac(int n){
        if(n == 1)
            return 1; 
        else
            return (n * fac(n - 1));
    }
    public static void main(String[] args) {
        int n = 5;
        int res = 1;
        System.out.println(fac(n));

        //iterative
        for(int i = 1; i <= n; i++)
        {
            res *= i;
        }

        System.out.println(res);
    }
}
