package wy;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class wy01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a =new int[n];
        for (int i = 0; i <n ; i++) {
            a[i] = sc.nextInt();
        }
        int[] renshu = new int[n];
        for (int i = 0; i <n ; i++) {
            int cnt = 0;
            for (int j = 0; j <n ; j++) {
                if(a[j]<=a[i])cnt++;

            }
            renshu[i] = cnt;

        }
//        System.out.println(Arrays.toString(renshu));
        int q = sc.nextInt();
        for (int i = 0; i <q ; i++) {
            int qq = sc.nextInt()-1;
//            double score = ;
//            System.out.println(score);
            BigDecimal b   =   new   BigDecimal((renshu[qq]-1+0.0)/n*100);
//            System.out.println(b);
            double   score   =   b.setScale(6,   BigDecimal.ROUND_HALF_UP).doubleValue();
            String result = String.format("%.6f",score);
            System.out.println(result);

        }
    }
}
