package tx;

import java.util.Scanner;

public class tx2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int cnt = 0;
        for (int i = n; i >0 ; i--) {

            int tmp = m/i;
            if(m<=i){
                cnt++;break;
            }
            cnt += tmp;
            m -=  tmp*i;
        }
        System.out.println(cnt);
    }
}
