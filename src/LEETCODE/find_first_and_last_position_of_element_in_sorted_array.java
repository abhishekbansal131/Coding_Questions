package LEETCODE;

class Solution3 {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        int j=0, c=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                if(j==2) j=1;
                arr[j] = i;
                j++;
            }
            else c++;
        }
        if(c==nums.length){
            arr[0] = arr[1] = -1;
            return arr;
        }
        else if(j==1){
            arr[1] = arr[0];
            return arr;
        }
        else return arr;

    }
}
