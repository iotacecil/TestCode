package pdd;

import java.util.Arrays;
import java.util.Scanner;

public class pdd01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int rst = 0;
        for (int i = 0; i <n ; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] clone = arr2.clone();
        Arrays.sort(clone);
        Arrays.sort(arr1);

        for (int i = 0; i <n ; i++) {
            rst += clone[n-1-i]*arr1[i];
        }
        System.out.println(rst);
    }
}
