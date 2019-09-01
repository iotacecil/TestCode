package tx03;

import java.util.Scanner;

public class tx03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] xiangzi = new long[n];
        long sum = 0;
        long max = 0;
        for (int i = 0; i <n ; i++) {
            xiangzi[i] = sc.nextLong();
            sum+=xiangzi[i];
            max = Math.max(max,xiangzi[i]);
        }
//        if(m>sum){
//            System.out.println(n+1);
//            return;
//        }else{
           int idx = 0;
           int cnt = 1;
           int nxt = m;
           while (idx<n){
               if(nxt>xiangzi[idx]){
                   idx+=1;
                   cnt++;
               }else if(nxt==xiangzi[idx]){
                   cnt+=2;
                   idx++;
               }else{
                   // 3 -2 = 1
                   while (xiangzi[idx]>=nxt){

                       xiangzi[idx]-=nxt;

                       cnt++;
                   }
                   // left = 1
                   long left = m-xiangzi[idx];
//                   int j = idx+1;
//                   while (j<n&&left>0){
//                       if(xiangzi[j]>=left){
//                           xiangzi[j]-=left;
//                           left=0;
//                       }else{
//                           //left-=xiangzi[j];
//                          // xiangzi[j] = 0;
//                           j++;
//                       }
//                   }
                   idx++;
               }
           }
            System.out.println(cnt);
            //1 1
            //2

//        }
    }

    /*
    4 2
3 4 5 4
     */
}
