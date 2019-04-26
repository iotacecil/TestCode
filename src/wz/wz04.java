package wz;

import java.util.Scanner;

public class wz04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-->0){
            int num = sc.nextInt();
            if(num==1) System.out.println(0);
            else{
                int cnt = 0;
                while (num!=1){
                   if(num %2 ==0){
                       num/=2;
                   }else{
                       num=num*3+1;
                   }
                   cnt++;
                }
                System.out.println(cnt);
            }
        }

    }
}
