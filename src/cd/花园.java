package cd;

import java.util.Scanner;

public class 花园 {
    static final  long mod = 1000_000_007;
    private static long catalen(int n){
        if(n<=1)return 1;
        long[] ka = new long[n+1];
        long rst = 0;
        ka[0] = ka[1] = 1;
        for (int i = 2; i <=n ; i++) {
            ka[i] = 0;
            for (int j = 0; j <i ; j++) {
                ka[i] = (ka[i]+(ka[j]*ka[i-j-1])%mod)%mod;
            }

        }
        return ka[n];


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==1) System.out.println(-1);
        else{
            n/=2;
            System.out.println(catalen(n));

        }

    }
}
