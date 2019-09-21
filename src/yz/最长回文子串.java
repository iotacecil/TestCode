package yz;

import java.util.Scanner;

public class 最长回文子串 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        System.out.println(getResultString(str));
    }

    private static String getResultString(String s){
        int n = s.length();
        if(n < 2)return s;
        int max = 1;
        String str = s.charAt(0)+"";
        for (int i = 0; i <n - 1 ; i++) {
            int ji = help(s,i,i);
            int ou = help(s,i,i+1);
            if(ji > ou && ji > max){
                max = ji;
                str = s.substring(i - max/2,i + max/2 + 1);
            }else if(ou > ji && ou > max){
                max = ou;
                str = s.substring(i - max/2 + 1,i+max/2+1);
            }
        }

        return str;
    }


    private static int help(String s,int l,int r){
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;r++;
        }
        return r-l-1;
    }
}
