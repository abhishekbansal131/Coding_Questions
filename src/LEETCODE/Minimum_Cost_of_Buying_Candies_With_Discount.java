package LEETCODE;

import java.util.Arrays;

public class Minimum_Cost_of_Buying_Candies_With_Discount {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int sum = 0 , j =0;
        for(int i = cost.length-1; i>=0; i--){
            sum += cost[i];
            j++;
            if(j==2){i--; j =0;}
        }
        return sum;
    }
}
