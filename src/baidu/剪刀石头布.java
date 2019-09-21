package baidu;

import java.util.Scanner;

public class 剪刀石头布 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       long N = sc.nextInt();
       long M = sc.nextInt();
//       if(M > (N-M)/2) System.out.println();
        System.out.println(Math.max(N-M,2*M-N));

        //M轮石头，N-M剪刀

    }
}
