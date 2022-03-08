package LEETCODE;

class Solution7 {
    public int reverse(int x) {
        long sum=0;
        while(x!=0){
            int rem = x%10;
            sum = sum*10 + rem;
            x /= 10;
        }
        if(sum < -Math.pow(2,31) || sum > Math.pow(2,31)-1) return 0;
        return (int)sum;
    }
}