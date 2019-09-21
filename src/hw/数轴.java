package hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class 数轴 {
/*
A={1,3,5},B={2,4,6},R=1
 */
    private static void print(List<Integer> a,List<Integer> b, int R){
        int i = 0;
        int j = 0;
        int n = a.size();
        int m = b.size();
        while (i < n){
            int A = a.get(i);
            int idx = Collections.binarySearch(b, A);
            if(idx<0){
                idx = -(idx+1);
            }
            while (idx < m){
                int B = b.get(idx);
                if(A<=B && B-A <= R){
                    if(i==n-1){
                        System.out.print("("+A+","+B+")");

                    }
                    else{
                        System.out.print("("+A+","+B+") ");

                    }
                    idx++;
                }else{
                    break;
                }
            }
            i++;

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = bf.readLine().split("A|B|R|=");
        int i = 0;
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        boolean aa = true;
        while (i < tmp.length){
            if(tmp[i].trim().equals("")){
                i++;
                continue;
            }
            if(aa&&tmp[i].trim().charAt(0)=='{'){
                String[] ttp = tmp[i].trim().split("\\{|\\}|,");
                for(String tt : ttp){
                    if(tt.trim().equals(""))continue;
                    a.add(Integer.parseInt(tt));
                }
                aa = false;
            }else if(!aa && tmp[i].trim().charAt(0)=='{'){
                String[] ttp = tmp[i].trim().split("\\{|\\}|,");
                for(String tt : ttp){
                    if(tt.trim().equals(""))continue;
                    b.add(Integer.parseInt(tt));
                }
                i++;
                break;
            }
            i++;
        }

        int R = 0;
       while (i<tmp.length){
//           System.out.println(tmp[i]);
           if(tmp[i].trim().equals("")){
               i++;
               continue;
           }
           R = Integer.parseInt(tmp[i]);
           break;
       }
        print(a,b,R);
    }
}
