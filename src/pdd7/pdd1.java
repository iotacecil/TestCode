package pdd7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
//80%
public class pdd1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        String[] Astr = bf.readLine().split(" ");
        String[] Astr = "2".split(" ");
//        String[] Bstr = bf.readLine().split(" ");
        String[] Bstr = "0 2 3".split(" ");

        int idx = 0;
        boolean find = false;
        for (int i = 0; i <Astr.length-1 ; i++) {
            if(Long.parseLong(Astr[i+1])<=Long.parseLong(Astr[i])){
                if(!find) {
                    idx = i;
                    find = true;
                }
                else{
                    System.out.println("NO");
                    return;
                }
//                break;
            }
        }
        idx++;
//        System.out.println(idx);
        long left = idx>0?Long.parseLong(Astr[idx-1]):Integer.MIN_VALUE;
        long right = idx< Astr.length-1?Long.parseLong(Astr[idx+1]):Integer.MAX_VALUE;
        long[]B = new long[Bstr.length];
        for (int i = 0; i < Bstr.length; i++) {
            B[i] = Long.parseLong(Bstr[i]);
        }
        Arrays.sort(B);
//        System.out.println(Arrays.toString(B));
//        System.out.println(left+" "+right);
        boolean flag = false;
        for (int i = B.length-1; i >=0 ; i--) {
            if(B[i]<right&&B[i]>left){
//                System.out.println(B[i]);
                Astr[idx] = ""+B[i];
                flag = true;
                break;
            }
        }
        if(flag){
        for (int i = 0; i <Astr.length ; i++) {
            if(i!=Astr.length-1)
            System.out.print(Astr[i]+" ");
            else{
                System.out.println(Astr[i]);

            }
        }}else{
            System.out.println("NO");
        }


    }
}
