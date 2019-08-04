package wy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 进制组合2019 {
/*
1
4 12 2222248A
 */

//private  static int x2de(String str,int r){
//    int rst = 0;
//    for (int i = 0; i <str.length() ; i++) {
//
//    }
//
//}
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char[] ch = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G'};
        int t = Integer.parseInt(bf.readLine());
//        int t = 1;
//        System.out.println(Long.parseLong("1111111111111111111111111111117fffffff"));
//        System.out.println(t);
        while (t-->0){


            String[] line = bf.readLine().split(" ");
            int x = Integer.parseInt(line[0]);
            int y = Integer.parseInt(line[1]);
            String z = line[2];
//            int x = 16;
//            int y = 16;
//            System.out.println(Math.pow(2,31)-1);
//            String z = Integer.toHexString(Integer.MAX_VALUE).toUpperCase()+Integer.toHexString(Integer.MAX_VALUE).toUpperCase();
//            System.out.println(z);
           int leftlen = Integer.toString(Integer.MAX_VALUE,x).length();
           int rightlen = Integer.toString(Integer.MAX_VALUE,y).length();
            int n = z.length();
//            System.out.println(n+" "+leftlen+" "+rightlen);
//            System.out.println(z);
            if(x>=y){
                int idx = n-1;
//                System.out.println(ch[y]);
                while (idx>0&&z.charAt(idx)<ch[y]){
                    String left = z.substring(0,idx);
                    String right = z.substring(idx);
//                    System.out.println(left+" "+right);

                    if(left.length()>leftlen){
                        idx--;continue;
                    }
                    long ll = Long.parseLong(left, x);
                    long rr = Long.parseLong(right, y);
//                    int ll = Integer.parseInt(left, x);
//                    int rr = Integer.parseInt(right, y);
//                    System.out.println(ll+" "+rr);
                    if(ll==rr){
                        System.out.println(ll);
                        break;
                    }
                    idx--;
                }
            }else{
                /*
                1
2 16
00
                 */
                int idx = 0;
                while (idx<n&&z.charAt(idx)<ch[x]){
                    String left = z.substring(0,idx+1);
                    String right = z.substring(idx+1);
                    if(right.length()>rightlen){
                        idx++;continue;
                    }
//                    System.out.println(left+" "+right);
                    long ll = Long.parseLong(left, x);
                    long rr = Long.parseLong(right, y);
//                    int ll = Integer.parseInt(left, x);
//                    int rr = Integer.parseInt(right, y);

                    if(ll==rr){
                        System.out.println(ll);
                        break;
                    }
                    idx++;

                }
            }
        }
    }
}
