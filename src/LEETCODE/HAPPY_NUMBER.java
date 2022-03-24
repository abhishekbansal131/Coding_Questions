package LEETCODE;

import java.util.HashSet;
import java.util.Set;

public class HAPPY_NUMBER {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        while(set.add(n)){
            int sum = 0;
            String s = String.valueOf(n);
            for(int i=0; i<s.length(); i++){
                sum += (s.charAt(i) - '0') * (s.charAt(i) - '0');
            }
            if(sum == 1) return true;
            n=sum;
        }
        return false;
    }
}
