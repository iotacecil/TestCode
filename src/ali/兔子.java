package ali;

import java.util.*;
/*
6
1,2,3,5,7,6
2,1,4,5,7,4
3,4,5,6,3,6
2,3,1,4,6,8
5,6,1,4,6,2
4,2,4,1,1,6
 */
public class 兔子 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        int n = Integer.parseInt(line);
        int[][] area = new int[n][n];

        for (int i = 0; i < n; i++) {
            line = scanner.nextLine();
            String[] split = line.split(",");
            if (split.length != n) {
                throw new IllegalArgumentException("错误输入");
            }
            int j = 0;
            for (String num : split) {
                area[i][j++] = Integer.parseInt(num);
            }
        }

        int minimumTimeCost = getMinimumTimeCost(n,area);
        System.out.println(minimumTimeCost);
    }

    /** 请完成下面这个函数，实现题目要求的功能 **/
    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    static class node{
        int cost;
        int[] xy;

        public node(int[] xy) {
            this.xy = xy;
        }

        public node(int cost, int[] xy) {
            this.cost = cost;
            this.xy = xy;
        }
    }
    static int[][] dirs = {{0,1},{1,0},{-1,0},{0,-1}};
    static int[][] dirs2 = {{0,2},{2,0},{-2,0},{0,-2}};
    private static int getMinimumTimeCost(int n, int[][] area) {
        int min = Integer.MAX_VALUE;
        boolean[][] visited = new boolean[n][n];
//        Arrays.fill(visited[0],true);
//        PriorityQueue<node> que = new PriorityQueue<>((a,b)->a.cost-b.cost);
        Deque<node> que = new ArrayDeque<>();
        for (int i = 0; i <n ; i++) {
            que.add(new node(0,new int[]{0,i}));
        }
        while (!que.isEmpty()){
            node top = que.poll();
            visited[top.xy[0]][top.xy[1]] = true;
//            System.out.println(Arrays.toString(top.xy));
            if(top.xy[0]==n-1){
//                return top.cost;
                min = Math.min(min,top.cost);
            }
            for(int i = 0;i<4;i++){
                int nx = top.xy[0]+dirs2[i][0] >n-1?n-1:top.xy[0]+dirs2[i][0];
                int ny = top.xy[1]+dirs2[i][1]>n-1?n-1:top.xy[1]+dirs2[i][1];
                if(nx<n&&nx>0&&ny<n&&ny>0 && !visited[nx][ny]){
                    int jx = top.xy[0]+dirs[i][0];
                    int jy = top.xy[1]+dirs[i][1];
                    int nc = top.cost + area[jx][jy];
                    if(nc>min)continue;
//                    System.out.println(nx+" "+ny + " "+(area[jx][jy]));
                   que.add( new node(top.cost+area[jx][jy],new int[]{nx,ny}));
                }
            }
        }
        return min;


    }
}
