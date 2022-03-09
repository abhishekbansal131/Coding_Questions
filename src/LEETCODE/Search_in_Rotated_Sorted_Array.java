package LEETCODE;

public class Search_in_Rotated_Sorted_Array {
    public int search(int[] arr, int target) {
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target) return i;
        }
        return -1;
    }
}
