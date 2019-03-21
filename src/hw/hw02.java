package hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ForkJoinTask;

//SxxsrR^AaSs
public class hw02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] up = new int[26];
        int[] low = new int[26];
        for (int i = 0; i <str.length() ; i++) {
            char c = str.charAt(i);
            if(c>='a'&&c<='z'){
                low[c-'a']++;
            }else if(c>='A'&&c<='Z'){
                up[c-'A']++;
            }
        }
        System.out.println(Arrays.toString(up));
        System.out.println(Arrays.toString(low));
List<String> rst = new ArrayList<>();
        boolean first = true;

//        boolean over = false;
        out:
        while (true) {

            int ol = 0;
            int or = 0;
//            int left = 0;
//            int right = 0;

            int maxlen = 0;
            for (int left = 0; left <26 ; left++) {
                if(up[left]==0||low[left]==0)continue ;
                int right = left+1;
                while (right<26&&up[right]!=0&&low[right]!=0){
                    right++;
                }
                if((right-left)>maxlen){
                    ol = left;
                    or = right;
                    maxlen = (right - left);
                }
            }
            if(maxlen==0)break out;
//
            String tmp = "";
            System.out.println(Arrays.toString(low));
            System.out.println(Arrays.toString(up));
//            System.out.println(ol + " " + or);
            for (int j = ol; j < or; j++) {
//            System.out.println(ol + " " + or);

                tmp += (char) ('A' + j);
                tmp += (char) ('a' + j);
                up[j]--;
                low[j]--;
            }
            first = false;
            if(tmp.length()<1)break out;
//            System.out.println(tmp);
            rst.add(tmp);
            int k = 0;
            while (k<26&&low[k] == 0&&up[k] == 0)k++;
            if(k == 26)break out;

        }
        rst.sort((a,b)->(a.charAt(0)-b.charAt(0))==0?(b.length()-a.length()):(a.charAt(0)-b.charAt(0)));
        for(String s:rst){
            System.out.println(s);
        }
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i <26 ; i++) {
//            if(low[i]>0&&up[i]>0){
//                if(tmp.length()==0 ||(tmp.charAt(tmp.length()-1)-'a')==i-1){
//                    tmp+=((char)('A'+i)+(char)('a'+i));
//                    low[i]--;
//                    up[i]--;
//                }
//
//            }

//        }
    }
}
