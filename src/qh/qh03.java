package qh;

import java.util.Arrays;
import java.util.Scanner;

public class qh03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        int cnt = 0;
        for (int i = 0; i <n-1 ; i++) {
            if(arr[i]>arr[i+1]){
//                System.out.println(arr[i]);
                cnt++;
                break;
            }
        }
        int rst = 0;
        int idx = 1;
        for (int i = cnt+1; i < n+cnt+1; i++) {
//            System.out.println(i%n);
            rst+=Math.abs(arr[i%n]-idx);
//            System.out.println(rst);
            idx++;
        }
        System.out.println(rst);

    }
//    private void swap(int[]arr,int i,int j){
//
//    }
}
