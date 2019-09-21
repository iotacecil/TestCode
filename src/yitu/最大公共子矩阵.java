package yitu;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.Scanner;

public class 最大公共子矩阵 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] A = new char[n][m];
        char[][] B = new char[n][m];
        for (int i = 0; i <n ; i++) {
            String str = sc.next();

            for (int j = 0; j <m ; j++) {
                A[i][j] = str.charAt(j);
            }
        }
        for (int i = 0; i <n ; i++) {
            String str = sc.next();
            for (int j = 0; j <m ; j++) {
                B[i][j] = str.charAt(j);
            }
        }
        int max = 0;
        // A的起点 A的终点,长度宽度

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                //B的起点
                for (int k = 0; k <n ; k++) {
                    for (int l = 0; l <m ; l++) {

                        if (A[i][j] == B[k][l]) {

                            //宽度

//k = 1,l = 1 len = 3
                            for (int o = 1; o <= Math.min(n - i, n - k); o++) {
                                for (int p = 1; p <= Math.min(m - j, m - l); p++) {
//                                    if(i==0&&j==0&&k==1&&l==1){
//                                        System.out.println("开始从1到"+Math.min(n - i, n - k));
//                                        System.out.println("开始从1到"+Math.min(m - j, m - l));
//
//
//                                        System.out.println(o + " " + p);
//                                        if(o == 2 && p==2) System.out.println("!!!!");
//
//                                    }
                                   boolean find = true;
                                    out:
                                    for (int q = 1; q <= o; q++) {

                                        for (int r = 1; r <= p; r++) {
//                                            System.out.println(o+" "+p);

                                            if (A[i + q - 1][j + r - 1] != B[k + q - 1][l + r - 1]) {
                                                //  max = Math.max(max,Math.max((o-1)*p,o*(p-1)));
                                               // System.out.println(A[i + q - 1][j + r - 1] + " " + B[k + q - 1][l +
//                                                        r - 1]);
//                                                System.out.println(o + " " + r);
//                                                if(i==0&&j==0&&k==1&&l==1){
//                                                    System.out.println("开始从1到"+Math.min(n - i, n - k));
//                                                    System.out.println("开始从1到"+Math.min(m - j, m - l));
//
//
//                                                    System.out.println(o + " " + p);
//                                                    if(o == 2 && p==2) System.out.println("!!!!");
//
//                                                }
                                               find = false;
                                               break out;
                                            }
                                        }

                                    }
                                    if(find)
                                    max = Math.max(o * p, max);
                                }
                            }

                        }
                    }

                }
            }

        }
        System.out.println(max);


    }
}
