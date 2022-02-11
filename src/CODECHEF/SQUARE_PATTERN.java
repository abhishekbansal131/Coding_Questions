package CODECHEF;

/*
N=4
1 2 3 4 5
10 9 8 7 6
11 12 13 14 15
20 19 18 17 16
*/

import java.util.Scanner;

public class SQUARE_PATTERN {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int j =1; j<=n*5; j++){
            System.out.print(j + " ");
            if(j%5 == 0) {System.out.println();
                for(int k = j+5; k>=j+1; k--){
                    System.out.print(k + " ");
                }
                j += 5;
                System.out.println();
            }
        }
    }
}
