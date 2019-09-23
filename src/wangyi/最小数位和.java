package wangyi;

import java.util.Scanner;

public class 最小数位和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-->0){
            int tmp = sc.nextInt();
            if(tmp<10) System.out.println(tmp);
            else{
//                int rst  = 0;
                StringBuilder sb = new StringBuilder();
//                int idx = 0;
                while (tmp > 0){
                    int cur = (tmp >= 9?9:tmp);
//                    System.out.println(cur);
//                    rst = rst*10 + cur;
                    sb.insert(0,cur);
                    tmp -= cur;
                }
//                System.out.println(rst);
                System.out.println(sb.toString());
            }
        }
    }
}
