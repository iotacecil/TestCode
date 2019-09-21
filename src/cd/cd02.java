package cd;

import java.lang.invoke.CallSite;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class cd02 {
static class ListNode{
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        next = null;
    }
    private void print(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.val+"->");
        ListNode nxt = this.next;
        while (nxt!=null){
            sb.append(nxt.val+"->");
            nxt = nxt.next;
        }
        System.out.println(sb.toString());
    }


}

static class Node{
    ListNode nd;
    int carry;

    public Node(ListNode nd, int carry) {
        this.nd = nd;
        this.carry = carry;
    }
}

private static ListNode sum(ListNode node1,ListNode node2){
    Deque<ListNode> stk1 = new ArrayDeque<>();
    Deque<ListNode> stk2 = new ArrayDeque<>();
    while (node1!=null){
        stk1.push(node1);
        node1 = node1.next;
    }
    while (node2!=null){
        stk2.push(node2);
        node2 = node2.next;
    }
    int carry = 0;
    ListNode dumy = new ListNode(0);
    while (!stk1.isEmpty()&&!stk2.isEmpty()){
        ListNode nd1 = stk1.pop();
        ListNode nd2 = stk2.pop();
//        System.out.println(nd1.val+" "+nd2.val);
        int sum = nd1.val+nd2.val+carry;
        carry = sum / 10;
        ListNode cur = new ListNode(sum % 10);
        cur.next = dumy.next;
        dumy.next = cur;
    }

    while (!stk1.isEmpty()){
        ListNode nd1 = stk1.pop();
        int sum = nd1.val+carry;
        carry = sum/10;

        ListNode cur = new ListNode(sum % 10);
        cur.next = dumy.next;
        dumy.next = cur;
    }
    while (!stk2.isEmpty()){
        ListNode nd1 = stk2.pop();
        int sum = nd1.val+carry;
        carry = sum/10;

        ListNode cur = new ListNode(sum % 10);
        cur.next = dumy.next;
        dumy.next = cur;
    }
    if(carry>0){
        ListNode cur = new ListNode(carry);
        cur.next = dumy.next;
        dumy.next = cur;

    }
    return dumy.next;
//    if(node1.next==null &&node2.next==null){
//        int sum = node1.val+node2.val;
//        return new Node(new ListNode(sum%10),sum/10);
//    }
//    if(node1.next!=null){
//
//    }




}


    public static void main(String[] args) {
        ListNode six = new ListNode(6);
        ListNode three = new ListNode(3);
        ListNode five = new ListNode(5);
        ListNode eight = new ListNode(8);
        six.next = three;
        three.next = five;
        five.next = eight;

        ListNode one = new ListNode(1);
        ListNode four = new ListNode(4);
        ListNode three2 = new ListNode(3);
        one.next = four;
        four.next = three2;
        sum(six,one).print();



    }
}
