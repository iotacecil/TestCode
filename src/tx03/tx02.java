package tx03;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class tx02 {
    static class node{
        long a;
        long b;

        public node(long a, long b) {
            this.a = a;
            this.b = b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //j(a-b)-a+bn
        //a-b的差越大，越不满意
//        PriorityQueue<node> pq = new PriorityQueue<>((a,b)->((a.a-a.b-a.a+a.b*n)-(b.a-b.b-b.a+b.b*n)==0?0:((a.a-a.b-a.a+a.b*n)-
//                (b.a-b.b-b.a+b.b*n)
//                >0?1:-1)));
//        List<node>nodes = new ArrayList<>();
        long rst = 0;
        List<Long> dif = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            rst+=(-a+b*n);
            dif.add(a-b);

        }
       dif.sort(Long::compare);

        for(Long score:dif){

                rst+=n*score;
                n--;

        }
        System.out.println(rst);
    }
}
