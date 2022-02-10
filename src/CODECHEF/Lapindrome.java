package CODECHEF;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;

public class Lapindrome
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            String s = sc.next();
            char[] a1 = new char[s.length()/2];
            char[] a2 = new char[s.length()/2];
            int j=0;
            for(int i=0; i<s.length(); i++){
                if(i<s.length()/2) a1[i] = s.charAt(i);
                else{
                    if(s.length()%2==0) {a2[j] = s.charAt(i); j++;}
                    else{
                        if(i != s.length()-1) {a2[j] = s.charAt(i+1); j++;}
                    }
                }
            }
            Arrays.sort(a1);
            Arrays.sort(a2);
            int c=0;
            for(int i=0; i<a1.length; i++){
                if(a1[i]==a2[i]) c++;
            }
            if(c==a2.length) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}
