package tx2;

import java.util.PriorityQueue;
import java.util.Scanner;

public class tx03 {
    static class Node {
        double wl;
        int jb;

        public Node(double wl, int jb) {
            this.wl = wl;
            this.jb = jb;
        }



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] wl = new double[N];
        int[] jb = new int[N];
        for (int i = 0; i <N; i++) {

            wl[i] = sc.nextInt();
        }
        for (int i = 0; i <N ; i++) {
            jb[i] = sc.nextInt();
        }
//       int dp[][] = new int[N+1][2*N+1];
        int cjb = jb[0];
        double cwl = wl[0];
        PriorityQueue<Node> que = new PriorityQueue<>((a,b)->(b.wl/b.jb)-(a.wl/a.jb)==0?(b.wl-a.wl)>0?1:-1:((b.wl/b.jb)
                -(a.wl/a.jb)>0?1:-1));
        for (int i = 1; i <N ; i++) {
            while (cwl < wl[i]){
                if(que.isEmpty())break;
                Node gs = que.poll();
                cjb+=gs.jb;
                cwl+=gs.wl;
            }
            if(cwl>=wl[i]){
                que.add(new Node(wl[i],jb[i]));
            }else{
                cjb+=jb[i];
                cwl+=wl[i];
            }
        }
        System.out.println(cjb);

//        for (int i = 0; i <N ; i++) {
//            for (int j = 0; j <N ; j++) {
//                dp[i]
//            }
//
//        }


    }
}
