//import java.util.*;
//
//public class xc {
//    public static boolean hasCycle(ListNode head){
//        ListNode slow = head;
//        ListNode fast = head;
//        while(fast!=null){
//            slow = slow.next;
//            if(fast.next == null)return false;
//            fast = fast.next.next;
//            if(slow == fast)return true;
//        }
//        return false;
//    }
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//            String str = in.next();
//            System.out.println(str);
//            String[] strs = str.split(",");
//            ListNode dumy = new ListNode(0);
//            ListNode p = dumy;
//            for(int i =0;i<strs.length;i++){
//                char c = strs[i].charAt(0);
//                System.out.println(c);
//                p.next = new ListNode(c);
//                p = p.next;
//            }
//            System.out.println(hasCycle(dumy.next));
//
//
//    }
//}