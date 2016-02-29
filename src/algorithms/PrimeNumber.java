package algorithms;

import java.util.Scanner;

/**
 * Created by Aleksandar on 2/28/2016.
 *
 * Check if number is prime...
 */
public class PrimeNumber {
    public static boolean prime(int number){
        for(int i = 2; i < number; i++){
            if(number % i == 0)
                return  false;

        }
        return true;
    }

    public static void main(String[] args){
        PrimeNumber primeNumber = new PrimeNumber();
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("Input number to check if it is prime:");
        n = scanner.nextInt();

        System.out.println(primeNumber.prime(n)? "Number is prime!" : "Number is not prime!");
    }

}
