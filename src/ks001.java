import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ks001 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.next().split(",");
        int n = arr.length;
        int level = 0;
        boolean found = true;
        for (int i = 0; i <n/2 ; i++) {
            if(arr[i].equals("None"))continue;
            int cur = Integer.valueOf(arr[i]);
            int lidx = 1+(i<<1);
            int left = -1;
            if(!arr[lidx].equals("None")){
                left = Integer.valueOf(arr[lidx]);}
            int right = Integer.MAX_VALUE;
            if(!arr[lidx+1].equals("None")){
                right = Integer.valueOf(arr[lidx+1]);}
            if(left>=cur||right<=cur){
                System.out.println("False");
                found = false;
                break;
            }
//            if(i == 2*(Math.pow(2,level)-1)){
//                level++;
//            }
        }
        if(found)
        System.out.println("True");


    }
}
