package pdd7;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
//平均返回时长：执行完时刻-接到任务的时刻
public class 手动执行2019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] pi = new int[n];
        List<Integer>[] yilai = new ArrayList[n];

        for (int i = 0; i <n ; i++) {
            pi[i] = sc.nextInt();
            yilai[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i <m ; i++) {
            Integer a = sc.nextInt()-1;
            Integer b = sc.nextInt()-1;
            yilai[b].add(a);
        }

        boolean[] used = new boolean[n];
        for (int i = 0; i <n ; i++) {
            int minidx=-1;
            int minproce = Integer.MAX_VALUE;
            for (int j = 0; j <n ; j++) {
                if (!used[j] && yilai[j].size() == 0) {
                    if (pi[j] < minproce) {
                        minidx = j;
                        minproce = pi[j];
                    }
                }
            }
                used[minidx] = true;
            for (int j = 0; j <n ; j++) {
                if(!used[j]&&yilai[j].size()!=0) {
                    yilai[j].remove((Integer) minidx);
                }

            }

                if(i==n-1){
                    System.out.println(minidx+1);

                }else
                System.out.print(minidx+1+" ");

            }


    }
}
