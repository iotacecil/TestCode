package tx2;

import java.util.Arrays;
import java.util.Scanner;

public class tx01 {
    public static int coinChange(int[] coins, int amount) {
        if(amount<1) return 0;
        int[] dp = new int[amount+1];
        int sum = 0;

        while(++sum<=amount) {
            int min = -1;
            for(int coin : coins) {
                if(sum >= coin && dp[sum-coin]!=-1) {
                    int temp = dp[sum-coin]+1;
                    min = min<0 ? temp : (temp < min ? temp : min);
                }
            }
            dp[sum] = min;
        }
        return dp[amount];
    }
    // 组合出1-m之间的所有面值 最少的硬币数量
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i <n ; i++) {
            coins[i] = sc.nextInt();
        }
        int rst = -1;
        for (int i = m; i >0 ; i--) {
            int tmp = coinChange(coins,i);
            if(tmp == -1){
                System.out.println(-1);
                break;
            }
            rst =Math.max(tmp,rst);
            if(i==1){
                System.out.println(rst);

            }
        }

    }
}
