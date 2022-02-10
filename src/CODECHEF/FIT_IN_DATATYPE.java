package CODECHEF;

import java.util.*;
import java.lang.*;
/*Chef wants to store some important numerical data on his personal computer. He is using a new data type
that can store values only from 0 till N both inclusive. If this data type receives a value greater than N
then it is cyclically converted to fit into the range 0 to N. For example:

Value N+1 will be stored as 0.
Value N+2 will be stored as 1.
and so on…*/

class Codechef
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            if(a<=n) System.out.println(a);
            else{
                while(a>n){
                    a= a-n-1;
                }
                System.out.println(a);
            }
            t--;
        }
    }
}

