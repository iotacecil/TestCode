package tx;

import java.util.Queue;
import java.util.Scanner;

public class tx3 {
    public static int query(int start,int end){
        int sum = 0;
        int n = end-start+1;
        if((start&1)==0){
            sum += (n/2)*(-1);
            if((n&1)==1)sum+=end;
        }else{
            sum+= (n/2);
            if((n&1)==1)sum-=end;
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            System.out.println(query(sc.nextInt(),sc.nextInt()));

        }

    }
}
