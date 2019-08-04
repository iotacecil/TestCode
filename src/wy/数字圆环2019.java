package wy;

import java.util.Arrays;
import java.util.Scanner;

// 每个数字小于相邻2个数字的和
public class 数字圆环2019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int[] a = new int[n+1];
            for (int i = 0; i <n ; i++) {
                a[i] = sc.nextInt();

            }
            Arrays.sort(a,0,n-1);
            a[n-1] = a[0];
            if(n<=2||a[0]+a[2]<=a[1]) {
                System.out.println("NO");
                return;
            }

            for (int i = 1; i <=n-2 ; i++) {
                if(a[i]+a[i+2]<=a[i+1]){
                    System.out.println("NO");
                    return;
                }

            }
           System.out.println("YES");
        }
    }
}
