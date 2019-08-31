package didi;

import java.util.*;
import java.util.stream.Collectors;

public class 算式转移2019 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
       String str =  sc.next();
        System.out.println(str);
//        List<Integer> add = new ArrayList<>();
//        List<Integer> add = new ArrayList<>();
        Deque<Integer> stk = new ArrayDeque<>();
        Deque<Character> stk2 = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
       int op = 1;
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if(ch==' ')continue;
            if(ch>='0'&&ch<='9'){
                if(stk.isEmpty() || stk.peek()>str.charAt(i)){
                    stk.add((ch-'0')*op);
                    op = 1;
                }else{
                    while (!stk.isEmpty()){
                        System.out.println(stk.pop()+" "+stk2.pop());
                    }
                }
            }else if(ch=='-')op=-1;
            else {
                stk2.add(ch);
            }



        }

    }
}
