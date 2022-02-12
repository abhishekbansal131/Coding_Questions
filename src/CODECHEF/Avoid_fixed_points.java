package CODECHEF;

import java.util.ArrayList;
import java.util.Scanner;

public class Avoid_fixed_points {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            ArrayList<Integer> a = new ArrayList<>();
            int n = sc.nextInt();
            for(int i=0; i<n; i++) a.add(sc.nextInt());
            int c=0;
            int k = a.size();
            for(int i=0; i<n; i++){
                if(a.get(i) == i+1) {
                    a.add(i,k+2);
                    c++;
                    n++;
                    k++;
                    i=i-1;
                }
            }
            System.out.println(c);
            t--;
        }
    }
}
