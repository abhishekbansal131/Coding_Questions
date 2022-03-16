package CODECHEF;

import java.util.Arrays;
import java.util.Scanner;

/*Chef is working on his swap-based sorting algorithm for strings.

        Given a string S of length N, he wants to know whether he can sort the string using his algorithm.

        According to the algorithm, one can perform the following operation on string S any number of times:

        Choose some index i (1≤i≤N) and swap the ith character from the front and the ith character from the back.
        More formally, choose an index i and swap Si and S(N+1−i).
        For example, d––cba–– can be converted to a––cbd–– using one operation where i=1.

        Help Chef find if it is possible to sort the string using any (possibly zero) number of operations.

        Input Format
        The first line of the input contains a single integer T, denoting the number of test cases. The description of T test cases follows.
        The first line of each test case contains N, the length of the string.
        The second line contains a string S of length N consisting of lowercase letters of the Latin alphabet.
        Output Format
        For each test case, print YES if it is possible to sort the string by performing any number of operations. Otherwise, print NO.

        You may print each character of the string in uppercase or lowercase (for example, the strings YeS, yEs, yes and YES will all be treated as identical).

        Constraints
        1≤T≤100
        1≤N≤103
        Sum of N over all test cases does not exceed 2⋅103.
        S consists of lowercase Latin alphabets only.
        Sample Input 1
        3
        4
        dbca
        3
        ccc
        3
        bza
        Sample Output 1
        YES
        YES
        NO
        Explanation
        Test case 1: Chef can sort the string using 1 operation.

        Choose i=1 and swap S1=d and S4=a. This way, the string becomes abcd.
        Hence, the string is sorted.

        Test case 2: Chef needs 0 operations to sort this string as it is already sorted.

        Test case 3: It can be proven that the given string cannot be sorted using any number of operations.
 */

class CodechefI
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int l = sc.nextInt();
            String s = sc.next();
            char[] arr = s.toCharArray();
            char[] arr2 = s.toCharArray();
            Arrays.sort(arr);
            for(int i=0; i<s.length()/2; i++){
                if(s.charAt(i)>s.charAt(s.length()-i-1)){
                    char temp = arr2[i];
                    arr2[i] = arr2[s.length()-i-1];
                    arr2[s.length()-i-1] = temp;
                }
            }
            int c=0;
            for(int i=0; i<arr2.length; i++){
                if(arr[i] == arr2[i]) c++;
                else {
                    System.out.println("NO");
                    break;
                }
            }
            if(c==arr2.length) System.out.println("YES");
            t--;
        }
    }
}

