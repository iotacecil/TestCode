package wy;

import java.util.Arrays;
import java.util.Scanner;

public class 序列维护2019 {
    public static int lowerBound(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        int lb = -1, ub = nums.length;
        while (lb + 1 < ub) {
            int mid = lb + (ub - lb) / 2;
            if (nums[mid] >= target) {
                ub = mid;
            } else {
                lb = mid;
            }
        }
        return ub;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i <n ; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i <q ; i++) {
            int idx = lowerBound(a, sc.nextInt());
//            System.out.println(idx);
            if(idx<0)idx=-(idx+1);

            System.out.println(n-idx);
            for (int j = idx; j <n ; j++) {
                a[j]--;
            }
            Arrays.sort(a);

        }

    }
}
