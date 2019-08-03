package pdd7;

import sun.text.resources.cldr.ia.FormatData_ia;

import java.lang.reflect.Array;
import java.util.*;

// 10 9 每一层只有一块积木
// 每层边长比下方小
// 上面重量只能自重7倍
// 每个高1   9x7-> 10,9 ...+7

//10
//1 2 3 4 5 6 7 8 9 10
//        1 1 1 1 1 1 1 1 1 10
//
public class 搭积木2019 {

    // 只有一块积木 dp[i][l][w] = 1
    // 两块 dp[i-1][l<?][w<?] +1
//    private int dpway(int[] L, int[] W, int maxL, int maxW) {
////        int[] shorter = new int[L.length];
////        for (int i = 0; i <L.length ; i++) {
////            int cnt = 0;
////            for (int j = 0; j <L.length ; j++) {
////                if(i==j)continue;
////                if(L[j]<L[i])cnt++;
////            }
////            shorter[i] = cnt;
////        }
//        int[][] dp = new int[L.length+1][maxL][maxW];
//        for (int i = 1; i <L.length+1 ; i++) {
//            for (int j = L[i]; j < ; j++) {
//
//            }
//        }
////        for (int i = 0; i < ; i++) {
////
////        }
//    }

    private static class Block{
        int L;
        int W;

        public Block(int l, int w) {
            L = l;
            W = w;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] L = new int[n];
        int[] W = new int[n];
        Block[] blocks = new Block[n];

//        int maxL = 0;
        for (int i = 0; i < n; i++) {
            L[i] = sc.nextInt();

//            maxL = Math.max(maxL, L[i]);
        }

//        int maxW = 0;
        for (int i = 0; i < n; i++) {
            W[i] = sc.nextInt();
//            maxW = Math.max(maxW, W[i]);
        }
        for (int i = 0; i <n ; i++) {
            blocks[i] = new Block(L[i],W[i]);

        }
        Arrays.sort(blocks,(a,b)->a.L==b.L?b.W-a.W:b.L-a.L);





        boolean[] used = new boolean[n];
        for (int i = 0; i < n; i++) {
            used[i] = true;
            dfs(L, W, used, L[i], W[i] * 7, 1);
            used[i] = false;

        }
        System.out.println(maxH);
    }

    private static String geState(boolean[] used, int l, int W){
      StringBuilder sb = new StringBuilder();
        for (int i = 0; i <used.length ; i++) {
            sb.append(used[i]?1:0);
        }
        sb.append("_").append(l).append("_").append(W);
        return sb.toString();
    }
    static int maxH =0;
//    static Set<String> memo = new HashSet<>();

    private static void dfs(int[]L,int[]W,boolean[] used,int lastL,int mostW,int tmp){
//        String key = geState(used, lastL, mostW);
//        if(memo.contains(key))return;
        maxH = Math.max(maxH,tmp);
//        memo.add(key);
        for (int i = 0; i <L.length ; i++) {
            if(used[i])continue;
            if(L[i]<lastL && W[i] <= mostW){
                used[i] = true;
                int nextW = Math.min(mostW-W[i],W[i]*7);
               // System.out.println(nextW);
                dfs(L,W,used,L[i],nextW,tmp+1);
                used[i] = false;
            }
        }

    }
}
