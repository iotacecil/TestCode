package wangyi;

import java.util.Scanner;

public class 距离之和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextLong();
        }
        int cnt = 0;
        for (int i = 0; i <n-1 ; i++) {
            for (int j = i+1; j <n ; j++) {
                if(arr[j] < arr[i]){
                    cnt+= j-i;
                }

            }

        }
        System.out.println(cnt);
    }
}
