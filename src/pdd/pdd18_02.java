package pdd;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class pdd18_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger[] arr = new BigInteger[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextBigInteger();
        }

        Arrays.sort(arr);
        BigInteger ans1 = arr[0] .multiply(arr[1]).multiply( arr[2]);
        BigInteger ans2 = arr[0] .multiply( arr[1]) .multiply(arr[n - 1]);
        BigInteger ans3 = arr[n-1].multiply(arr[n-2]) .multiply(arr[n - 3]);
        if(ans1.compareTo(ans2)<0){
            ans1 = ans2;
        }
        if(ans1.compareTo(ans3)<0){
            ans1 = ans3;
        }
        System.out.println(ans1);
    }
}
