package yy;

import java.util.Arrays;
import java.util.Scanner;

public class 扑克游戏
{

    private static int solve(int[]puke,int P){
        Arrays.sort(puke);
        int n = puke.length;
        int l = 0, h = n-1;
        int tmp = 0;
        int rst = 0;
        while (l <= h){
            if(P >= puke[l]){
                P -= puke[l++];
                tmp++;
                rst = Math.max(rst,tmp);
            }else if(tmp > 0){
                tmp--;
                P += puke[h--];
            }else break;
        }
        return rst;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.split("=|,");
//        System.out.println(strs[3]);
        int P = Integer.parseInt(strs[1].trim());
        int n = strs.length - 3;
        int[] puke = new int[n];
//        String sss = "[5";
//        System.out.println(sss.substring(1));
//        System.out.println();
        for (int i = 0; i <n ; i++) {
            String tmp = strs[3 + i].trim();
//            System.out.println(tmp);
            if(i == 0){
               tmp =  tmp.substring(1,tmp.length());
//                System.out.println(tmp);

            }else if(i == n-1){
                tmp = tmp.substring(0,tmp.length()-1);
            }
            puke[i] = Integer.parseInt(tmp);

        }
        System.out.println(solve(puke,P));
//        System.out.println(Arrays.toString(puke));

    }
}
