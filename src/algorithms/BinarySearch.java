package algorithms;

import java.util.Scanner;

/**
 * Created by Aleksandar on 2/27/2016.
 */
public class BinarySearch {

    public static int binary_search(int[] array, int left, int right, int value){
        if(left < right) {
            int middle = left + (right - left) / 2;
            if (value < array[middle]) {
                return binary_search(array, left, middle, value);
            }
            else if (value > array[middle]) {
                /*Right side starts at position middle + 1 ... Common error */
                return binary_search(array, middle + 1, right, value);
            }
            else {
                return middle;
            }
        }
        return -1;
    }

    public static  void main(String[] args){
        int[] array = {1, 2, 3, 4, 10, 12, 35, 42, 47, 155};
        int value;
        int position;

        /*Input value from standard input*/
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter value:");
        value = reader.nextInt();


        /*Get position using binary_search*/
        position = binary_search(array, 0, array.length, value);

        if (position == -1)
            System.out.println("Value: " + value +" is not in array!");
        else
            System.out.println("Element: " + value + " is in array at position: " + position);
    }

}
