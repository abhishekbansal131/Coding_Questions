import java.util.Scanner;

/*  Given an array, check its length, if length is even then set even indexes of array to 0, otherwise set 1
    Find the sum of array
    if the sum is of single digit than print it directly else first find the sum of digits and check if it is a
    single digit or not, if it is a single digit then print that otherwise repeat the same process(find the sum of digits again)
 */

public class ArrayQues {
    public int sumSingle(int[] input1, int input2){
        for(int i=0; i<input2; i++){
            if(input1.length % 2 == 0){
                if(i%2 == 0) input1[i] = 0;
            }
            else{
                if(i%2 != 0) input1[i] = 1;
            }
        }
        int sum = 0;
        for(int i : input1){
            sum += i;
        }
        int sum1=0;
        if(sum>9){
            while(sum!=0){
                int rem = sum%10;
                sum1 += rem;
                sum /= 10;
                if(sum ==0 && sum1 > 9) {sum =sum1; sum1=0;}
            }
        }
        else return sum;
        return sum1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++) arr[i] = sc.nextInt();
        System.out.println(new ArrayQues().sumSingle(arr,size));
    }
}
