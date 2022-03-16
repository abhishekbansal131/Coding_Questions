import java.util.Scanner;

public class SUBARR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k;
        for(int i = s.length(); i>0; i--) {
            k = s.length() - i + 1;
            for (int j = 0; j < i; j++) {
                System.out.println(s.substring(j, j + k));
            }
        }
    }
}