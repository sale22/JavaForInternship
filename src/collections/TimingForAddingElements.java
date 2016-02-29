package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Aleksandar on 2/26/2016.
 */
public class TimingForAddingElements {
    public static void calculateTime(String type, List<Integer> list){

        /*We need to have lists with a lot of elements to see difference
        ie. to see that adding in LinkedList is faster*/

        for (int i = 0; i < 1E5; i++){
            list.add(i);
        }

        /*Calculating time for changing elements of list*/
        long start = System.currentTimeMillis();


        for (int i = 0; i < 1E5; i++){
            list.add(i);
        }




        long end = System.currentTimeMillis();

        System.out.println("Time passed: " + (end - start) + " ms for List type " + type);

    }
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        calculateTime("ArrayList", arrayList);
        calculateTime("LinkedList", linkedList);
    }


}
