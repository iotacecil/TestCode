package kx;

import java.util.Scanner;

public class 升序排列 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] cnt = new int[10];
        for(char c:str.toCharArray()){
            if(c>='0'&&c<='9'){
                cnt[c-'0']++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <10 ; i++) {
            while (cnt[i]>0){
                sb.append(i);
                cnt[i]--;
            }
        }
        if(sb.length()==0){
            System.out.print(-1);
//            return;
        }else{
            System.out.print(sb.toString());
        }
    }
}
