package algorithms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Aleksandar on 2/27/2016.
 *
 * Seeking characters with only 1 occurrence in string
 */
public class FirstNonRepeatedChar {
    public void firstNonRepeated(String str){

        /*Use LinkedHashMap to save each character and count number of occurrences
        * LinkedHashMap is used because we need first character with just one occurrence
        * LinkedHashMap keeps input order  */
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

        /*Input string convert to array of char*/
        char[] charArray = str.toCharArray();


        /*Iterating through array, count and put in hashmap */
        for(char c:charArray) {
            if (map.get(c) != null)
                map.put(c, map.get(c) + 1);
            else
                map.put(c, new Integer(1));
        }


        /*Iterating through map and check if there is character with just one occurrence*/
        Set<Character> keySet = map.keySet();
        for(Character key : keySet){
            if (map.get(key) == 1){
                System.out.println("Character is: "+ key);
                System.exit(0);
            }
        }
        System.out.println("There are no characters with just one occurrence!");
    }

    public static void main(String[] args){
        String str = "fedfekmfel,ffefa";
        FirstNonRepeatedChar fnrc = new FirstNonRepeatedChar();
        fnrc.firstNonRepeated(str);
    }

}
