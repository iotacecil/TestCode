package tx;

import java.util.Scanner;

public class tx6 {

    public static String minWindow(String s, String t) {
        int[] ch = new int[128];
        for(char c:t.toCharArray()){
            ch[c]++;
        }
        int begin = 0,end = 0;
        int d = Integer.MAX_VALUE;
        int head=0;
        int count = t.length();
        while (end<s.length()){
            if(ch[s.charAt(end++)]-->0)count--;
            while (count==0){
                if(end-begin<d)d = end-(head=begin);
                if(ch[s.charAt(begin++)]++==0)count++;
            }
        }
        return d == Integer.MAX_VALUE?"":s.substring(head,head+d );

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <n ; i++) {
            int tmp = sc.nextInt();
            sb.append("_"+tmp+"#");
        }

        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i <m ; i++) {
            sb2.append("_"+(i+1)+"#");
        }


//        System.out.println(minWindow(sb.toString(), sb.toString()));
        System.out.println(sb.toString());
        System.out.println(sb2.toString());
        System.out.println(minWindow(sb.toString(), sb2.toString()).length());
    }
}
