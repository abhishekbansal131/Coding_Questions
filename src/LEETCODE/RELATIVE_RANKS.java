package LEETCODE;
import java.util.Arrays;


class Solution {
    public static String[] findRelativeRanks(int[] score) {
        int[] arr = new int[score.length];
        for (int i=0 ; i<arr.length; i++) arr[i] = score[i];
        Arrays.sort(arr);
        String[] arr2 = new String[score.length];
        int j= arr.length-1;
        for(int i=0; i<score.length; i++){
            if(score[i] == arr[j]) arr2[i] = "Gold Medal";
            else if(score[i] == arr[j-1]) arr2[i] = "Silver Medal";
            else if(score[i] == arr[j-2]) arr2[i] = "Bronze Medal";
            else{
                for(int m=j-3; m>=0; m--){
                    if(score[i] == arr[m]) arr2[i] = String.valueOf(arr.length - m);
                }
            }
        }
        return arr2;
    }

    public static void main(String[] args) {
        int[] score = {10,3,9,8,4};
        String[] arr = findRelativeRanks(score);
        for(String i : arr) System.out.print(i + " ");
    }
}
