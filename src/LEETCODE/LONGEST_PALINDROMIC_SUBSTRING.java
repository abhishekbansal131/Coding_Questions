package LEETCODE;

public class LONGEST_PALINDROMIC_SUBSTRING {
    public boolean palindrome(String s){
        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int c, max =0; String p = "";
        if(s.length()==1) return s;
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                c = 0;
                if(palindrome(s.substring(i,j))) c = j-i;
                if(c>max){
                    max = c;
                    p = s.substring(i,j);
                }
            }
            if(max == s.length()) return s;
        }
        return p;
    }
}
