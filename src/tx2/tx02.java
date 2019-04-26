package tx2;

import java.util.Scanner;

/*
4
1100
0
 */
public class tx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int zc = 0;
        int oc = 0;
        for (int i = 0; i <n ; i++) {
            if(str.charAt(i)=='0')zc++;
            else if(str.charAt(i)=='1')oc++;
        }
        System.out.println(Math.abs(zc-oc));
    }
}
