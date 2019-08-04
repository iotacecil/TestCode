package wy;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class 字符串缩写2019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            String str = sc.next();
            StringBuilder sb =new StringBuilder();
            int i = 0;
            while (i<str.length()) {
                //abcd len=4
                if(i<=str.length()-4){
                    int cnt = 1;

                    int sidx = i;
                    while (i+1<str.length()&&str.charAt(i)+1 == str.charAt(i+1)){
                        cnt++;
                        i++;
                    }
                    if(cnt>=4){
                        sb.append(str.charAt(sidx)).append("-").append(str.charAt(i));

                    }else{
                        sb.append(str.substring(sidx,sidx+cnt));

                    }
                    i++;
//                    System.out.println(sb.toString());
//                    System.out.println(cnt);

                }else{
                    sb.append(str.charAt(i));
                    i++;
                }
                //System.out.println(sb.toString());
            }
            System.out.println(sb.toString());
        }
    }
}
