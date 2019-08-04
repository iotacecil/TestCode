package wy;

import java.util.Arrays;
import java.util.Scanner;
//偶+奇 = 奇
public class 序列交换2019 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        int ou = 0;
        for (int i = 0; i <n ; i++) {
            a[i] = sc.nextLong();
            if(a[i]%2==0)ou++;
        }
        if(ou==0){
            for (int i = 0; i <n ; i++) {
                if(i!=n-1)
                System.out.print(a[i]+" ");
                else
                System.out.println(a[i]);

            }
            return;
        }else{


                Arrays.sort(a);

                for (int i = 0; i < n; i++) {
                    if (i != n - 1)
                        System.out.print(a[i] + " ");
                    else
                        System.out.println(a[i]);

                }



        }


//        System.out.println(Arrays.toString(a));


    }

    private void swap(int[] arr,int i,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
