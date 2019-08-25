package cd;

import java.util.Scanner;

public class 豆油瓶 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] map = new int[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        boolean[] visited = new boolean[n];
        int cnt = 0;
        for (int i = 0; i <n ; i++) {
            if(!visited[i]){
                dfs(map,visited,i);
                cnt++;
            }

        }
        System.out.println(cnt);
    }
    private static void dfs(int[][] map,boolean[] visited,int user){
        visited[user]=true;
        for (int i = 0; i <visited.length ; i++) {
            if(map[user][i]>=3 && !visited[i]){
                dfs(map,visited,i);
            }
        }

    }
}
