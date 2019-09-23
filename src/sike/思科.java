package sike;

import java.util.Arrays;
import java.util.Scanner;

public class 思科 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        String str = "\"%22h%22h%22h\"<sip:";
//        String str = "\"Cisco\"<sip:";
        StringBuilder sb = new StringBuilder();
        int n = str.indexOf("<");
        if(str.charAt(n-1)=='"')n--;
//        System.out.println(n);
        int i = 1;
        if(i<n&&i+1<n && i+2<n &&str.charAt(1)=='%'&&str.charAt(2)=='2'&&str.charAt(3)=='2'){
            i+=3;
        }
        for (; i <n-3;) {
            sb.append(str.charAt(i++));
        }
        if(i<n&&i+1<n && i+2<n &&str.charAt(i)=='%'&&str.charAt(i+1)=='2'&&str.charAt(i+2)=='2'){
            i+=3;
        }
        while (i<n){
            sb.append(str.charAt(i++));
        }
        System.out.println(sb.toString());

    }
}
