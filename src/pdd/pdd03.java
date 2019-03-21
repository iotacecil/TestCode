package pdd;

import java.util.Arrays;
import java.util.Scanner;
class House{
    int wz;
    int money;

    public House(int wz, int money) {
        this.wz = wz;
        this.money = money;
    }
}
public class pdd03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        House[] arr = new House[n];
//        int[] arr = new int[n];
//        int[] money = new int[n];
//        pdd.House[] cnt = new pdd.House[1_000_000_00];

        for (int i = 0; i <n ; i++) {
//            pdd.House h = new pdd.House(sc.nextInt(),sc.nextInt());
//            cnt[h.wz] = h;
            arr[i] = new House(sc.nextInt(),sc.nextInt());
//            arr[i].wz = sc.nextInt();
//            arr[i].money = sc.nextInt();
        }
      //  Arrays.sort(arr,(a,b)->(b.money-a.money));
        Arrays.sort(arr,(a,b)->(b.wz-a.wz));
        int max = 0;
        int i = 0;
        int j = 0;
        while (j<n){
            if(arr[j].wz-arr[i].wz<=d){
                max = Math.max(max,arr[j].money+arr[i].money);
                j++;
            }else{
                while (i++<j){

                    max = Math.max(max,arr[j].money+arr[i].money);
                }

                j++;
            }
        }

        System.out.println(max);
    }
}
