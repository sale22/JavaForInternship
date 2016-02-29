package algorithms;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Aleksandar on 2/27/2016.
 */
public class ChooseElements {
    public static void main(String[] args) {
            int[] array = new int[900000];
            int[] elements = new int[530000];
            Set<Integer> chosen = new HashSet<Integer>();

            double ratio = 90.0 / 53;
            double counter;
            int i = 0;

            for (counter = 0; counter <= 900000; counter += ratio) {
                chosen.add((int) Math.floor(counter));
                elements[i++] = array[(int) Math.floor(counter)];
            }

            System.out.println("Number of chosen indexes: " + chosen.size());
            for (int el : elements) {
                System.out.print(el + " ");
            }


    }
}
