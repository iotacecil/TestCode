package yitu;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class 小依的不等式 {
    static int idx = 2;
    static BigDecimal[] memo = new BigDecimal[100001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal mod = new BigDecimal(1000_000_000 + 7);
//        double mod = 1000_000_000 + 7;
        BigDecimal p5 = new BigDecimal(0.5);
        memo[1] = new BigDecimal(2);
        memo[2] = new BigDecimal(7);
        int n = sc.nextInt();
        for (int i = 0; i <n ; i++) {
            int que = sc.nextInt();
            if(idx < que){
                while (idx <= que){
                    BigDecimal tmp =(((memo[idx].multiply(memo[idx])).divide(memo[idx - 1], BigDecimal
                            .ROUND_HALF_UP))).divideAndRemainder(mod)[1];
                    memo[++idx] = tmp;
                }
                System.out.println((int)(memo[que].doubleValue()));
            }else{
                System.out.println((int)(memo[que].doubleValue()));
            }
        }
    }
}
