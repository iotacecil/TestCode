package sinna;

import java.util.Arrays;
import java.util.Scanner;

public class 最小版本号 {


    public static int cmp(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
//        System.out.println(Arrays.toString(v1));
//        System.out.println(Arrays.toString(v2));
        int n = v1.length>v2.length?v2.length:v1.length;
//        System.out.println(n);
        int i =0;
        for(i =0;i<n;i++){
//            System.out.println(Integer.valueOf(v1[i]) +" " + Integer.valueOf(v2[i]));
            if(Integer.valueOf(v1[i]) < Integer.valueOf(v2[i]))return -1;
            else if(Integer.valueOf(v1[i]) > Integer.valueOf(v2[i]))return 1;

        }
        while(i<v2.length){
            if(Integer.valueOf(v2[i++]) !=0)return -1;
        }
        while(i<v1.length){
            if(Integer.valueOf(v1[i++]) !=0){
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
//        System.out.println(cmp("3", "2.4"));
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(",");
//        System.out.println(Arrays.toString(strs));
        String rst = strs[0].trim();
        for(int i = 1;i<strs.length;i++){
            String tmp = strs[i].trim();
//            System.out.println(rst+"+  "+cmp(rst,tmp));

            if(cmp(rst,tmp)>0){
                rst = tmp;
            }
        }
        System.out.println(rst);

    }
}
