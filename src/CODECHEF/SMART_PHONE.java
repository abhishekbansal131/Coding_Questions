package CODECHEF;

import java.util.Arrays;
import java.util.Scanner;

class Codechef1
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        long[] arr =new long[(int) t];
        for(int i=0; i<t; i++) arr[i] = sc.nextLong();
        Arrays.sort(arr);
        long[] arr2 = new long[(int) t];
        for(int i=0; i<t; i++){
            arr2[i] = arr[i]*(t-i);
        }
        long max=0;
        for(long i : arr2){
            if(i>max) max = i;
        }
        System.out.println(max);

    }
}












