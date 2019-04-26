package qh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class qh02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <n ; i++) {
//            arr[i] = sc.nextInt();
            list.add(sc.nextInt());
        }
        //0 升序 1降序
        for (int i = 0; i <m ; i++) {
            int down = sc.nextInt();
            int mm = sc.nextInt();
            if(down==1){

//                System.out.println(list.subList(0,mm));
                list.subList(0,mm).sort((a,b)->b-a);
//                System.out.println(list.subList(0,mm));

//                Arrays.sort(arr,0,sc.nextInt());
            }else if(down==0){
                list.subList(0,mm).sort((a,b)->a-b);
            }
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(list.get(i));
            if(i!=n-1) System.out.print(" ");

        }

    }
}
