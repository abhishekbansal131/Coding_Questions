package CODECHEF;

import java.util.Scanner;

public class Smallest_No_of_notes {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int n = sc.nextInt();
            int c=0;
            while(n!=0){
                if(n>=100){
                    c += n/100;
                    n = n % 100;
                }
                else if(n>=50){
                    c += n/50;
                    n = n%50;
                }
                else if(n>=10){
                    c += n/10;
                    n = n%10;
                }
                else if(n>=5){
                    c += n/5;
                    n = n%5;
                }
                else if(n>=2){
                    c += n/2;
                    n = n%2;
                }
                else if(n==1){
                    c += 1;
                    n = 0;
                }

            }
            System.out.println(c);
            t--;
        }
    }
}

