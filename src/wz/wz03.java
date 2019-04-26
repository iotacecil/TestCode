package wz;

import java.util.Scanner;

public class wz03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long m = sc.nextLong();
        if(m>=n) System.out.println(k);
        else{
            System.out.println((n/m)*k + (n%m)*k);
        }
    }
}
