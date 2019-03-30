import java.util.Scanner;

public class ks01 {

    public static int movingCount(int threshold, int rows, int cols)
    {
        if(threshold<0 || rows<=0 || cols<=0){
            return 0;
        }
        int count = 0;
        boolean[] flag = new boolean[rows*cols];
        for(int i=0; i<rows*cols; i++){
            flag[i] = true;
        }
        count = Moving(threshold, 0, 0, rows, cols, flag);
        return count;
    }

    public static int Moving(int t, int row, int col, int rows, int cols, boolean[] flag){
        int count = 0;
        if(isAllow(t, row, col, rows, cols, flag)){
            flag[row*cols+col] = false;
            count = 1+Moving(t, row-1, col, rows, cols, flag)+Moving(t, row, col-1, rows, cols, flag)+Moving(t, row+1, col, rows, cols, flag)+Moving(t, row, col+1, rows, cols, flag);
        }
        return count;
    }

    //计算坐标的位数和，返回与threshold的比较结果
    public static boolean isAllow(int t, int row, int col, int rows, int cols, boolean[] flag){
        if(row>rows ||row<0 || col>cols || col<0 || row*cols+col>rows*cols-1|| flag[row*cols+col]==false){
            return false;
        }
        int sum = 0;
        char[] chs = (row+"").toCharArray();
        char[] chs1= (col+"").toCharArray();
        for(char ch: chs){
            sum += Character.getNumericValue(ch);
        }
        for(char ch1: chs1){
            sum += Character.getNumericValue(ch1);
        }
        return sum<=t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(movingCount(k, n, m));
    }
}
