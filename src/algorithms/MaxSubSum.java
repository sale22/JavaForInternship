package algorithms;

/**
 * Created by Aleksandar on 2/28/2016.
 *
 *
 * Calculate maximum sum of sub array.
 *
 */
public class MaxSubSum {
    public int max_sub_sum(int[] array){
        int maxSub = 0;
        int maxSumInside = 0;
        int sumInside = 0;

        for(int i = 0; i < array.length; i++){
            if (maxSumInside > maxSub){
                maxSub = maxSumInside;
            }
            maxSumInside = array[i];
            sumInside = array[i];
            for(int j = i+1; j < array.length; j++){
                sumInside += array[j];
                if (sumInside > maxSumInside){
                    maxSumInside = sumInside;
                }

            }
        }
        return maxSub;
    }

    public static void main(String[] args){
        MaxSubSum maxSubSum = new MaxSubSum();
        int[] array = {-10, 2, 3, -3, 20, 5, -15};
        System.out.println("Maximum sub sum is: " + maxSubSum.max_sub_sum(array));
    }
}
