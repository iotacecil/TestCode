package cd;

import java.util.Scanner;


public class 糖果 {

// 最大团？

    /*进行深度搜索*/
    private static void backTrack(int t) { //t：当前扩展节点在第t层
        if(t>=n) {    //达到根节点  记录可行解 并记录此时节点数目
            for(int i=0;i<n;i++)
                bestx[i]=x[i];
            bestn=cn;
            return;
        }

        if(place(t)) {       //判断是否满足约束条件（边是否连通）-->左子树-->把节点加入团中
            x[t]=1;          //左子树 标记为1
            cn++;            //当前节点数+1

            backTrack(t+1);  //继续搜索t+1层
            cn--;            //回溯   加多少就减多少   回退
        }

        if(cn+ n-t> bestn) {  //满足限界条件  -->右子数
            x[t]=0;
            backTrack(t+1);
        }


    }

    private static boolean place(int t) {  //判断是否可以把节点t加入团中
        boolean ok=true;
        for(int j=0;j<t;j++) {
            if(x[j]==1&& !map[t][j]) {
                ok=false;
                break;
            }
        }

        return ok;

    }


    private static int maxDiv(int a,int b){
        // a 大
        if(a<b){
            int tmp  =  a;
            a = b;
            b = tmp;
        }
        while (a%b!=0){
            int tmp = b;
            b = a%b;
            a = tmp;
        }
        return b;

    }
//    public static int n;          //默认定义数组大小

    static int max;
    static int bestn;                 //记录最优值
    static int cn;                    //当前已放入团中的节点数量
    static int n;                   //n为图中节点数  m为图中边数
    static boolean[][] map;   //图用邻接矩阵表示
    static int [] x;       //是否将第i个节点加入团中
    static int [] bestx;   //记录最优解


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        int[] candy = new int[n];
        for (int i = 0; i <n ; i++) {
            candy[i] = sc.nextInt();
        }
     map = new boolean[n][n];
        bestx=new int[n];
        x=new int[n];
        for (int i = 0; i <n-1 ; i++) {
            for (int j = i+1; j <n ; j++) {
                if(maxDiv(candy[i],candy[j])>1){
                    map[i][j] = true;
                    map[j][i] = true;
                }
            }
        }
        bestn=0;                     //初始最优值为0
        cn=0;                        //初始的团中节点也为0
        backTrack(0);                //从第一个节点进行深度搜索


//        max =0;
//        boolean[] used = new boolean[n];
//        for (int i = 0; i <n ; i++) {
//            if(!used[i]){
//                dfs(map,used,i,1);
//            }
//        }
        System.out.println(bestn);

    }

    //2 7 13
//    private static void dfs(boolean[][] map, boolean[] used,int idx,int cnt){
//        max = Math.max(max,cnt);
//        used[idx] = true;
//        for (int i = 0; i <used.length ; i++) {
//            if(map[idx][i] && !used[i]){
//                dfs(map,used,i,cnt+1);
//            }
//
//        }
//    }
}

/*

9
20 50 22 74 9 9 9 9 9



 */
