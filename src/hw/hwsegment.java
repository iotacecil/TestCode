package hw;

import java.util.*;

class ST{
    class SegmentTreeNode {
        public int start, end, max;
        public SegmentTreeNode left, right;
        public SegmentTreeNode(int start, int end, int max) {
            this.start = start;
            this.end = end;
            this.max = max;
            this.left = this.right = null; }
//    @Override
//    public String toString() {
//        Queue<SegmentTreeNode> q = new ArrayDeque<>();
//        StringBuilder sb = new StringBuilder();
//        sb.append("[");
//        q.add(this);
//        while (!q.isEmpty()) {
//            SegmentTreeNode top = q.remove();
//            sb.append("["+top.start+","+top.end+", max="+top.max+"]");
//            if (top.left != null) {
//                q.add(top.left);}
//            if (top.right != null) {
//                q.add(top.right);
//            }
//        }
//        sb.append("]");
//        return sb.toString();
//
//    }
    }

    public  SegmentTreeNode build(int[] A){

        return build(A,0,A.length-1);
    }
    private SegmentTreeNode build(int[] A,int start,int end){
        if(start==end){return new SegmentTreeNode(start,end,A[start]);}
        SegmentTreeNode root = new SegmentTreeNode(start,end,Integer.MIN_VALUE);
        int left = (start+end)/2;
        root.left = build(A,start ,left );
        root.right = build(A,left+1,end);
        root.max = Math.max(root.left.max, root.right.max);
        return root;

    }
    public int query(SegmentTreeNode root,int start,int end){
        if(start>end)return 0;
        if(root.start==root.end)return root.max;
        int mid = (root.start+root.end)/2;
        //分割当前查询区间，如果和左边有交集，则查找左边最大值
        int left = query(root.left,start,Math.min(mid,end));
        //mid = 4,query(5,4)
        int right = query(root.right,Math.max(start,mid+1),end);
        return Math.max(left,right);
    }
    public void modify(SegmentTreeNode root, int index, int value) {
        if(index>root.end&&index<root.start)return;
        if(index==root.start&&root.end==index){
            root.max = value;
            return;
        }
        int mid = (root.start+root.end)/2;
        if(mid>=index){
            modify(root.left,index,value);
        }else{
            modify(root.right,index,value);
        }
        root.max = Math.max(root.left.max,root.right.max);
    }
}
public class hwsegment {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            List<Integer> rst = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
//        System.out.println(Arrays.toString(arr));
            ST st = new ST();
            ST.SegmentTreeNode root = st.build(arr);
            for (int i = 0; i < m; i++) {
                String query = sc.next();
//            System.out.println(query);
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (query.equals("Q")) {
                    if (b < a) {
                        int tmp = a;
                        a = b;
                        b = tmp;
                    }
                    rst.add(st.query(root, a - 1, b - 1));
                } else if (query.equals("U")) {

                    st.modify(root, a - 1, b);
                }

            }
            for (int r : rst) {
                System.out.println(r);
            }
        }
    }

}
