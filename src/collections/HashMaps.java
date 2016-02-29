package collections;

import java.util.*;

/**
 * Created by Aleksandar on 2/26/2016.
 */


/*
*IMPORTANT:
*
* HashMap doesn't maintain an insertion order anywhere in its data.
* LinkedHashMap was designed precisely to maintain this order.
*
*
* Note: I repeat, you CANNOT store basic (primitive) types inside of ArrayLists, HashMaps, or ANY Java collection for that matter.
* Java collections only store objects. This is EXTREMELY IMPORTANT so do not forget.
*
* ConcurrentHashMap is thread-safe that is the code can be accessed by single thread at a time
* while HashMap is not thread-safe
*
* HashMaps how does it works --> file AllAboutHashMaps - core question.*/



public class HashMaps {
    public static void main(String args[]) {
        //LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Novak Djokovic", 1);
        map.put("Roger Federer", 2);
        map.put("Rafael Nadal", 8);
        map.put("Andy Murrey", 4);

        System.out.println("\nPrint content of the map:\n");

        /*Printing map content in one line defined by System. It looks like {key=value, ...}*/
        System.out.println(map);

        /*Print value of specific key from map*/
        System.out.println("\nValue of key --> \"Novak Djokovic\" is: " + map.get("Novak Djokovic"));

        System.out.println("\nIteration through map using \"Set\":\n");

        /*Iteration trough map*/
        Set<String> keys = map.keySet();
        for (String key : keys
                ) {
            System.out.println("Key: " + key + "\tvalue: " + map.get(key));

        }




        /*HashMap Sorting by values*/
        Map<String, Integer> mmap = sortByValues(map);


        System.out.println("\nPrinting of sorted Hashmap, sort by values!:\n");

         /*Iteration trough map*/
        Set<String> keys1 = mmap.keySet();
        for (String key : keys1
                ) {
            System.out.println("Key: " + key + "\tvalue: " + mmap.get(key));

        }

    }

    /*Method which we use to sort hashmap using default sort method for Collections*/

    private static HashMap sortByValues(HashMap map) {
        List list = new LinkedList(map.entrySet());


        // First we sort list with all map data...
        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry) (o1)).getValue())
                        .compareTo(((Map.Entry) (o2)).getValue());
            }
        });

        // Here I am copying the sorted list in HashMap
        // using LinkedHashMap to preserve the insertion order

        HashMap sortedHashMap = new LinkedHashMap();
        for (Iterator it = list.iterator(); it.hasNext(); ) {
            Map.Entry entry = (Map.Entry) it.next();
            //System.out.println(entry);
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }
        return sortedHashMap;


    }

}
