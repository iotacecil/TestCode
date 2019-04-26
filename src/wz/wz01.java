package wz;

import java.util.*;

public class wz01 {
//    private static int cir(int n,int m){
//        int p = 0;
//        for (int i = 2; i <=n ; i++) {
//            p = (p+m)%i;
//        }
//        return p+1;
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[] visit = new boolean[n+1];
        int s = 0;
        for (int k = 0; k <n ; k++) {
            for (int i = 0; i <m ; i++) {
                if(++s>n){
                    s=1;
                }
                if(visit[s]){
                    i--;
                }
                System.out.print(s+" ");
                visit[s] = true;

            }

        }


//        Deque<Integer> que = new LinkedList<>();
//        for (int i = 1; i <=n ; i++) {
//            que.add(i);
//        }
//        int idx = 0;
//        while (que.size()>0){
//            idx++;
//            Integer num = que.poll();
//            if(idx==m){
//                idx = 0;
//                System.out.print(num);
//                if(que.size()!=1)
//                    System.out.print(" ");
//                else System.out.print("\n");
//                continue;
//            }
//            que.add(num);
//            if(que.size()==1) {
//
//                System.out.println(num);
//                break;
//            }
//        }
    }
}
