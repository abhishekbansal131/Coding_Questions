package CODECHEF;

import java.util.Scanner;

public class HOSTEL_ROOM {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) arr[i] = sc.nextInt();
            int sum=x,max=0;
            for(int i : arr){
                max = Math.max(sum,max);
                sum += i;
                max = Math.max(sum,max);
            }
            System.out.println(max);
            t--;
        }
    }
}
