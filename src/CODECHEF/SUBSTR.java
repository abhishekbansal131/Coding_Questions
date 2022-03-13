package CODECHEF;

import java.util.Scanner;

class Codechef11
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            String s = sc.next();
            int c=0, max=0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)!=s.charAt(0) && s.charAt(i)!=s.charAt(s.length()-1)) c++;
                else c=0;
                max = Math.max(c,max);
            }
            if(max==0) System.out.println(-1);
            else System.out.println(max);

            t--;
        }
    }
}