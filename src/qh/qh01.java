package qh;

import java.util.Scanner;

public class qh01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i <T ; i++) {
            int t1 = sc.nextInt();
            int t2 = sc.nextInt();
            int t3 = sc.nextInt();
            int rst = sc.nextInt();
            rst+= Math.min(t1,t3);
            t1-=Math.min(t1,t3);
            rst+= (t2+t1) /2;
            System.out.println(rst);

        }
    }
}
