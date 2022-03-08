package LEETCODE;

class Solution12 {
    public String reverseWords(String s) {
        String s1 ="";
        int j=0;
        String[] arr = new String[s.length()];
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' ') {
                if(i != s.length()-1){
                    arr[j] = s1;
                    if(s.charAt(i+1) != ' '){
                        j++;
                        s1 = "";
                    }
                }
            }
            else{
                s1 += s.charAt(i);
            }
            if(i==s.length()-1 && s.charAt(s.length()-1) != ' ') arr[j] =s1;
        }
        String s2 = "";
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] != null && arr[i] != " ") {
                if(i==0) s2 += (arr[i]);
                else s2 += (arr[i] + " ");
            }
        }
        StringBuilder p = new StringBuilder(s2);
        for(int i=p.length()-1; i>=0; i--){
            if(p.charAt(i) == ' ') {p.deleteCharAt(i);}
            else break;
        }
        return p.toString();
    }
}
