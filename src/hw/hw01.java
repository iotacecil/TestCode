package hw;

import java.util.Arrays;
import java.util.Scanner;

public class hw01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] strs = str.split("\\+|\\-");
        String[] ops = str.split("[0-9]");

        long rst =  Integer.valueOf(strs[0]);;
//        System.out.println(Arrays.toString(strs));
//        System.out.println(Arrays.toString(ops));
        int j = 0;
        for (int i = 1; i <strs.length ; i++) {
            Integer b = Integer.valueOf(strs[i]);
//            System.out.println(b);
            while (ops[j].equals(""))j++;
//            System.out.println(ops[j]);
            if(ops[j].equals("-")){
                rst-= b;
            }else if(ops[j].equals("+")){
                rst+=b;
            }
            j++;

        }
        System.out.println(rst);
    }
}
