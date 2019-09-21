package hw;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
/*
3
CZ7132,A1,ZHANGSAN
CZ7132,A2,ZHAOSI
CZ7156,A2,WANGWU
2
CZ7132,A1,CZ7156,A2
CZ7156,A2,CZ7156,A3

 */
public class 航班 {
    public static class jipiao{
        String id;
        String zuowei;
        String name;

        public jipiao(String id, String zuowei, String name) {
            this.id = id;
            this.zuowei = zuowei;
            this.name = name;
        }
    }
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        jipiao[] tickets = new jipiao[n];
        for (int i = 0; i <n ; i++) {
            String[] tmp = bf.readLine().split(",");
            tickets[i] = new jipiao(tmp[0],tmp[1],tmp[2]);
        }
        int m = Integer.parseInt(bf.readLine());
        HashMap<String,String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i <m ; i++) {
            String[] tmp = bf.readLine().split(",");
            map.put(tmp[0]+"_"+tmp[1],tmp[2]+"_"+tmp[3]);
        }

        for(jipiao ticket : tickets){
            String nt = ticket.id+","+ticket.zuowei+","+ticket.name;
            if(map.containsKey(ticket.id+"_"+ticket.zuowei)){
                 nt = map.get(ticket.id+"_"+ticket.zuowei).replace("_",",")+","+ticket.name;

            }
            if(set.contains(nt))continue;
            System.out.println(nt);
            set.add(nt);
        }
    }
}
