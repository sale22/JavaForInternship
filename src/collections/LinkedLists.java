package collections;

import java.util.*;

/**
 * Created by Aleksandar on 2/26/2016.
 */


/*
*
* The main benefits of using a LinkedList arise when you re-use existing iterators to insert and remove elements.
* These operations can then be done in O(1) by changing the list locally only. In an array list, the remainder
* of the array needs to be moved (i.e. copied). On the other side, seeking in a LinkedList means following the
* links in O(n), whereas in an ArrayList the desired position can be computed mathematically and accessed in O(1).
*/
public class LinkedLists {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<String>();

        list.add("Novak");
        list.add("Viktor");
        list.add("Janko");
        list.add("Nenad");

        /*Print linkedlist content:*/
        Iterator<String>  iterator = list.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());

        System.out.println("\nPrint content of list using foreach loop:\n");

        /*Other way...*/
        for (String s:list
             ) {
            System.out.println(s);

        }

        /*Sort LinkedList*/

        Collections.sort(list);

        System.out.println("\nPrint content of sorted list using foreach loop:\n");

        for (String s:list
                ) {
            System.out.println(s);

        }


        /*------------------------------------------------------------------------------------------------------- */

        ArrayList<String> array = new ArrayList<String>();

        array.add("Novak");
        array.add("Viktor");
        array.add("Janko");
        System.out.println("\nPrint arraylist: ");
        System.out.println(array);
        System.out.println("\nFirst element " + array.get(0));
        System.out.println("\nSize of list: "+ array.size());
        System.out.println("\nIs arraylist empty? -->: " + array.isEmpty());
        System.out.println("\nContains \"Novak\"? " + array.contains("Novak"));

        System.out.println("\nForeach to print content:\n");
        for (String s:array
             ) {
            System.out.println(s);

        }

        System.out.println("\nCopy list to another:\n");
        List list_copy = new ArrayList<String>();
        list_copy.addAll(array);
        System.out.println(list_copy);
        System.out.println();


        /*Swap elements in array:*/
        System.out.println("\nSwap element at 0 and element at 2:\n");
        Collections.swap(array, 0, 2);
        System.out.println(array);

    }

}
