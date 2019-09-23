package wangyi;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class 完美的序列 {


    public static void main(String[] args) {




        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int[] arr2=new int[t];
        for (int i=0;i<t;i++){
            int n=sc.nextInt();
            int[]arr=new int[n];
            int index=1;
            int max=0;
            int sum=0;
            for (int j=0;j<n;j++){
            arr[j]=sc.nextInt();
            if (j==0){
                sum=arr[0];
            } if (j>0){ if (arr[j]>=sum){
                index++;
                sum+=arr[j];
            }else {
                sum=arr[j];
                max=max>index?max:index;
                index=1;
            }
            }
        }
            arr2[i]=max;
        } for (int i=0;i<t;i++){
            System.out.println(arr2[i]);
        }
    }
}
