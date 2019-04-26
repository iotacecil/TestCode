package xc;

import java.util.*;
class ListNode{
    String val;
    ListNode next;
    ListNode(String x){
        val = x;
        next = null;
    }
}
/*
[1,2,3,4,5]
3
 */
public class xc02 {
    public static ListNode reverseKGroup(ListNode head,int k){
        ListNode cur = head;
        int cnt = 0;
        while(cur !=null && cnt !=k){
            cur = cur.next;
            cnt++;
        }
        if(cnt == k){
            cur = reverseKGroup(cur,k);
            while(cnt-->0){
                ListNode tmp = head.next;
                head.next = cur;
                cur = head;
                head = tmp;
            }
            head = cur;
        }
        return head;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例

        String str = in.next();
        int k = in.nextInt();
        System.out.println(k);
        str = str.replaceAll("[\\[|\\]]","");

        String[] strs = str.split(",");
        System.out.println(Arrays.toString(strs));
        ListNode dumy = new ListNode("");
        ListNode p = dumy;
        for(int i =0;i<strs.length;i++){

            p.next = new ListNode(strs[i]);
            p = p.next;
        }
        reverseKGroup(dumy.next,k);
        p = dumy.next;
        System.out.println(p.val);
        System.out.print("[");
        int i = 0;
        while(i<strs.length){
            System.out.print(p.val);
            if(i!=strs.length-1){
                System.out.print(",");
            }
            p = p.next;
        }
        System.out.print("]");

        //  }
    }
}