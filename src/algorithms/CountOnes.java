package algorithms;

/**
 * Created by Aleksandar on 2/27/2016.
 *
 * Count number of ones in binary representation of given number(int ---> 32 bit)
 */
public class CountOnes {
    public int count_ones(int number){
        int maxPow = 1 << 31;
        int counter = 0;

        while(number != 0){
            if((number & maxPow) == maxPow){
                counter++;
            }
            number <<= 1;
        }
        return counter;
    }

    public static void main(String[] args){
        CountOnes co = new CountOnes();
        System.out.println(co.count_ones(127));
    }
}


