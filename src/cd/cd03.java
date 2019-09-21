package cd;

import java.util.ArrayDeque;
import java.util.Deque;

public class cd03 {
    private static String jianhua(String str){
        String[] strs = str.split("/");
        Deque<String> stk = new ArrayDeque<>();
        for(String s : strs){

            if(s.equals("") || s.equals("."))continue;
            if(s.equals("..") && !stk.isEmpty()){
                stk.pop();
            }else {
                stk.push(s);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stk.isEmpty()){
            sb.insert(0,"/"+stk.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str1 = "/home//foo/";
        String str2 = "/a/./b/../../c/";
        String str3 = "/a//b////c/d//././/..";
        System.out.println(jianhua(str1));
        System.out.println(jianhua(str2));
        System.out.println(jianhua(str3));

    }
}
