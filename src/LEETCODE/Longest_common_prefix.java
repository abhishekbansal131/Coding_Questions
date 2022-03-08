package LEETCODE;

class Solution6 {
    public String longestCommonPrefix(String[] arr) {
        String s1 = "";
        int min=Integer.MAX_VALUE;
        char a;
        for(String i : arr){
            if(i.length()<min) min = i.length();
        }
        int flag;
        if(arr.length == 1) return arr[0];
        for(int i=0; i<min; i++){
            flag=0;a=0;
            for(int j= 0; j<arr.length-1; j++){
                if(arr[j].charAt(i) == arr[j+1].charAt(i)) flag=1;
                else return s1;
                a = arr[j].charAt(i);
            }
            if(flag==1) s1+=a;
            else return s1;
        }
        return s1;
    }
}
