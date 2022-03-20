package CODECHEF;

import java.util.*;
import java.lang.*;

class CodechefL
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int k = n*x;
            System.out.println(k-(x*(n/3)));
            t--;
        }
    }
}

