package ali;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class 团体 {
/** 请完成下面这个函数，实现题目要求的功能 **/
    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    static String getIndexAndLongest(String users,int k) {


        int n = users.length();
        int last = 0;
//        int cnt = 0;
        int maxtuan = 0;
        List<Integer> que = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            if(users.charAt(i)=='g'){
               que.add(i);
            }
        }
        int rr = Math.min(que.size()-1,k);
        maxtuan = que.get(rr);

        for (int i = 1; i+k <que.size() ; i++) {
            maxtuan = Math.max(maxtuan,que.get(i+k)-i);
        }
        maxtuan = Math.max(n-que.get(que.size()-k),maxtuan);


        int maxcnt = 0;
        int boyid = -1;
        for (int i = 0; i <n ; i++) {
            int l = i-1;
            int r = i+1;
            int cnt  = 0;

            if(users.charAt(i)=='b') {
                while (l >= 0) {
                    if(users.charAt(l)=='g'){
                        cnt++;
                        l--;
                    }else{
                        break;
                    }
                }
                while (r < n) {
                    if(users.charAt(r)=='g'){
                        cnt++;
                        r++;
                    }else{
                        break;
                    }
                }
            }
            if(cnt>maxcnt){
                maxcnt = cnt;
                boyid = i;
            }

        }
return boyid+" "+maxtuan;


    }
   /*
   输入范例:
bgbbbgbggbgbg
3
输出范例:
6 6
    */

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;

        String _users;
        int k =0;
        try {
            _users = in.nextLine();
            k= in.nextInt();

        } catch (Exception e) {
            _users = null;
        }

        res = getIndexAndLongest(_users,k);
        System.out.println(res);
    }
}
