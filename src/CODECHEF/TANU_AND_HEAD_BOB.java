package CODECHEF;

/* package code chef; // don't place package name! */

import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
class TANU_AND_HEAD_BOB
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int n = sc.nextInt();
            String s = sc.next();
            int c=0;
            for(int i=0; i<n; i++){
                if(s.charAt(i)=='I') {System.out.println("INDIAN"); break;}
                else if(s.charAt(i)=='Y') {System.out.println("NOT INDIAN"); break;}
                else c++;
            }
            if(c==n) System.out.println("NOT SURE");
            t--;
        }
    }
}

