package tx;

import java.util.Scanner;

public class tx4 {
    public static int factorial2(int x) {

if (x <= 1) {
return 1;
} else
return x * factorial2(x - 1);
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(factorial2(s));
    }
}
