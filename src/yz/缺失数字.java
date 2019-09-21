package yz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 缺失数字 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list  = new ArrayList<>();
        while (sc.hasNext()){
            list.add(sc.nextInt());
        }
        System.out.println(lack(list));
    }

    private static Integer lack(List<Integer> source){
        int rst = 0;
        int i =0;
        for (; i <source.size() ; i++) {
            rst = rst ^ i ^ source.get(i);
        }

        return rst^i;
    }
}
