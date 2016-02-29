package algorithms;

import java.util.Scanner;

/**
 * Created by Aleksandar on 2/28/2016.
 *
 * Check if input string is palindrome
 */
public class Palindrome {
    public boolean isPalindrome(String str){
        for(int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) != str.charAt(str.length() - i - 1)))
                return false;
        }
        return  true;
    }

    public static void main(String[] args){
        Palindrome p = new Palindrome();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input string:");
        String str = scanner.nextLine();

        System.out.println(p.isPalindrome(str)? "It's a palindrome!" : "It's not a palindrome");
    }

}
