package CODECHEF;

import java.util.Scanner;

public class ALTERNATING_STRING {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            String s = sc.next();
            int c1=0, c2=0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='0') c1++;
                else c2++;
            }
            if(c1==c2) System.out.println(c1+c2);
            else System.out.println(2*Math.min(c1,c2)+1);
        }
    }
}
