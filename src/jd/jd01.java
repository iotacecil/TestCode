package jd;

import sun.rmi.server.InactiveGroupException;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

/*
合唱队的N名学生站成一排且从左到右编号为1到N，
其中编号为i的学生身高为Hi。现在将这些学生分成若干组（同一组的学生编号连续），
并让每组学生从左到右按身高从低到高进行排列，
使得最后所有学生同样满足从左到右身高从低到高（中间位置可以等高），
那么最多能将这些学生分成多少组？


输入
第一行包含一个整数N，1≤N≤105。

第二行包含N个空格隔开的整数H1到HN，1≤Hi≤109。

输出
输出能分成的最多组数。


样例输入
4
2 1 3 2
样例输出
2
同一组编号连续
 */

public class jd01 {
    public static int help(long[] arr,int n) {
        long[] minleft = new long[n];
        minleft[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            minleft[i] = Math.min(minleft[i + 1], arr[i]);
        }
        int res = 0;
        long max = Long.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            max = Math.max(max,arr[i]);
            // 等于 重复元素
            if (max <= minleft[i + 1]) res++;
        }
        return res + 1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(help(arr,n));

    }


}
