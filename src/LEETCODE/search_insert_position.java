package LEETCODE;

public class search_insert_position {
    public int searchInsert(int[] nums, int target) {
        int c=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target) return i;
            else{
                c++;
            }
        }
        if(c == nums.length){
            for(int i=0; i<nums.length; i++){
                if(nums[i]>target) return i;
            }
        }
        return nums.length;
    }
}
