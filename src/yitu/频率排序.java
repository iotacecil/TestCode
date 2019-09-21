package yitu;

import java.util.*;

public class 频率排序 {
    static class Node{
        long num;
        int cnt = 1;
        int id;

        public Node(long num, int id) {
            this.num = num;
            this.id = id;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long C = sc.nextInt();
        HashMap<Long,Node> map = new HashMap<>();
        for (int i = 0; i <N ; i++) {
            long num = sc.nextInt();
            if (map.containsKey(num)) {
                map.get(num).cnt++;
            }else{
                map.put(num,new Node(num,i));
            }
        }
        Collection<Node> values = map.values();
        ArrayList<Node> nodes = new ArrayList<>(values);
        nodes.sort((a,b)->a.cnt==b.cnt?a.id-b.id:b.cnt-a.cnt);
        int cnt = 0;
       for(Node node : nodes){
           for (int i = 0; i <node.cnt ; i++) {
               if(cnt == N-1)
               System.out.print(node.num);
               else{
                   System.out.print(node.num+ " ");
               }
               cnt++;

           }
       }


    }
}
