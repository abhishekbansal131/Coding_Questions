package CODECHEF;

import java.util.Scanner;

public class SIGN_MOVES {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            if(n%2==0) System.out.println(n/2);
            else System.out.println(-((n/2)+1));
        }
    }
}
