package algorithms;

/**
 * Created by Aleksandar on 2/27/2016.
 */
public class Fibonacci {

    public int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);

    }

    public static void main(String[] args){
        Fibonacci f = new Fibonacci();

        int i = 0;
        while( i < 10){
            System.out.print(f.fibonacci(i) + " ");
            i++;
        }
    }
}

