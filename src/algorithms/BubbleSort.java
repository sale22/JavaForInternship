package algorithms;

/**
 * Created by Aleksandar on 2/27/2016.
 */
public class BubbleSort {
    public static  void bubble_sort(int[] array){
        int n = array.length;


        System.out.println("Array at the beginning:");
        print(array);

        for(int m = 0; m < n - 1; m++){
            for(int i = 0; i < n - m - 1; i++){
                if(array[i] > array[i+1]) {
                    swap(array, i, i+1);
                }

            }
            //print(array);
        }
        System.out.println("Sorted array:");
        print(array);
    }

    public static  void swap(int[] array, int i, int j){
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public  static  void print(int[] array){
        for (Integer i: array
             ) {
            System.out.print(i + ", ");

        }
        System.out.println("\n");
    }

    public static void main(String[] args){
        int[] array = {3, 4, 1, 23, 0, 2, 55, 2, 555};
        bubble_sort(array);
    }
}
