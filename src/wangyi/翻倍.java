package wangyi;

import java.util.Scanner;

public class 翻倍 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        while (n-->0){
            long A = sc.nextLong();
            long B = sc.nextLong();
            int p = sc.nextInt();
            int q = sc.nextInt();
            long dif = B-A;
            if(p == 1){
                System.out.println(B-A);
            }else{
                if(p>=dif){
                    System.out.println(1);
                    continue;
                }
                long cnt = 1;
                double cur = p;
                while (dif > cur){
                    cur*=q;
                    cnt++;
                }
                System.out.println(cnt);
               // double multi =  (Math.log(dif)/Math.log(p));
             //   if(multi > (int)multi)multi++;
//                System.out.println(multi);
               // System.out.println(cnt+multi);

            }

        }
    }
}
