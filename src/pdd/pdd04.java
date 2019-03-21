package pdd;

import java.util.Scanner;

public class pdd04 {

    static class Count {
        int v;
    }
    static int mod = 1_000_000_000+7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        Count count = new Count();
        count.v = 0;
        search(s1, s2, 0, count);
        System.out.println(count.v);
    }

    public static void search(String s1, String s2, int stack, Count count) {
        if (s1.length() == 0 && s2.length() == 0) {
            if (stack == 0) {
                count.v = (count.v + 1)%mod;
                return;
            }
        }
        int substack1 = stack%mod;
        int substack2 = stack%mod;
        if (s1.length() > 0) {
            char c1 = s1.charAt(0);
            if (c1 == '(') {
                substack1 = (substack1+1)%mod;
            } else if (c1 == ')') {
                substack1 = (substack1-1)%mod;
            }
            if (substack1 < 0) return;
            else search(s1.substring(1), s2, substack1, count);
        }
        if (s2.length() > 0) {
            char c2 = s2.charAt(0);
            if (c2 == '(') {
                substack2 = (substack2+1)%mod;

            } else if (c2 == ')') {
                substack2 = (substack2-1)%mod;

            }
            if (substack2 < 0) return;
            else search(s1, s2.substring(1), substack2, count);
        }

    }
}
