package algorithms;

import java.util.ArrayList;

/**
 * Created by Aleksandar on 2/27/2016.
 */
public class Bezveze {
    public static void main(String[] args){
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(35);
        array.add(12);
        array.add(42);
        array.add(47);



        /*Demonstrate that java convert int to Integer when we use foreach loop
        *
        *  ArrayList<int> array1 = new ArrayList<int>(); -->  Something like this not allowed!
        * */

        for (int i: array
             ) {
            System.out.print(i + " ");

        }

    }
}
