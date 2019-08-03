package pdd7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pdd2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = bf.readLine().split(" ");
        if(strs.length==1){
            if(strs[0].charAt(0)==strs[0].charAt(strs[0].length()-1)){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
        }
        boolean[] used = new boolean[strs.length];
        for (int i = 0; i <strs.length ; i++) {
            used[i] = true;
            if(isOk(strs,used,0,strs[i].charAt(strs[i].length()-1),strs[i].charAt(0))){
                System.out.println("true");
                return;
            }
            used[i] = false;

        }
        System.out.println("false");
    }
    private static boolean isOk(String[] strs,boolean[] used,int num,char last,char start){
//        System.out.println(last);
      //  System.out.println(num);
        if(num==strs.length-1 && last == start){
            return true;
        }

        for (int i = 0; i <strs.length ; i++) {
            if(!used[i]&&strs[i].charAt(0)==last){
                used[i] = true;
           //     System.out.println(strs[i]);
                if(isOk(strs,used,num+1,strs[i].charAt(strs[i].length()-1),start)){
                    return true;
                }
                used[i] = false;
            }

        }
        return false;
    }
}
