package tx03;

import java.util.Scanner;

public class tx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ajicnt = 0;
//        int aoucnt = 0;
        int bjicnt = 0;
        for (int i = 0; i <n ; i++) {
            long a = sc.nextLong();
            if(a%2==1)ajicnt++;
        }
        for (int i = 0; i <m ; i++) {
            long b = sc.nextLong();
            if(b%2==1)bjicnt++;
        }
//        System.out.println(ajicnt);
//        System.out.println(bjicnt);
        int ajibou = Math.min(ajicnt,m-bjicnt);
        int aoubji = Math.min(n-ajicnt,bjicnt);
        System.out.println(ajibou+aoubji);

    }
}
