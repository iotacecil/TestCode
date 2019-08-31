package didi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class 序列移除 {




//        public static int[][] longestCommonSubsequence(int[] A, int[] B,int n) {
//            int[][] matrix = new int[n + 1][n + 1];//建立二维矩阵
//
//            for (int i = 0; i <= n; i++) {
//                matrix[i][0] = 0;
//            }
//            for (int j = 0; j <= n; j++) {
//                matrix[0][j] = 0;
//            }
//            // 填充矩阵
//            for (int i = 1; i <= n; i++) {
//                for (int j = 1; j <= n; j++) {
//                    if (A[i - 1] == B[j - 1]) {
//                        matrix[i][j] = matrix[i - 1][j - 1] + 1;
//                    } else {
//                        matrix[i][j] = (matrix[i - 1][j] >= matrix[i][j - 1] ? matrix[i - 1][j]
//                                : matrix[i][j - 1]);
//                    }
//                }
//            }
//            return matrix;
//        }

//    static int sum;

//        public static void print(int[][] opt, int[] A, int[] B, int i, int j) {
//            if (i == 0 || j == 0) {
//                return ;
//            }
//
//            if (A[i - 1] == B[j - 1]) {
//                print(opt, A, B, i - 1, j - 1);
//                sum+=A[i - 1];
//                System.out.println(A[i-1]);
//            } else if (opt[i - 1][j] >= opt[i][j]) {
//                print(opt, A, B, i - 1, j);
//            } else {
//                print(opt, A, B, i, j - 1);
//            }
//
//        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long total = sc.nextLong();
        long cost = sc.nextLong();
        int[] A = new int[n];
        int[] B = new int[n];
//        sum = 0;
        for (int i = 0; i <n ; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            B[i] = sc.nextInt();
        }
//        System.out.println(Arrays.toString(A));
//        System.out.println(Arrays.toString(B));
        int[] ans = new int[n];
        Arrays.fill(ans,-1);
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if(B[j] == A[i]){
                    ans[i] = j;
                }
            }
        }
        int[] dp = new int[n];
        int len = 0;
        int sum = 0;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n; j++) {
//                if(ans[j]-ans[i])

            }

        }
        System.out.println(sum);




//        print(longestCommonSubsequence(A, B, n),A,B,n,n);


//        System.out.println(sum);
//    }

    }
}
