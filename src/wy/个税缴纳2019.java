package wy;

import java.util.Scanner;

/*
5
5000
15000
50000
8025
10001

 */
public class 个税缴纳2019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] level = {3000,12000,25000,35000,55000,80000};
        int[] persum =new int[level.length+1];
        for (int i = 0; i <level.length ; i++) {
            persum[i+1] = level[i];
        }
      //  System.out.println(persum);
        double[] shuly = {0.03,0.1,0.2,0.25,0.3,0.35,0.45};
        while (t-->0){
            int shouru = sc.nextInt();
            shouru -= 5000;
            if(shouru<=0){
                System.out.println(0);
                continue;
            }
            //10000
            double shui = 0;
            int i = level.length-1;
            while (i<=level.length&&i>=0&&level[i]>=shouru){
                i--;
            }
            //10000 找到3000
            i++;
           // System.out.println(persum[i]);
            shui = (shouru-persum[i])*shuly[i];
            i--;
            while (i>=0){
                shui +=(level[i]-persum[i])*shuly[i];
                i--;
            }



            System.out.println((int)(shui+0.5));
        }
    }
}
