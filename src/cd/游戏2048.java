package cd;

import java.util.Arrays;
import java.util.Scanner;

public class 游戏2048 {

    // 顺时针旋转90
    public static void rotate(int[][] matrix) {
       int n = 4;
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                if(i!=j){
                    int tmp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i]  = tmp;
                }

            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n/2 ; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = tmp;

            }

        }



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fx = sc.nextInt();
        int[][] map = new int[4][4];
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        // 1 向上，2 向下 ，3向左，4向右
        if(fx == 2){
            rotate(map);
            rotate(map);
        }else if(fx == 3){
            rotate(map);
        }else if(fx == 4){
            rotate(map);
            rotate(map);
            rotate(map);

        }

//        for (int i = 0; i <4 ; i++) {
//            for (int j = 0; j <4 ; j++) {
//                if(j==3){
//                    System.out.print(map[i][j]);
//
//                }else
//                    System.out.print(map[i][j]+" ");
//
//
//            }
//            System.out.println();
//
//        }

        //向上
        //3,0  3,1  3,2  3,3
        for (int i = 1; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                if(map[i][j]!=0){
                    int top = i-1;
                    int num = map[i][j];
                    while (top>=0){
                        int nxtnum = map[top][j];
                        if(nxtnum == 0){
                            map[top][j] = num;
                            map[top+1][j] = 0;

                        }else if(nxtnum== num){
                            map[top][j] = num*2;
                            map[top+1][j] = 0;
                            num = map[top][j];
                            break;
                        }else if(nxtnum>0)break;
                        top--;
                    }

                }
            }

        }

        //还要向上

        for (int i = 3; i >=0 ; i--) {
            for (int j = 0; j <4 ; j++) {
                if(map[i][j]!=0){
                    int top = i-1;
                    int num = map[i][j];
                    while (top>=0){
                        int nxtnum = map[top][j];
                        if(nxtnum == 0){
                            map[top][j] = num;
                            map[top+1][j] = 0;

                        }
                        top--;
                    }

                }
            }

        }

        if(fx == 2){
            rotate(map);
            rotate(map);
        }else if(fx == 3){
            rotate(map);
            rotate(map);
            rotate(map);


        }else if(fx == 4){
            rotate(map);



        }
        /*
1
0 2 2 2
0 2 2 2
0 2 2 2
0 2 2 2
         */

        /*
4
0 0 0 0
0 0 2 2
0 2 8 8
2 4 2 16

         */

        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                if(j==3){
                    System.out.print(map[i][j]);

                }else
                System.out.print(map[i][j]+" ");


            }
            System.out.println();

        }
    }
}
