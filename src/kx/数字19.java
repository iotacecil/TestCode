package kx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
//{11,13,15,17,19,21}
public class 数字19 {
    private static int binarySearch(long[] arr,int k,int l,int h){
        int mid = l+(h-l)/2;
        if(l > h){
            return -1;
        }
        if(k == arr[mid]){
            return (mid+1);
        }
        else if(k > arr[mid]){
            return binarySearch(arr,k,mid+1,h);
        }else{
            return binarySearch(arr,k,l,mid-1);
        }


    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = bf.readLine();
        String[] split = line.split(",");
        long[] arr = new long[split.length];
      //  System.out.println(Arrays.toString(split));
        for (int i = 0; i <split.length ; i++) {
            String tmp = split[i];
            if(i==0){
               tmp =  tmp.substring(1);
            }
            if(i==split.length-1){
               tmp =  tmp.substring(0,tmp.length()-1);
            }
            arr[i] = Long.parseLong(tmp);
        }
        System.out.println(binarySearch(arr, 19, 0, split.length - 1));
//        System.out.println(5);
    }
}
